package banco;

public class ContaPoupanca extends Conta {
	@Override
	public void atualiza(double taxa) {
		// Conta Corrente usa o dobro da taxa
		// Chama atualiza da classe anterior com o triplo da taxa
		//super.atualiza(taxa * 3);
		
		// Teve que vir para c� por que a classe base n�o tem mais a implementa��o deste c�digo 
		super.setSaldo(super.getSaldo() + (super.getSaldo() * taxa * 3));
	}
}
