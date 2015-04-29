package banco;

public class ContaCorrente extends Conta implements Tributavel {
	public void deposita(double valor) {
		// Chama setSaldo da classe anterior
		// Chama getSaldo da classe anterior
		// Saldo = Saldo + valor - 0.10, onde 0.10 representa R$ 0,10 de desconto em depósitos para Conta Corrente
		super.setSaldo(super.getSaldo() + valor - 0.10);
	}
	
	@Override
	public void atualiza(double taxa) {
		// Conta Corrente usa o dobro da taxa
		// Chama atualiza da classe anterior com o dobro da taxa
		//super.atualiza(taxa * 2);
		
		// Teve que vir para cá por que a classe base não tem mais a implementação deste código 
		super.setSaldo(super.getSaldo() + (super.getSaldo() * taxa * 2));
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}
