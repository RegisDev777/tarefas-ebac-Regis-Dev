package testCodigo;

import java.util.Scanner;

public class application {
      public static void main(String[] args) {
		 
    	  Scanner sc = new Scanner(System.in);
    	  
    	  System.out.println("PESSOA JURIDICA");
    	  Juridica Pjuridica = new Juridica();
    	  Pjuridica.setNome(sc.nextLine());
    	  Pjuridica.setCnpj(sc.nextLine());
    	  Pjuridica.setRamoAtividade(sc.nextLine());
    	  Pjuridica.setNumeroDeFuncionarios(sc.nextInt());
    	  
     
    	  System.out.println();
    	  System.out.println();
    	  
    	  sc.nextLine();
    	  
    	  System.out.println("PESSOA FISICA:");
    	  Fisica Pfisica = new Fisica();
    	  Pfisica.setNome(sc.nextLine());
    	  Pfisica.setCpf(sc.nextLine());
    	  Pfisica.setDataNascimento(sc.nextLine());
    	  
    	  System.out.println();
    	  System.out.println();
    	  
    	  System.out.println(Pjuridica);
    	  System.out.println();
    	  System.out.println(Pfisica);
    	  
    	  sc.close();
    	  
	}
}
