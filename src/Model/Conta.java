package Model;

public class Conta  {
	protected String nomeTitular;
	protected String cpf;
	protected int    numeroConta;
	protected double saldo;
	
	// vamos criar um construtor
	public Conta(String nomeTitular, String cpf, int numeroConta, double saldo) {
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	/* vou tornar a operacao de creditar a mais simples possível, apenas somando o valor
	 *  ao saldo
	 */
	public void creditar(double valor) {
		saldo += valor;
	}
	
	

	/* a operacao debitar primeiro verifica se o valor a ser debitado é menor ou igual ao saldo
	 * se for, realiza a subtração e retonra TRUE indicando sucesso nessa operação
	 * caso contrário, não faz a subtração do saldo e retorna FALSE indicando falha
	 */
	public boolean debitar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	
	public String exibirInfo() {
		return "Conta: "+numeroConta+"  Saldo R$ "+saldo+
				"\nTitular "+nomeTitular+" / "+cpf;
	}

}



