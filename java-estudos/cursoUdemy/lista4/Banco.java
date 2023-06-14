package cursoUdemy.lista4;

public class Banco {

	private int numeroConta;
	private String nomeTitular;
	private double saldoConta;

	public Banco(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public Banco(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldoConta = depositoInicial;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public Double getSaldoConta() {
		return saldoConta;
	}

	public Double deposito(double valorDepositado) {
		return this.saldoConta += valorDepositado;
	}

	public Double saque(double valorSaque) {
		return this.saldoConta -= valorSaque + 5;
	}

	public String toString() {
		return "Account " + this.numeroConta + ", Holder: " + this.nomeTitular + ", Balance: $ "
				+ String.format("%.2f", this.saldoConta);
	}

}
