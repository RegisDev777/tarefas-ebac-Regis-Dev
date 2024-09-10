package testCodigo;

public class Juridica extends pessoas{
     
	private String cnpj;
	private String ramoAtividade;
	private int numeroDeFuncionarios;
	
	public Juridica() {
		// TODO Auto-generated constructor stub
	}

	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRamoAtividade() {
		return ramoAtividade;
	}
	public void setRamoAtividade(String ramoAtividade) {
		this.ramoAtividade = ramoAtividade;
	}

	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}
	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}
	   
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome da empresa: " + getNome() + "\n");
		sb.append("cnpj da empresa: " + getCnpj() + "\n");
		sb.append("numeros de funcionario " + getNumeroDeFuncionarios() + "\n");
		sb.append("Ramo: " + getRamoAtividade() + "\n");		
		return sb.toString();
	}
	
}
