package banco;

public class ContaPoupanca extends Conta {
	@Override
	public void atualiza(double taxa) {
		// Conta Corrente usa o dobro da taxa
		// Chama atualiza da classe anterior com o triplo da taxa
		super.atualiza(taxa * 3);
	}
}
