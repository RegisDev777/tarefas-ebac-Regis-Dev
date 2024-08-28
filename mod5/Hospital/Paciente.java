package Hospital;

public class Paciente {
	
      private String nome;
      private String cpf;
      private String idade;
      private String endereço;
      
      /**
       * Construtor da classe Paciente.
       * <p>
       * Este construtor inicializa uma nova instância da classe Paciente com os parâmetros fornecidos.
       * <p>
       * @param nome O nome do paciente.
       * @param cpf O CPF do paciente.
       * @param idade A idade do paciente.
       * @param endereço O endereço do paciente.
       */
		public Paciente(String nome, String cpf, String idade, String endereço) {
			this.nome = nome;
			this.cpf = cpf;
			this.idade = idade;
			this.endereço = endereço;
		}

		
		/**
		 * Getters e setters.
		 * <p>
		 * Getters retornam os dados armazenados nos campos correspondentes.
		 * Setters modificam os dados armazenados nos campos correspondentes.
		 * </p>
		 */
		public String getNome() {
			return nome;
		}
        public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}
        public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getIdade() {
			return idade;
		}
        public void setIdade(String idade) {
			this.idade = idade;
		}

		public String getEndereço() {
			return endereço;
		}
        public void setEndereço(String endereço) {
			this.endereço = endereço;
		}
      
        
        
        
        /**
         * Gera a ficha do paciente contendo seus dados, como nome, CPF, idade e endereço.
         * <p>
         * O método verifica cada campo para garantir que não seja nulo antes de incluí-lo na ficha.
         * Se algum campo obrigatório, como o endereço, estiver ausente, uma mensagem de aviso será exibida.
         * </p>
         *
         * @return uma string contendo a ficha do paciente, com os dados disponíveis
         */     
	        public String Ficha() {
	        	String ficha = "FICHA DO PACIENTE \n";
	        	     	
	        		if(this.nome != null) {
	        			ficha += "nome: " + nome + "\n";
	        		}
	        		if(this.cpf != null) {
	        			ficha += "cpf: " + cpf + "\n";
	        		}
	         		if(this.idade != null) {    			
	        			ficha += "idade: " + idade + "\n";
	        		}
	        		if(this.endereço != null) {
	        			ficha += "endereço: " + endereço + "\n";
	        		} else {
	        			System.out.println("Ficha invalida");
	        		}
	        		return ficha;
	        }
      
      
      
}
