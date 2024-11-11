package Annotations;

public class appMain {
     public static void main(String[] args) {
		
    	 
    	 Class tb = Cliente.class;    	 
    	 tb.getDeclaredClasses();
    	 
         System.out.println("Nome simples da classe: " +  tb.getSimpleName());    	
    	 
    	   if(tb.isAnnotationPresent(Tabela.class)) {
    		   
    		   Tabela tabela = (Tabela) tb.getAnnotation(Tabela.class);
    		   String nomeTabela = tabela.value();
    		   System.out.println("Nome da tabela: " + nomeTabela);
    	   } else {
    		    System.out.println("A classe nao possui a anotaçãoi @tabela");
    	   }
         
         
	}
}
