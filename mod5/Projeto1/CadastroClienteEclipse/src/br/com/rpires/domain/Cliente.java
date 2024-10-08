package br.com.rpires.domain;

import java.util.Objects;

public class Cliente {

	private String nome;
	private Long cpf;
	private Long tel;
	private String end;
	private Integer numero;
	private String cidade;
	private String estado;
	
	        //construtores
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
		
			
	         
			//getter e setter
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
		
			
			//metodos
			@Override
			public int hashCode() {
				return Objects.hash(cpf);
			}
			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Cliente other = (Cliente) obj;
				return Objects.equals(cpf, other.cpf);
			}
	
			
			@Override
			public String toString() {
			   StringBuilder sb = new StringBuilder();
			   sb.append("Nome: " + getNome() + "\n");
			   sb.append("Cpf: " + getCpf() + "\n");
			   return sb.toString();
			}
			
	   
	
	
	      
	
	
}
