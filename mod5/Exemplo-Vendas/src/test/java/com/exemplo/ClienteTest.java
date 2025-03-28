package com.exemplo;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.exemplo.dao.ClienteDaoMock;
import com.exemplo.dao.IClienteDAO;
import com.exemplo.domain.Cliente;
import com.exemplo.services.ClienteService;
import com.exemplo.services.IclienteService;

import junit.framework.Assert;

public class ClienteTest {
    
	private Cliente cliente;
	private IclienteService clienteService;
	        
	 public ClienteTest() {
		 IClienteDAO dao = new ClienteDaoMock();
		 clienteService = new ClienteService(dao);
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
	     		}
	       
	 
				@Test
				public void pesquisarCliente () {
				    Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());
				    Assert.assertNotNull(clienteConsultado);
				}
	           
				@Test
				public void salvarCliente() {
					Boolean retorno = clienteService.salvar(cliente);
					Assert.assertTrue(retorno);
				}
				
				@Test
				public void excluirCliente() {
					clienteService.excluir(cliente.getCpf());
				}
				
				@Test
				public void alterarCliente() {
					cliente.setNome("Regis Dev777");
					clienteService.alterar(cliente);
					Assert.assertEquals("Regis Dev777", cliente.getNome());
				}
	
}
