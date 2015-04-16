public class ContaCorrente extends Conta {
	public void deposita(double valor) {
		// Chama setSaldo da classe anterior
		// Chama getSaldo da classe anterior
		// Saldo = Saldo + valor - 0.10, onde 0.10 representa R$ 0,10 de desconto em depósitos para Conta Corrente
		super.setSaldo(super.getSaldo() + valor - 0.10);
	}
	
	public void atualiza(double taxa) {
		// Conta Corrente usa o dobro da taxa
		// Chama atualiza da classe anterior com o dobro da taxa
		super.atualiza(taxa * 2);
	}
}