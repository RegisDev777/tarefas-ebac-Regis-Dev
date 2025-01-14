package dao;

import entidades.Cliente;

public interface IclienteDao {

  	public Cliente salvar(Cliente cliente);
    public Cliente buscar(String nome);
    public Boolean excluir(String nome);
	public Boolean atualizar(String nome, Cliente clienteAtualizado);
		
}
