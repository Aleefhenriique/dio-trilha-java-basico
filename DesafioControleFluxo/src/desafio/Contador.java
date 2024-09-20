package desafio;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		try (Scanner terminal = new Scanner(System.in)) {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();

			try {
				contar(parametroUm, parametroDois);

			} catch (ParametrosInvalidosException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		} else {

			int contagem = parametroDois - parametroUm;
			for (int parametro = 0; parametro < contagem; parametro++) {
				System.out.println(parametro + 1);
			}
		}

	}
}
