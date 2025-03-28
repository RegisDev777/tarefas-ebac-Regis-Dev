package com.exemplo.services;

import com.exemplo.domain.Cliente;

public interface IclienteService {

	Boolean salvar(Cliente cliente);
	Cliente buscarPorCpf(Long cpf);
	void excluir(Long cpf);
	void alterar(Cliente cliente);



}
