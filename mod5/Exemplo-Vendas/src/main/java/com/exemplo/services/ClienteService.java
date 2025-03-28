package com.exemplo.services;

import com.exemplo.dao.ClienteDAO;
import com.exemplo.dao.IClienteDAO;
import com.exemplo.domain.Cliente;

//Camadas de serviços e de regras de serviços ou seja logica dos metodos!


public class ClienteService implements IclienteService {
	
	private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
	  this.clienteDAO = clienteDAO;
	}
			
			
			@Override
			public Boolean salvar(Cliente cliente) {
	             return clienteDAO.salvar(cliente);
			}
		
			@Override
			public Cliente buscarPorCpf(Long cpf) {
				// TODO Auto-generated method stub
				return clienteDAO.buscarPorCPF(cpf);
			}


			@Override
			public void excluir(Long cpf) {
				clienteDAO.excluir(cpf);
			}


			@Override
			public void alterar(Cliente cliente) {
			    clienteDAO.alterar(cliente);
			}

}
