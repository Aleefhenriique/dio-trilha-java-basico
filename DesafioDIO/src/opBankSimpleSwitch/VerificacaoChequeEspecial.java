package opBankSimpleSwitch;

import java.util.Scanner;

public class VerificacaoChequeEspecial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double saldo = scanner.nextDouble();
		double saque = scanner.nextDouble();

		// Define um limite para o cheque especial
		double limiteChequeEspecial = 500;

		// Verifica se o saque ultrapassa o saldo disponível
		if (saque <= saldo) {
			System.out.println("Transação realizada com sucesso.");
		} else if (saque > saldo) {
			saldo += limiteChequeEspecial;
			if (saque > saldo) {
				System.out.println("Transação não realizada. Limite do cheque especial excedido.");
			} else {
				System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
			}
		}
		scanner.close();
	}

}
