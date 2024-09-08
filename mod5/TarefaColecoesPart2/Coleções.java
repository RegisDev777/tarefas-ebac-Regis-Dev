package testCodigo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pessoas {
	public static void main(String[] args) {
	
		
		
		Scanner sc = new Scanner(System.in);
		List<String> meninos = new ArrayList<String>();
		List<String> meninas = new ArrayList<String>();
 		
		
        System.out.println("Nome e sexo (Ex: Regis m , clara f ):");
         String nomeSexo = sc.nextLine().toLowerCase().trim();
         
          char sexo = nomeSexo.charAt(nomeSexo.length() - 1);
          
          String nome = nomeSexo.substring(0, nomeSexo.length() - 1).trim();
		  /**
		   *  nomeSexo.length() - 1 ==> Significa que ele esta pegando o tamanho da paralvra  -1
		   *  ou seja "Regis M" quando chega no M ele vai extrair ele meioo que excluir entao so vai ficar
		   *  o "Regis " .trim();  ai que entra o  trim que remove o espaço entao  oo retorno disso 
		   *  tudo e Regis
		   */
          
          if(sexo == 'm') {
        	  meninos.add(nome);
          } else if (sexo == 'f') {
        	  meninas.add(nome);
          } else {
        	  throw new IllegalAccessException("Sexo invalido");
          }
          
          
          
           
 	}
	
}
