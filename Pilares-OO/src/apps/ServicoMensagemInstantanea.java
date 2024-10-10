package apps;

public abstract class ServicoMensagemInstantanea {

	//quem quiser ser um serviço tem que usar esses "contratos"
	public abstract void enviarMensagem();

	public abstract void receberMensagem();
	
	protected void validarConectadoInternet() {
		System.out.println("validando se esta conectado a internet");
	}

}
