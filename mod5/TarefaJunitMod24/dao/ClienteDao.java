package dao;

import entidades.Cliente;

public class ClienteDao implements IclienteDao{

	public  String salvar() {
		throw new UnsupportedOperationException("Nao funciona sem config de banco");
		//return "Sucesso";
	}

	@Override
	public Cliente salvar(Cliente cliente) {
		throw new UnsupportedOperationException("Nao funciona sem config de banco");
	}

	@Override
	public Cliente buscar(String nome) {
		throw new UnsupportedOperationException("Nao funciona sem config de banco");
	}

	@Override
	public Boolean excluir(String nome) {
		throw new UnsupportedOperationException("Nao funciona sem config de banco");
	}


	@Override
	public Boolean atualizar(String nome, Cliente clienteAtualizado) {
		throw new UnsupportedOperationException("Nao funciona sem config de banco");
	}

	
}
