package dao;

import java.util.ArrayList;
import java.util.List;

import entidades.Cliente;

public class ClienteDaoMock implements IclienteDao{

	private static List<Cliente> listaCliente = new ArrayList<>();
	
	
	@Override
	public Cliente salvar(Cliente cliente) {
		listaCliente.add(cliente);
		System.out.println("Cliente salvo: " + cliente.getNome());
		return cliente;
	}

	@Override
	public Cliente buscar(String nome) {
		for (Cliente cliente : listaCliente) {
			if(cliente.getNome().equalsIgnoreCase(nome)) {
				return cliente;
			}
		}
		System.out.println("Cliente: " + nome + " nao encontrado...");
		return null;
	}

	@Override
	public Boolean excluir(String nome) {
		for (Cliente cliente : listaCliente) {
			if(cliente.getNome().equalsIgnoreCase(nome)) {
				listaCliente.remove(cliente);
				return true;
			}	
		}
		return false;
	}

	@Override
	public Boolean atualizar(String nome, Cliente clienteAtualizado) {
			Cliente clienteExistente = buscar(nome);
		    if(clienteExistente != null) {
		    	clienteAtualizado.setNome(clienteAtualizado.getNome());
		    	clienteAtualizado.setIdade(clienteAtualizado.getIdade());
		    	return true;
		    }
		return false;
	}

	
    
	
}
