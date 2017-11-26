package br.com.caelum.contas.modelo;

public class Conta {

	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private String dataDeAbertura;

	// GETTERS E SETTERS
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}

	// MÉTODOS

	public boolean saca(double valor) {

		if (this.getSaldo() < valor) {
			System.out.println("Saldo Insuficiente");
			return true;
		} else {

			this.saldo -= valor;
			System.out.println("Sacando o valor de: " + valor);
			return false;
		}

	}

	public void depositar(double valor) {

		this.saldo += valor;

		// System.out.println("Deposito realizado no valor de: " + valor + "
		// Saldo Atual: " + this.getSaldo());

	}

	public double calculaRendimento() {

		return this.saldo * 0.1;
	}

	public void imprimirDados() {

		System.out.println("======================================");
		System.out.println("Nome do Titular: " + this.getTitular());
		System.out.println("Agência: " + this.getAgencia());
		System.out.println("Numero da Conta: " + this.getNumero());
		System.out.println("Data de Abertura: " + this.getDataDeAbertura());
		System.out.println("Saldo Disponivel: " + this.getSaldo());
		System.out.println("Rendimento: " + this.calculaRendimento());
		System.out.println("======================================");
		System.out.println("======================================");

	}

}
