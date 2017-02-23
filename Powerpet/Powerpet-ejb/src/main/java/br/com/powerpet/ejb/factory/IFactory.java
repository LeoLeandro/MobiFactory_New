/**
 * 
 */
package br.com.powerpet.ejb.factory;

import br.com.powerpet.ejb.validadores.IValidador;
import powerpet.Powerpet.util.TipoEntidade;

/**
 * @author Leonardo
 *
 */
public interface IFactory {

	public IValidador criarValidador(TipoEntidade tipoEntidade);
	
}
