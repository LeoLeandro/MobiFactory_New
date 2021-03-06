/**
 * 
 */
package br.com.powerpet.ejb.factory;

import br.com.powerpet.ejb.util.TipoEntidade;
import br.com.powerpet.ejb.validadores.IValidador;
import br.com.powerpet.ejb.validadores.ValidadorUsuario;

/**
 * @author Leonardo
 *
 */
public class ValidadorFactory {

	public ValidadorFactory() {}
	
	public static IValidador criarValidador(TipoEntidade tipoEntidade) {
		
		IValidador validador = null;
		
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
				validador = new ValidadorUsuario();
			break;
		}
		
		return validador;
	}

}
