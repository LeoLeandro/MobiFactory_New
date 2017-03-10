/**
 * 
 */
package br.com.powerpet.web.rest;

import java.util.ArrayList;
import java.util.List;

import br.com.powerpet.ejb.dto.EnderecoDTO;
import br.com.powerpet.ejb.dto.PessoaDTO;
import br.com.powerpet.ejb.dto.TelefoneDTO;
import br.com.powerpet.web.dadosTrafego.DadosEndereco;
import br.com.powerpet.web.dadosTrafego.DadosPessoa;
import br.com.powerpet.web.dadosTrafego.DadosTelefone;

/**
 * @author Leonardo
 *
 */
public abstract class WebServiceREST {

	
	public TelefoneDTO converteParaTelefoneDTO(DadosTelefone telefone) {
		TelefoneDTO dto = new TelefoneDTO();
		
		dto.setDDD(telefone.getDDD());
		dto.setNumero(telefone.getNumero());
		
		return dto;
	}
	
	public EnderecoDTO converteParaEnderecoDTO(DadosEndereco endereco) {
		EnderecoDTO dto = new EnderecoDTO();
		
		dto.setLogradouro(endereco.getLogradouro());
		dto.setBairro(endereco.getBairro());
		dto.setCEP(endereco.getCEP());
		dto.setCidade(endereco.getCidade());
		dto.setComplemento(endereco.getComplemento());
		dto.setEstado(endereco.getEstado());
		dto.setNumero(endereco.getNumero());
		
		return dto;
	}
	
	public PessoaDTO converteParaPessoaDTO(DadosPessoa pessoa) {
		PessoaDTO dto = new PessoaDTO();
		
		dto.setDocumento(pessoa.getDocumento());
		dto.setEndereco(this.converteParaEnderecoDTO(pessoa.getEndereco()));
		dto.setNome(pessoa.getNome());
		dto.setTipoPessoa(pessoa.getTipoPessoa());
		
		List<TelefoneDTO> telefones = new ArrayList<TelefoneDTO>();
		
		for(DadosTelefone telefone : pessoa.getTelefones()) {
			telefones.add(this.converteParaTelefoneDTO(telefone));
		}
		
		dto.setTelefones(telefones);
		
		return dto;
	}
}
