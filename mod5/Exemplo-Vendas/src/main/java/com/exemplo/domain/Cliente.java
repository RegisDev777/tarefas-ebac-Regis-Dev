package com.exemplo.domain;



public class Cliente {

	private String nome;
	private Long cpf;
	private Long tel;
	private String end;
	private Integer numero;
	private String cidade;
	private String estado;
	
	       ///Construtores
		   public Cliente() {
			// TODO Auto-generated constructor stub
	 	   }
		   public Cliente(String nome, Long cpf, Long tel, String end, Integer numero, String cidade, String estado) {
			this.nome = nome;
			this.cpf = cpf;
			this.tel = tel;
			this.end = end;
			this.numero = numero;
			this.cidade = cidade;
			this.estado = estado;
		  }

	            //getters e setters
		   		public String getNome() {
		 	 return nome;
		    }
		    	public void setNome(String nome) {
				this.nome = nome;
			}
		        

		    	public Long getCpf() {
				 return cpf;
		    	}
		    	public void setCpf(Long cpf) {
				this.cpf = cpf;
			}
	    
	        
		    	public Long getTel() {
					return tel;
				}
		    	public void setTel(Long tel) {
					this.tel = tel;
				}
			
		    	
		    	public String getEnd() {
					return end;
				}
				public void setEnd(String end) {
					this.end = end;
				}
				
				
				public Integer getNumero() {
					return numero;
				}
				public void setNumero(Integer numero) {
					this.numero = numero;
				}
				
				
				public String getCidade() {
					return cidade;
				}
				public void setCidade(String cidade) {
					this.cidade = cidade;
				}
				
				
				public String getEstado() {
					return estado;
				}
				public void setEstado(String estado) {
					this.estado = estado;
				}
		    	
		    	
		    	
		    	
}
