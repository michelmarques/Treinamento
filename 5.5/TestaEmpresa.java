class TestaEmpresa {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		
		Funcionario f1 = new Funcionario();
		f1.nome = "Andressa";
		f1.departamento = "Money";
		f1.dataEntrada = "";
		f1.numeroRG = "";
		f1.salario = 1000;
		empresa.adiciona(f1);
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Guilherme";
		f2.departamento = "TI";
		f2.dataEntrada = "";
		f2.numeroRG = "";
		f2.salario = 1700;
		empresa.adiciona(f2);
		
		Funcionario f3 = new Funcionario();
		f3.nome = "Michel";
		f3.departamento = "TI";
		f3.dataEntrada = "";
		f3.numeroRG = "";
		f3.salario = 2000;
		empresa.adiciona(f3);

		for (int i = 0; i < 15; i++) {
			Funcionario f = new Funcionario();
			f.nome = "Fulano " + i;
			f.departamento = "";
		    f.dataEntrada = "";
		    f.numeroRG = "";
			f.salario = 1000 + i * 100;
			empresa.adiciona(f);
		}
		
		empresa.mostraEmpregados();
	}
}