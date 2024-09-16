package br.com.rpires.application;

import javax.swing.JOptionPane;

import br.com.rpires.dao.ClienteSetDAO;
import br.com.rpires.dao.IClienteDAO;
import br.com.rpires.domain.Cliente;

public class app {
	
	private static IClienteDAO iClienteDAO;
	
    public static void main(String[] args) {
		
       iClienteDAO = new ClienteSetDAO();
    	
    	
       String opcao = JOptionPane.showInputDialog(null, 
    			  " (1) - CADASTRO \n "
    			+ " (2) - CONSULTAR \n "
    			+ " (3) - EXCLUSÃO \n "
    			+ " (4) - ALTERAÇÃO \n "
    			+ " (5) - SAIR" , 
    			"Cadastro", JOptionPane.INFORMATION_MESSAGE);
    	
    	
    	while (!isOpcaoInvalida(opcao)) {
			if("".equals(opcao)) {
				sair();
			}
			opcao = JOptionPane.showInputDialog(null, 
        			  " OPÇÃO INVALIDA TENTE NOVAMENTE!! \n " 
					            + "\n"
					            + " (1) - CADASTRO \n "
        		    			+ " (2) - CONSULTAR \n "
        		    			+ " (3) - EXCLUSÃO \n "
        		    			+ " (4) - ALTERAÇÃO \n "
        		    			+ " (5) - SAIR" , 
        		    			"CADASTRO", JOptionPane.INFORMATION_MESSAGE);
		}
    	
    	
    
    	
    	while(isOpcaoInvalida(opcao)) {
    		  if(isOpcaoSair(opcao)) {
    			  sair();
    		  } else if (isCadsatro(opcao)) {
    			    String nome = JOptionPane.showInputDialog(null , "NOME:",  "DADOS PESSOAIS" ,   JOptionPane.INFORMATION_MESSAGE);
    			    String cpf = JOptionPane.showInputDialog(null, "CPF:",  "DADOS PESSOAIS" ,   JOptionPane.INFORMATION_MESSAGE);
    			    String telefone = JOptionPane.showInputDialog(null, "TELEFONE:",  "DADOS PESSOAIS" ,   JOptionPane.INFORMATION_MESSAGE);
    			    String endereço = JOptionPane.showInputDialog(null, "ENDEREÇO:",  "DADOS PESSOAIS" ,   JOptionPane.INFORMATION_MESSAGE);
    			    String numero = JOptionPane.showInputDialog(null, "NUMERO:",  "DADOS PESSOAIS" ,   JOptionPane.INFORMATION_MESSAGE);
    			    String cidade = JOptionPane.showInputDialog(null, "CIDADE:",  "DADOS PESSOAIS" ,   JOptionPane.INFORMATION_MESSAGE);
    			    String estado = JOptionPane.showInputDialog(null, "ESTADO:",  "DADOS PESSOAIS" ,   JOptionPane.INFORMATION_MESSAGE);
    			    
    			    String[] dados = {nome,cpf,telefone,endereço,numero,cidade,estado};
    			    cadastrar(dados);		    
    		  } else if(isConsultar(opcao)) {
    			  String cpf = JOptionPane.showInputDialog(null, "DIGITE O CPF:" , "CONSULTA" , JOptionPane.INFORMATION_MESSAGE);
    			  consultar(cpf);
    		  }
    		  
    		     opcao = JOptionPane.showInputDialog(null, 
    	    			  " (1) - CADASTRO \n "
    	    			+ " (2) - CONSULTAR \n "
    	    			+ " (3) - EXCLUSÃO \n "
    	    			+ " (4) - ALTERAÇÃO \n "
    	    			+ " (5) - SAIR" , 
    	    			"Cadastro", JOptionPane.INFORMATION_MESSAGE);
    		  
    	}
    	
    	
    	
    	
	}
    
    
    


	/**
     * Verifica se a opção passada é válida.
     * 
     * Este método serve para verificar se a opção que foi passada como parâmetro
     * corresponde à opção desejada. Por exemplo, se a opção for "1", ele retorna true.
     * 
     * @param opcao A opção selecionada pelo usuário.
     * @return true se a opção for válida (por exemplo, "1" para cadastro), caso contrário, false.
     */
    private static boolean isCadsatro(String opcao) {
		return "1".equals(opcao);
	
	}
    private static boolean isConsultar(String opcao) {
    	return "2".equals(opcao);
	}
    private static boolean isOpcaoSair(String opcao) {
    	if("5".equals(opcao)) {
    		return true;
    	}
    	return false;
    }    
    private static boolean isOpcaoInvalida(String opcao) {
		if("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || "4".equals(opcao) || "5".equals(opcao)) {
			return true;
		}
		return false;
	}

    
    
    
	// Metodo com logicas
    private static void cadastrar (String[] dados) {
    	  try {
              String nome = dados[0];
              String cpf = dados[1];
              String telefone = dados[2];
              String endereco = dados[3];
              String numero = dados[4];
              String cidade = dados[5];
              String estado = dados[6];

              Long cpfLong = Long.parseLong(cpf);
              Long telLong = Long.parseLong(telefone);
              Integer numeroInteger = Integer.parseInt(numero);

              Cliente cliente = new Cliente(nome, cpfLong, telLong, endereco, numeroInteger, cidade, estado);  
              Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
              
              if(isCadastrado) {
                  JOptionPane.showMessageDialog(null, "CLIENTE CADASTRADO COM SUCESSO", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
              } else {
                  JOptionPane.showMessageDialog(null, "CLIENTE JÁ ESTÁ CADASTRADO", "ERRO", JOptionPane.ERROR_MESSAGE);
              }
          } catch (NumberFormatException e) {
              JOptionPane.showMessageDialog(null, "Erro na conversão de dados. Verifique CPF, Telefone ou Número.", "Erro", JOptionPane.ERROR_MESSAGE);
          }
      }
	private static void sair() {
		JOptionPane.showMessageDialog(null, "Ate logo!!" , " Sair" ,JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
		
	}
	private static void consultar(String cpf) {
		//validar se foi passado somente o cpf
          Cliente cliente = iClienteDAO.consultar(Long.parseLong(cpf));
            if(cliente != null) {
            	JOptionPane.showMessageDialog(null, "CLIENTE ECONTRADO:" + cliente.toString(), "CONSULTA " ,JOptionPane.INFORMATION_MESSAGE);
            } else {
            	JOptionPane.showMessageDialog(null, "CLIENTE NÃO ECONTRADO", "CONSULTA " ,JOptionPane.INFORMATION_MESSAGE);
            }
          
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
