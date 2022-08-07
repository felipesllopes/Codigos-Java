package BancoStylus;

/**
 * Agencia deve ser de 100 a 999 e Conta de 1000 a 99999
 * @author Felipe
 *
 */
public class CriandoException extends Exception{
	
	public CriandoException(String msg) {
		super(msg);
	}
	
	public CriandoException() {
		
	}
}