package fag;

public class ContaBancaria {
	private String titular;
	private double saldo;
	public ContaBancaria(String titular, double saldo) {
		setTitular(titular);
		setSaldo(saldo);
	}
	
	public double sacar(double quantidade) {
		return this.saldo -= quantidade;
	}
	
	public double depositar(double quantidade) {
		return this.saldo += quantidade;
	}
	public void mostrarSaldo() {
		System.out.printf("Sr(a). %s \nO seu saldo é de: %f reais\n", this.titular, this.saldo);
	}
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		if(!titular.trim().isEmpty() || titular != null) this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		if(saldo > 0) this.saldo = saldo;
	}
	
}
