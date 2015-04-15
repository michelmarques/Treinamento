class Funcionario {
	String nome;
	String departamento;
	private double salario;
	String dataEntrada;
	String numeroRG;
	private static int identificador = 0;

	public Funcionario() {
		identificador++;
	}
	
	public Funcionario(String nome) {
		this.nome = nome;
		Funcionario();
	}
   
	void recebeAumento(double valor) {
		this.salario += valor;
	}

	double getGanhoAnual() {
		double ganhoAnual = this.salario * 12;
		return ganhoAnual;
	}

	void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Depatamento: " + this.departamento);
		System.out.println("Salario: " + this.salario);
		System.out.println("Data de Entrada: " + this.dataEntrada);
		System.out.println("RG: " + this.numeroRG);
	}
  
	public void setSalario(double valor) {
		this.salario = valor;
	}
  
	public double getSalario() {
		return this.salario;
	}
	
	public static int getIdentificador() {
		return identificador;
	}
}

class Empresa {
	String nome;
	String cnpj;
	Funcionario[] empregados = new Funcionario[10];
	
	private int posicaoLivre = 0;
	
	void adiciona(Funcionario f) {
		if (this.posicaoLivre +1 >= this.empregados.length) {
			Funcionario[] empregados2 = new Funcionario[this.empregados.length + 1];
			for (int i = 0; i < this.empregados.length; i++) {
				empregados2[i] = this.empregados[i];
			}
			this.empregados = empregados2;
		}
		
		this.empregados[this.posicaoLivre] = f;
		this.posicaoLivre++;
	}
	
	void mostraEmpregados() {
		for (int i = 0; i < this.posicaoLivre -1; i++) {
			System.out.println("Funcionario na posicao: " + i);
			//System.out.println("  Nome: " + this.empregados[i].nome);
			//System.out.println("  Salario: " + this.empregados[i].salario);
			this.empregados[i].mostra();
			System.out.println("");
		}
	}
	
	boolean contem(Funcionario f) {
		if (f == null) {
			//System.out.println("Funcionario invalido");
			return false;
		} else {
			for (int i = 0; i < this.posicaoLivre; i++) {
				if (this.empregados[i] == f) {
					return true;
				}
			}
			return false;
		}
	}
}