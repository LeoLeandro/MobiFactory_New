/**
 * 
 */
package br.com.powerpet.ejb.fachada;

import java.util.List;

import javax.ejb.Remote;

import br.com.powerpet.ejb.dto.UsuarioDTO;
import br.com.powerpet.ejb.excessoes.UsuarioInvalidoException;

/**
 * @author Leonardo
 *
 */
@Remote
public interface IAutenticacaoServicoEJBRemoto {

	public void inserirUsuario(UsuarioDTO usuarioDTO, boolean primeiroAcesso) throws UsuarioInvalidoException;
	
	public void removerUsuario(UsuarioDTO usuarioDTO) throws UsuarioInvalidoException;
	
	public void atualizarUsuario(UsuarioDTO usuarioDTO) throws UsuarioInvalidoException;
	
	public UsuarioDTO buscarUsuarioPorEmail(String email) throws UsuarioInvalidoException;
	
	public List<UsuarioDTO> listarUsuarios();
	
}
