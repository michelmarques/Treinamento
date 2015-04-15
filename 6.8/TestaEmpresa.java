class TestaEmpresa {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		
		Funcionario f1 = new Funcionario("Andressa");
		f1.departamento = "Money";
		f1.dataEntrada = "";
		f1.numeroRG = "";
		f1.setSalario(1000);
		empresa.adiciona(f1);
		
		Funcionario f2 = new Funcionario("Guilherme");
		f2.departamento = "TI";
		f2.dataEntrada = "";
		f2.numeroRG = "";
		f2.setSalario(1700);
		empresa.adiciona(f2);
		
		Funcionario f3 = new Funcionario("Michel");
		f3.departamento = "TI";
		f3.dataEntrada = "";
		f3.numeroRG = "";
		f3.setSalario(2000);
		empresa.adiciona(f3);

		for (int i = 0; i < 15; i++) {
			Funcionario f = new Funcionario("Fulano " + i);
			f.departamento = "";
		    f.dataEntrada = "";
		    f.numeroRG = "";
			f.setSalario(1000 + i * 100);
			empresa.adiciona(f);
		}
		
		empresa.mostraEmpregados();
	}
}