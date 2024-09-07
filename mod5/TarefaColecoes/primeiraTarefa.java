package testCodigo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class pessoas {
	public static void main(String[] args) {
	
		
		
		Scanner sc = new Scanner(System.in);
		List<String> pessoasCadastradas = new ArrayList<String>();
		
		
		System.out.println("nomes:");
	     String nomes = sc.nextLine();
	     
	        String[] campos = nomes.split(",");
	        
	        
	      for (String nome : campos) {
			pessoasCadastradas.add(nome.trim());
		   }
	      
	      Collections.sort(pessoasCadastradas);
	      
	      System.out.println("Nomes armazenados:");
	      for (String p : pessoasCadastradas) {
			System.out.println(p);
		 }
	      
	      sc.close();

 	}
	
}
