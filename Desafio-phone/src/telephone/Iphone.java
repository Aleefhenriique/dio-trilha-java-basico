package telephone;

import java.util.Scanner;

import apps.aparelho.AparelhoTelefonico;
import apps.aparelho.atender.Atender;
import apps.aparelho.chamar.Chamar;
import apps.aparelho.voice.IniciarCorreioVoz;
import apps.navegar.NavegadorInternet;
import apps.navegar.adicionarPagina.AdicionarPagina;
import apps.navegar.atualizarPagina.AtualizarPagina;
import apps.navegar.exibirPagina.ExibirPagina;
import apps.reprodutor.ReprodutorMusical;
import apps.reprodutor.pausar.Pausar;
import apps.reprodutor.selecionarMusica.SelecionarMusica;
import apps.reprodutor.tocar.Tocar;

public class Iphone {

	public static void main(String[] args) {

		AparelhoTelefonico apTel = new AparelhoTelefonico();
		NavegadorInternet navInt = new NavegadorInternet();
		ReprodutorMusical repMus = new ReprodutorMusical();
		
		Scanner scanner = new Scanner(System.in);

		boolean continuar = true;

		while (continuar) {

			System.out.println("Escolha uma opção: \n 1 para ligar - 2 para ouvir musica - 3 para acessar internet, 0 para sair  \n");
			int opcao = scanner.nextInt();

			switch (opcao) {

			case 1:
				boolean continuarChamada = true;
				while (continuarChamada) {
					System.out.println(
							"\n Escolha uma opção: \n 1 para ligar, 2 para atender, 3 para iniciar chamada de voz, 0 para sair  \n");
					int opcao2 = scanner.nextInt();
					switch (opcao2) {
					case 1:
						Chamar ligar = apTel;
						ligar.ligar();
						break;

					case 2:
						Atender atender = apTel;
						atender.atender();
						break;

					case 3:
						IniciarCorreioVoz correio = apTel;
						correio.iniciarCorreioVoz();
						break;

					case 0:
						System.out.println("\nSaindo da opção telefonar.\n");
						continuarChamada = false;
						break;

					default:
						System.out.println("Opção inválida. Tente novamente.");
					}
				}
				break;
			case 2:
				boolean continuarTocando = true;
				while (continuarTocando) {
					System.out.println(
							"\n Escolha uma opção: \n 1 Selecionar musica, 2 Tocar musica, 3 Pausar musica, 0 para sair \n");
					int opcao2 = scanner.nextInt();
					switch (opcao2) {
					case 1:
						SelecionarMusica selecionar = repMus;
						selecionar.selecionarMusica();;
						break;

					case 2:
						Tocar tocar = repMus;
						tocar.tocar();
						break;

					case 3:
						Pausar pausar = repMus;
						pausar.pausar();
						break;

					case 0:
						System.out.println("\nSaindo da opção Internet\n");
						continuarTocando = false;
						break;

					default:
						System.out.println("Opção inválida. Tente novamente.");
					}
				}
				break;
			case 3:
				boolean continuarNavegando = true;
				while (continuarNavegando) {
					System.out.println(
							"\n Escolha uma opção: \n 1 Exibir pagina, 2 Adicionar pagina, 3 Atualizar Pagina, 0 para sair \n");
					int opcao2 = scanner.nextInt();
					switch (opcao2) {
					case 1:
						ExibirPagina exibir = navInt;
						exibir.exibirPagina();
						break;

					case 2:
						AdicionarPagina adicionar = navInt;
						adicionar.adicionarPagina();
						break;

					case 3:
						AtualizarPagina atualizar = navInt;
						atualizar.atualizarPagina();
						break;

					case 0:
						System.out.println("\nSaindo da opção Internet\n");
						continuarNavegando = false;
						break;

					default:
						System.out.println("Opção inválida. Tente novamente.");
					}
				}
				break;
			case 0:
				System.out.println("Programa encerrado.");
				continuar = false;
				break;
			default:
				System.out.println("Opção inválida. Tente novamente. \n");
			}
		
		}
		scanner.close();

	}

}