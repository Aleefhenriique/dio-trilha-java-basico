package apps.aparelho;

import apps.aparelho.atender.Atender;
import apps.aparelho.chamar.Chamar;
import apps.aparelho.voice.IniciarCorreioVoz;

public class AparelhoTelefonico implements Chamar, Atender, IniciarCorreioVoz {


	public void atender() {
		System.out.println("atendendo\n");

	}

	public void iniciarCorreioVoz() {
		System.out.println("iniciando correio de voz\n");
		
	}

	public void ligar() {
		System.out.println("ligando para .....\n");
		
	}

}
