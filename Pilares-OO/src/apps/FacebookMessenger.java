package apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("enviando mensagem pelo facebook");

	}

	@Override
	public void receberMensagem() {
		System.out.println("recebendo mensagem pelo facebook");

	}

}
