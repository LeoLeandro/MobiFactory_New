package br.com.powerpet.web.dadosTrafego;

import java.util.List;

import br.com.powerpet.ejb.constantes.TipoPessoa;


public class DadosPessoa {

	private String nome;

	private TipoPessoa tipoPessoa;

	private String documento;

	private List<DadosTelefone> telefones;

	private DadosEndereco endereco;

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the tipoPessoa
	 */
	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	/**
	 * @param tipoPessoa the tipoPessoa to set
	 */
	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	/**
	 * @return the documento
	 */
	public String getDocumento() {
		return documento;
	}

	/**
	 * @param documento the documento to set
	 */
	public void setDocumento(String documento) {
		this.documento = documento;
	}

	/**
	 * @return the telefones
	 */
	public List<DadosTelefone> getTelefones() {
		return telefones;
	}

	/**
	 * @param telefones the telefones to set
	 */
	public void setTelefones(List<DadosTelefone> telefones) {
		this.telefones = telefones;
	}

	/**
	 * @return the endereco
	 */
	public DadosEndereco getEndereco() {
		return endereco;
	}

	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(DadosEndereco endereco) {
		this.endereco = endereco;
	}
	
}
