package com.algaworks;

import java.util.List;

public class MetodoSoPraFemina {
     
	public boolean soFeminina(List<Pessoa> pessoas) {
	    if (pessoas == null || pessoas.isEmpty()) {
	        return true; 
	    }

	    for (Pessoa pessoa : pessoas) {
	        if (!"F".equals(pessoa.getSexo())) {
	            return false; 
	        }
	    }
	    return true; 
	}
	
}
