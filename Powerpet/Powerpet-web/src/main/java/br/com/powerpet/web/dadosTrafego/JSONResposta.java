/**
 * 
 */
package br.com.powerpet.web.dadosTrafego;

import br.com.powerpet.web.constantes.MensagemStatus;

/**
 * @author Leonardo
 *
 */
public class JSONResposta {

	private Object dados;
	private String mensagem;
	private MensagemStatus status;
	
	public JSONResposta(){}
	
	/**
	 * @return the dados
	 */
	public Object getDados() {
		return dados;
	}
	/**
	 * @param dados the dados to set
	 */
	public void setDados(Object dados) {
		this.dados = dados;
	}
	/**
	 * @return the mensagem
	 */
	public String getMensagem() {
		return mensagem;
	}
	/**
	 * @param mensagem the mensagem to set
	 */
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	/**
	 * @return the status
	 */
	public MensagemStatus getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(MensagemStatus status) {
		this.status = status;
	}
	
}
