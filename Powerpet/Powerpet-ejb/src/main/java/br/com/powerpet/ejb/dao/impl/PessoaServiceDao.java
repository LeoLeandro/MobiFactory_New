/**
 * 
 */
package br.com.powerpet.ejb.dao.impl;

import br.com.powerpet.ejb.entidades.Cliente;
import br.com.powerpet.ejb.entidades.Fornecedor;
import br.com.powerpet.ejb.entidades.Funcionario;
import br.com.powerpet.ejb.entidades.Pessoa;

/**
 * @author Leonardo
 *
 */
public class PessoaServiceDao {

	@SuppressWarnings("rawtypes")
	private DaoImpl daoImpl;

	public PessoaServiceDao() {}

	@SuppressWarnings("unchecked")
	public void inserirPessoa(Pessoa pessoa) {

		if(pessoa instanceof Cliente) {

			this.daoImpl = new ClienteDaoImpl();
			this.daoImpl.inserir((Cliente) pessoa);

		} else if(pessoa instanceof Funcionario) {

			this.daoImpl = new FuncionarioDaoImpl();
			this.daoImpl.inserir((Funcionario) pessoa);

		} else if(pessoa instanceof Fornecedor) {

			this.daoImpl = new FornecedorDaoImpl();
			this.daoImpl.inserir((Fornecedor) pessoa);

		} else {
			this.daoImpl = new PessoaDaoImpl();
			this.daoImpl.inserir(pessoa);
		}

	}

	@SuppressWarnings("unchecked")
	public void removerPessoa(Pessoa pessoa) {
		if(pessoa instanceof Cliente) {

			this.daoImpl = new ClienteDaoImpl();
			this.daoImpl.remover((Cliente) pessoa);

		} else if(pessoa instanceof Funcionario) {

			this.daoImpl = new FuncionarioDaoImpl();
			this.daoImpl.remover((Funcionario) pessoa);

		} else if(pessoa instanceof Fornecedor) {

			this.daoImpl = new FornecedorDaoImpl();
			this.daoImpl.remover((Fornecedor) pessoa);

		} else {
			this.daoImpl = new PessoaDaoImpl();
			this.daoImpl.remover(pessoa);
		}
	}

	@SuppressWarnings("unchecked")
	public void atualizarPessoa(Pessoa pessoa) {
		if(pessoa instanceof Cliente) {

			this.daoImpl = new ClienteDaoImpl();
			this.daoImpl.atualizar((Cliente) pessoa);

		} else if(pessoa instanceof Funcionario) {

			this.daoImpl = new FuncionarioDaoImpl();
			this.daoImpl.atualizar((Funcionario) pessoa);

		} else if(pessoa instanceof Fornecedor) {

			this.daoImpl = new FornecedorDaoImpl();
			this.daoImpl.atualizar((Fornecedor) pessoa);

		} else {
			this.daoImpl = new PessoaDaoImpl();
			this.daoImpl.atualizar(pessoa);
		}
	}
}
