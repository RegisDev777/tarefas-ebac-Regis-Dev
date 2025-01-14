package service;


import dao.ClienteDao;
import dao.IclienteDao;

public class ClienteService {
  
	private IclienteDao clienteDao;
	
	public ClienteService(IclienteDao clienteDao) {
	  this.clienteDao = clienteDao;
	}
	
	public String salvar() {
	   return "Sucesso";
	}
}
