package entities;

public class Account {

	private int numeroDaConta;
	private String nome;
	private double  saldo;
	
	public Account(int numeroDaConta, String nome) {
		this.numeroDaConta = numeroDaConta;
		this.nome = nome;
	}
	
	public Account(int numeroDaConta, String nome, double depositoInicial) {
		this.numeroDaConta = numeroDaConta;
		this.nome = nome;
		depositar(depositoInicial);
	}

	public double getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void sacar(double retirada) {
		this.saldo -= retirada + 5.0;
	}
	
	public void depositar(double deposito) {
		this.saldo += deposito;
	}
	
	public String toString() {
		return "Account "
				+ numeroDaConta
				+ ", Holder: "
				+ nome
				+ ", Balance $ "
				+ String.format("%.2f", saldo);
	}
	
}
