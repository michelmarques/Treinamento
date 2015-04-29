package banco;

public class TestaTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		
		// Testando Polimorfismo
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		
		// Exibir o saldo
		System.out.printf("O saldo �: %.2f", cc.getSaldo());
	}
}
