/**
 * 
 */
package br.com.powerpet.ejb.factory;

import br.com.powerpet.ejb.dao.IDao;
import br.com.powerpet.ejb.dao.impl.UsuarioDaoImpl;
import br.com.powerpet.ejb.util.TipoEntidade;

/**
 * @author Leonardo
 *
 */
public class DaoFactory {

	public static IDao<?> criarDao(TipoEntidade tipoEntidade) {

		IDao<?> dao = null;
		
		switch(tipoEntidade) {
		case ANIMAL:

			break;
		case BANHO:

			break;
		case CASO_CLINICO:

			break;
		case ENDERECO:

			break;
		case EVENTO:

			break;
		case HOTELZINHO:

			break;
		case MEDICAMENTO:

			break;
		case PESSOA:

			break;
		case PROCEDIMENTO_CLINICO:

			break;
		case PRODUTO:

			break;
		case REGISTRO_FINANCEIRO:

			break;
		case TELEFONE:

			break;
		case TOSA:

			break;
		case USUARIO:
			dao = new UsuarioDaoImpl();
			break;
		}

		return dao;
	}

}
