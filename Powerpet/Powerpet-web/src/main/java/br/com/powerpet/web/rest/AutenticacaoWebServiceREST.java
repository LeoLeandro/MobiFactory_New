/**
 * 
 */
package br.com.powerpet.web.rest;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.powerpet.ejb.dto.UsuarioDTO;
import br.com.powerpet.ejb.excessoes.UsuarioInvalidoException;
import br.com.powerpet.ejb.fachada.IAutenticacaoServicoEJBRemoto;
import br.com.powerpet.web.constantes.MensagemStatus;
import br.com.powerpet.web.dadosTrafego.DadosUsuario;
import br.com.powerpet.web.dadosTrafego.JSONResposta;

/**
 * @author Leonardo
 *
 */
@Path("/autenticacao")
@RequestScoped
public class AutenticacaoWebServiceREST extends WebServiceREST {

	@Inject
	private IAutenticacaoServicoEJBRemoto ejb;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public JSONResposta inserirUsuario(DadosUsuario usuario) {
		JSONResposta resposta = new JSONResposta();
		
		try {
			ejb.inserirUsuario(this.converteParaDTO(usuario), true);
			
			resposta.setStatus(MensagemStatus.PASSED);
		} catch (UsuarioInvalidoException e) {
			resposta.setMensagem(e.getMessage());
			resposta.setStatus(MensagemStatus.FAILED);
		}
		
		return resposta;
	}

	private UsuarioDTO converteParaDTO(DadosUsuario usuario) {
		UsuarioDTO dto = new UsuarioDTO();
		
		dto.setNome(usuario.getNome());
		dto.setEmail(usuario.getEmail());
		dto.setSenha(usuario.getSenha());
		dto.setTipoUsuario(usuario.getTipoUsuario());
		
		if(usuario.getPessoa() != null) {
			dto.setPessoa(this.converteParaPessoaDTO(usuario.getPessoa()));
		}
		
		return dto;
	}
}
