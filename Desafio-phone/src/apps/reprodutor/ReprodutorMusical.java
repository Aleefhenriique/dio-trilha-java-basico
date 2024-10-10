package apps.reprodutor;

import apps.reprodutor.pausar.Pausar;
import apps.reprodutor.selecionarMusica.SelecionarMusica;
import apps.reprodutor.tocar.Tocar;

public class ReprodutorMusical implements SelecionarMusica, Tocar, Pausar{

	public void pausar() {
		System.out.println("pausando musica");
		
	}

	public void tocar() {
		System.out.println("tocando musica");
		
	}

	public void selecionarMusica() {
		System.out.println("musica selecionada");
		
	}

}
