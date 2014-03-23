package br.com.brejaonline.model;

public class CervejaNaoEncontradaException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public CervejaNaoEncontradaException() {

	}

	public CervejaNaoEncontradaException(String message) {
		super(message);

	}

	public CervejaNaoEncontradaException(Throwable cause) {
		super(cause);

	}

	public CervejaNaoEncontradaException(String message, Throwable cause) {
		super(message, cause);

	}

	//Construtor JDK 1.7
	public CervejaNaoEncontradaException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

}
