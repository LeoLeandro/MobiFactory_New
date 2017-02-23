/**
 * 
 */
package br.com.powerpet.ejb.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.powerpet.ejb.constantes.TipoMedicacao;

/**
 * @author Leonardo
 *
 */
@Entity
@Table(name="antipulgas")
public class Antipulgas extends Medicamento {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column
	private final TipoMedicacao tipoMedicacao = TipoMedicacao.ANTIPULGAS;

	/**
	 * @return the tipoMedicacao
	 */
	public TipoMedicacao getTipoMedicacao() {
		return tipoMedicacao;
	}

}
