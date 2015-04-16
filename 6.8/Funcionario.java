class Funcionario {
	// Atributos (Variáveis)
	String nome;
	String departamento;
	private double salario;
	String dataEntrada;
	String numeroRG;
	
	// Atributo privado (só é visto pelo objeto proprietário)
	// Atributo estático, pertence à classe e não à instância, sendo assim, seu valor permanece, não sendo zerado novamente quando uma instância é criada
	private static int identificador = 0;

	private void Inicializa() {
		identificador++;
	}
	
	// Método criador da classe
	public Funcionario() {
		// Chama o inicializa para não ter que ficar colocando o comando "identificador++;" em todos os criadores
		Inicializa();
	}
	
	// Método criador da classe com parâmetro
	public Funcionario(String nome) {
		// Atribui o nome passado como parâmetro para o atributo da classe
		this.nome = nome;
		// Chama o inicializa para não ter que ficar colocando o comando "identificador++;" em todos os criadores
		Inicializa();
	}
   
	void recebeAumento(double valor) {
		// Atribui ao atributo salario o seu valor mais o valor passado como parâmetro
		this.salario += valor;
	}

	double getGanhoAnual() {
		// Cria uma variável e atribui a ela o valor do atributo salario multiplicado pela quantidade de meses no ano, 12
		double ganhoAnual = this.salario * 12;
		// A função retorna o valor da variável criada acima
		return ganhoAnual;
	}

	void mostra() {
		// Mostra na tela os atributos
		System.out.println("Nome: " + this.nome);
		System.out.println("Depatamento: " + this.departamento);
		System.out.println("Salario: " + this.salario);
		System.out.println("Data de Entrada: " + this.dataEntrada);
		System.out.println("RG: " + this.numeroRG);
	}
  
	public void setSalario(double valor) {
		// Atribui o valor passado como parâmetro para o atributo salario
		this.salario = valor;
	}
  
	public double getSalario() {
		// A função retorna o valor do atributo salario
		return this.salario;
	}
	
	public static int getIdentificador() {
		// A função retorna o valor do atributo identificador
		return identificador;
	}
}

class Empresa {
	String nome;
	String cnpj;
	Funcionario[] empregados = new Funcionario[10]; // Inicia o atributo empregados com 10 posições de cadastro
	
	// Atributo privado (só é visto pelo objeto proprietário)
	// Inicia em ZERO, que é a primeira posição posição livre já que não ninguém cadastrado
	private int posicaoLivre = 0;
	
	void adiciona(Funcionario f) {
		// Verifica se a posição atual é maior ou igual ao tamanho do atributo empregados
		if (this.posicaoLivre >= this.empregados.length) {
			// Se for maior, é necessário criar uma variável com o tamanho de empregados +1
			// Como iniciou em 10, a primeira vez que passar por aqui será 10+1 = 11, na segunda vez será 11+1=12, ...
			Funcionario[] empregados2 = new Funcionario[this.empregados.length + 1];
			// Loop para passar cada item do atributo empregados para a variável, que ao final terá uma posição vazia
			for (int i = 0; i < this.empregados.length; i++) {
				empregados2[i] = this.empregados[i];
			}
			// Atribui a variável para empregados, fazendo com que empregados tenha agora o conteúdo da variável empregados2
			this.empregados = empregados2;
		}
		
		// Com uma posição vazia, coloca-se o funcionário passado como parâmetro em f para a posição vazia
		this.empregados[this.posicaoLivre] = f;
		// Incrementa o atributo posicaoLivre para que o próximo funcionário seja incluído na próxima posição vazia
		this.posicaoLivre++;
	}
	
	void mostraEmpregados() {
		// Loop para mostrar os dados dos empregados
		for (int i = 0; i < this.posicaoLivre -1; i++) {
			System.out.println("Funcionario na posicao: " + i);
			// Chama o método do empregado para não reescrever tudo aqui novamente
			this.empregados[i].mostra();
			// Escreve uma linha vazia para dar um espaço entre cada funcionário
			System.out.println("");
		}
	}
	
	boolean contem(Funcionario f) {
		// Se f for vazio, não tiver sido atribuído, é Falso
		if (f == null) {
			// A função retorna falso
			return false;
		} else {
			// Loop para procurar o funcionário
			for (int i = 0; i < this.posicaoLivre; i++) {
				// Comparar o empregado ao parâmetro passado para a função
				if (this.empregados[i] == f) {
					// A função retorna verdadeiro quando encontra, e sai
					return true;
				}
			}
			// caso não tenha encontrado o funcionário, retorna falso
			return false;
		}
	}
}