package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;

public class TestaConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta conta1 = new Conta();
		conta1.setTitular("Diana Arcanjo");
		conta1.setAgencia("0001");
		conta1.setNumero(118496);
		conta1.setSaldo(0.00);
		conta1.depositar(1000.00);
		conta1.saca(500.00);
		conta1.imprimirDados();

	}

}
