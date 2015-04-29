package banco;

public abstract class Conta {
	private double saldo;
	
	public void deposita(double valor) {
		// Saldo = Saldo + valor
		this.saldo += valor;
	}
	
	public void saca(double valor) {
		// Saldo = Saldo - valor
		this.saldo -= valor;
	}
	
	public double getSaldo() {
		// Retorna o Saldo
		return this.saldo;
	}
	
	public void setSaldo(double valor) {
		// Atualiza o Saldo para valor
		this.saldo = valor;
	}
	
	public void atualiza(double taxa) {
		// Atualiza o Saldo para Saldo + (Saldo * valor)
		this.saldo += this.saldo * taxa;
	}
}
