/**
 * 
 */
package br.com.powerpet.ejb.excessoes;

/**
 * @author Leonardo
 *
 */
public class UsuarioInvalidoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UsuarioInvalidoException(String mensagem) {
		super(mensagem);
	}
	
}
