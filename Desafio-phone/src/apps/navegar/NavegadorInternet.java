package apps.navegar;

import apps.navegar.adicionarPagina.AdicionarPagina;
import apps.navegar.atualizarPagina.AtualizarPagina;
import apps.navegar.exibirPagina.ExibirPagina;

public class NavegadorInternet implements ExibirPagina, AtualizarPagina, AdicionarPagina{

	public void adicionarPagina() {
		System.out.println("\nNova pagina\n");
		
	}

	public void atualizarPagina() {
		System.out.println("\nAtualizando Pagina\n");
		
	}

	public void exibirPagina() {
		System.out.println("\nExibindo Pagina\n");
		
	}

}
