package br.com.modelagem.services.exception;

public class ObjectNotFounfException extends RuntimeException{
	private static final long serialVersionUID = -4278201091032736321L;
	
	public ObjectNotFounfException(String msg) {
		super(msg);
	}
	
	public ObjectNotFounfException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
