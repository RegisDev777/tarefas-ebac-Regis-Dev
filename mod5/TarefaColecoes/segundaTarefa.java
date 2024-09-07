package testCodigo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class application {
	

	
       public static void main(String[] args) {
		
      
           Scanner sc = new Scanner(System.in);
           List<String> meninos = new ArrayList<>();
           List<String> meninas = new ArrayList<>();

           System.out.print("Quantas pessoas você quer cadastrar? ");
           int quantidade = sc.nextInt();
           sc.nextLine(); 
           for (int i = 0; i < quantidade; i++) {
               
               System.out.print("Digite o nome: ");
               String nome = sc.nextLine().toLowerCase().trim();

              
               System.out.print("Digite o sexo (m para masculino, f para feminino): ");
               String sexo = sc.nextLine().toLowerCase().trim();

             
               if (sexo.equals("m")) {
                   meninos.add(nome);
               } else if (sexo.equals("f")) {
                   meninas.add(nome);
               } else {
                   System.out.println("Sexo inválido, tente novamente.");
                   i--; 
               }
           }

         
           Collections.sort(meninos);
           Collections.sort(meninas);
           
           System.out.println();
           
           System.out.println("Lista de meninos: " + meninos);
           System.out.println("Lista de meninas: " + meninas);

           sc.close();	 
    	   
	}
       
      
}
