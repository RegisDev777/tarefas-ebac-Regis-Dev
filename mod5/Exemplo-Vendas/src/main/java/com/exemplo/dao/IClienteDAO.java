package com.exemplo.dao;

import com.exemplo.domain.Cliente;

public interface IClienteDAO {

	Boolean salvar (Cliente cliente);
	Cliente buscarPorCPF(Long cpf);
	void excluir(Long cpf);
	void alterar(Cliente cliente);

}
