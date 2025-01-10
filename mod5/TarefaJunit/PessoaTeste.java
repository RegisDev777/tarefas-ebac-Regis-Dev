package com.algaworks;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PessoaTeste {
  
	@Test
	public void testeListFemenina() {
		  List<Pessoa> pessoas = Arrays.asList(
		            new Pessoa("Maria", "F"),
		            new Pessoa("Ana", "F"),
		            new Pessoa("Joana", "F")
		        );
		  
		  
		    MetodoSoPraFemina metodo = new MetodoSoPraFemina();

		    // Verifique se o método retorna true
		    assertTrue("A lista deve conter apenas mulheres.", metodo.soFeminina(pessoas));

	}
	
}
