/**
 * 
 */
package br.com.powerpet.ejb.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.powerpet.ejb.constantes.TipoProcedimentoClinico;

/**
 * @author Leonardo
 *
 */
@Entity
@Table(name="anamnese")
public class Anamnese extends ProcedimentoClinico {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column
	private final TipoProcedimentoClinico tipoProcedimento = TipoProcedimentoClinico.ANAMNESE;
	
	/**
	 * @return the tipoProcedimento
	 */
	public TipoProcedimentoClinico getTipoProcedimentoClinico() {
		return tipoProcedimento;
	}
	
}
