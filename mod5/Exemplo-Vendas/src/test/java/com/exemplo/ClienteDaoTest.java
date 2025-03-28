package com.exemplo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.exemplo.dao.ClienteDAO;
import com.exemplo.dao.ClienteDaoMock;
import com.exemplo.dao.IClienteDAO;
import com.exemplo.domain.Cliente;

public class ClienteDaoTest {

	private IClienteDAO clienteDao;
	private Cliente cliente;
	
	
	public ClienteDaoTest() {
		clienteDao = new ClienteDaoMock();
	}

    @BeforeEach
		public void init () {
 	    cliente = new Cliente();
			cliente.setCpf(1231231231L);
			cliente.setNome("Regis");
			cliente.setCidade("São Paulo");
			cliente.setEnd("End");
			cliente.setEstado("SP");
			cliente.setNumero(10);
			cliente.setTel(11999999999L);
			clienteDao.salvar(cliente);

		}
	
	
	@Test
	public void pesquisarCliente(){
	   Cliente clienteConsultado = clienteDao.buscarPorCPF(cliente.getCpf());
			   
    }
	
	
	public void excluirCliente(Long cpf) {
		clienteDao.excluir(cliente.getCpf());
	}
	
}
