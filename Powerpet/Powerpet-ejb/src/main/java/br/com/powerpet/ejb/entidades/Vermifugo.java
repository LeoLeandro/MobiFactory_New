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
@Table(name="vermifugo")
public class Vermifugo extends Medicamento {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column
	private final TipoMedicacao tipoMedicacao = TipoMedicacao.VERMIFUGO;

	/**
	 * @return the tipoMedicacao
	 */
	public TipoMedicacao getTipoMedicacao() {
		return tipoMedicacao;
	}
	
}
