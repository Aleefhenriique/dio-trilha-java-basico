package desafio;

public class ParametrosInvalidosException extends Exception {
    private static final long serialVersionUID = 7921865878420487145L;

	public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
