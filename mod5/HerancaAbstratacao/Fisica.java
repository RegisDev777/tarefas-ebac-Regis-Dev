package testCodigo;


public class Fisica extends pessoas {
	 
	private String cpf;
	private String dataNascimento;
	
	      
	     
	     public Fisica() {
			// TODO Auto-generated constructor stub
		 }
		 public Fisica(String cpf,String dataNascimento) {
				this.cpf = cpf;
		    	this.dataNascimento = dataNascimento;
		 }
	
		 
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}	

		
		public String getDataNascimento() {
			return dataNascimento;
		}
		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
          
	    @Override
	    public String toString() {
	    StringBuilder sb = new StringBuilder();
	       sb.append("nome: " + getNome() + "\n");
	       sb.append("cpf: " + getCpf() + "\n");
	       sb.append("Data nascimento: " + getDataNascimento() + "\n");
	       return sb.toString();
	    }
          
      
}
