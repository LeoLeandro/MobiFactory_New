/**
 * 
 */
package br.com.powerpet.ejb.validadores;

import br.com.powerpet.ejb.dto.IDTO;
import br.com.powerpet.ejb.excessoes.UsuarioInvalidoException;

/**
 * @author Leonardo
 *
 */
public interface IValidador {

	public boolean validar(IDTO dto, boolean primeiroAcesso) throws UsuarioInvalidoException;
	
}
