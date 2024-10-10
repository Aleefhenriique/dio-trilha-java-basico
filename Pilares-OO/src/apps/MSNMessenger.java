package apps;

public class MSNMessenger extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("enviando mensagem pelo MSN");

	}

	@Override
	public void receberMensagem() {
		System.out.println("recebendo mensagem pelo MSN");

	}

}
