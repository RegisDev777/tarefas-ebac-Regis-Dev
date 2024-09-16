package br.com.rpires.dao;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import br.com.rpires.domain.Cliente;

public class ClienteSetDAO implements IClienteDAO {

	private Set<Cliente> set;
	
	
	      public ClienteSetDAO() {
			this.set = new HashSet<>();
		  }

	    
	         /*
	          * o contains verifica se existe um cliente com o cpf passado dentro da lista
	          */
				@Override
				public Boolean cadastrar(Cliente cliente) {
					return this.set.add(cliente);
				}
						
				@Override
				public void excluir(Long cpf) {
				    Cliente clienteParaRemover = null;
			        for (Cliente cliente : set) {
			            if (cliente.getCpf().equals(cpf)) {
			                clienteParaRemover = cliente;
			                break;  // Encerra o loop ao encontrar o cliente
			            }
			        }        
			        if (clienteParaRemover != null) {
			            set.remove(clienteParaRemover);
			        } 			
				}
			
				@Override
				public void alterar(Cliente clienteAtualizado) {
					Cliente clienteExistente = null;
					  for (Cliente cliente : set) {
						 if(cliente.getCpf().equals(clienteAtualizado.getCpf())) {
							 clienteExistente = cliente;
						 }
				      }
					 if(clienteExistente != null) {
						    clienteExistente.setNome(clienteAtualizado.getNome());
				            clienteExistente.setTel(clienteAtualizado.getTel());
				            clienteExistente.setNumero(clienteAtualizado.getNumero());
				            clienteExistente.setEnd(clienteAtualizado.getEnd());
				            clienteExistente.setCidade(clienteAtualizado.getCidade());
				            clienteExistente.setEstado(clienteAtualizado.getEstado()); 
					 }
					
				    			
				}
									
				@Override
				public Cliente consultar(Long cpf) {
					for (Cliente cliente : set) {
						 if(cliente.getCpf().equals(cpf)) {
							 System.out.println(cliente);
							 return cliente;
						 }
					}
					return null;
				}
			
				@Override
				public Collection<Cliente> buscarTodos() {
					return set;

				}
 
	
	
}
