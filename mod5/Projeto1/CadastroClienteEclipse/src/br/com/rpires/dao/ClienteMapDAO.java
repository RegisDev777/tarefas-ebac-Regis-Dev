package br.com.rpires.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import br.com.rpires.domain.Cliente;

public class ClienteMapDAO implements IClienteDAO {

	private Map<Long, Cliente> map;
	
	
	      public ClienteMapDAO() {
			this.map = new HashMap<Long, Cliente>();
		  }

	    
	          /**
	          * O método `this.map.containsKey(cliente.getCpf())` verifica se o CPF do cliente
	          * já está cadastrado no mapa (`map`). 
	          * 
	          * Quando cadastramos uma pessoa, usamos o CPF como a "chave" no mapa. No caso,
	          * estamos trabalhando com um `Map<Long, Cliente>`, onde `Long` representa o CPF
	          * e `Cliente` são os dados da pessoa.
	          * 
	          * O `containsKey` verifica se essa chave (CPF) já existe no mapa. Se o CPF já estiver 
	          * registrado, o método `cadastrar` retorna `false` para indicar que o cliente já está cadastrado.
	          * 
	          * Analogia:
	          * Pense no mapa como um armário onde cada gaveta é identificada por um CPF (a chave). 
	          * Dentro de cada gaveta (chave), estão armazenados os dados do cliente. O método `containsKey`
	          * está checando se já existe uma gaveta para o CPF fornecido.
	          */
				@Override
				public Boolean cadastrar(Cliente cliente) {
					if (this.map.containsKey(cliente.getCpf())) {
						return false;
					}					
					this.map.put(cliente.getCpf(), cliente);					
					return true;
					
				}
						
				@Override
				public void excluir(Long cpf) {
				   Cliente clienteCadastrado = this.map.get(cpf);
				    if(clienteCadastrado != null ) {
				    	this.map.remove(clienteCadastrado.getCpf(),clienteCadastrado);
				    }
				}
			
				@Override
				public void alterar(Cliente cliente) {
				    Cliente clienteCadastrado = this.map.get(cliente.getCpf());
					if(clienteCadastrado != null) {
						cliente.setNome(cliente.getNome());
						cliente.setTel(cliente.getTel());
						cliente.setNumero(cliente.getNumero());
						cliente.setEnd(cliente.getEnd());
						cliente.setCidade(cliente.getCidade());
						cliente.setEstado(cliente.getEstado());
					}
					
				}
									
				@Override
				public Cliente consultar(Long cpf) {
					return this.map.get(cpf);
				}
			
				@Override
				public Collection<Cliente> buscarTodos() {
					return this.map.values();
				}
 
	
	
}
