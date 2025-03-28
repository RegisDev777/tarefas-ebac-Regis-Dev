package com.exemplo.dao;

import com.exemplo.domain.Cliente;

public class ClienteDaoMock implements IClienteDAO {

	@Override
	public Boolean salvar(Cliente cliente) {
       return true;
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		 Cliente cliente = new Cliente();
		 cliente.setCpf(cpf);
		return new Cliente();
	}

	@Override
	public void excluir(Long cpf) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}
     
}
