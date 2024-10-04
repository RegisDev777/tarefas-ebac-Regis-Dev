package Generics;

public class Carro {
	
	private String nome;
    private int ano;

    
    public Carro(String nome, int ano) {
		this.nome = nome;
		this.ano = ano;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getano() {
		return ano;
	}
	public void setano(int ano) {
		this.ano = ano;
	}



	
	@Override
	public String toString() {
		return "Carro [nome=" + nome + ", ano=" + ano + "]";
	}
    
    
	
    
       
    
}
