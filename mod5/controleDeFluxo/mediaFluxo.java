package ExecirciosGuanabara;

import java.util.Scanner;

public class Ex1SeqBasica {
    public static void main(String[] args) {
		
    	
    	Scanner sc = new Scanner(System.in);
    	double notas = 0;
    	double media = 0;
    	
    	   for(int i = 1 ; i <= 4; i++) {
    		   System.out.println(i + "º nota:");
    		    Double nota = sc.nextDouble();
    		      notas = notas + nota;
    	   }
    	   
    	  media = notas/4; 
    	     
    	  if(media >= 7.0) {
    		  System.out.println("Aprovado!!");
    	  } else {
    		  System.out.println("Reprovado!!");
    	  }
    	
    	sc.close();
    	
    	
    	
    	
	}
}
