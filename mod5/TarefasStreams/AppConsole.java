package EbacExercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import Streams.Pessoas;

public class AppConsole {
     public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
    	 List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
		 String opcao = "";
    	 
    	 
    	 do {
				System.out.print("Nome / sexo : ");
				  String dados = sc.nextLine().toUpperCase();
	    	         System.out.println("Deseja continuar S/N:");   
	    	            opcao = sc.nextLine().toUpperCase();
	    	       		   String[] nomeSexo = dados.split(",");      	       		
    	        listaPessoas.add(new Pessoa(nomeSexo[0], nomeSexo[1])); 
    	        
		} while (opcao.equals("S"));
    	 
    	 
    	 ArrayList<Pessoa> listFeminina = listaPessoas.stream()
    			 .filter(people -> people.getSexo().equals("F"))
    			 .collect(Collectors.toCollection(ArrayList::new));
    	 
    	 listFeminina.forEach(p -> System.out.println(p));
    	   
    	   
    	   
    	 sc.close();
	}
     
   
     
}
