package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		imprimirSelecionados();

	}

	static void imprimirSelecionados() {
		String[] candidatos = { "Ana", "Bruno", "Carla", "Diego", "Eliana" };
		System.out.println("Imprimindo a lista de candidatos informando o indici do elemento");

		for (int indice = 0; indice < candidatos.length; indice++) {
			System.out.println("O candidato de n " + (indice+1) + " é " + candidatos[indice]);
		}
		
		System.out.println("forma abreviada de interação for each");
		
		for(String candidato: candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
	}

	static void selecaoCandidatos() {
		String[] candidatos = { "Ana", "Bruno", "Carla", "Diego", "Eliana", "Felipe", "Gabriela", "Henrique", "Isabela",
				"João" };

		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();

			System.out.println("O candidato " + candidato + "Solicitou este valor de salario " + salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
	}

	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("ligar candidato");
		} else if (salarioBase == salarioPretendido)
			System.out.println("Ligar contra proposta");
		else {
			System.out.println("aguarda resultado");
		}
	}
}
