package AbstractFactory;

public class CarroEsportivo implements Carro {

	
	private int numOpção;
    private String marca;
	
	@Override
	public void exibirInfo(int num) {
	   if(num == 1) {
		      numOpção = num;
		      marca = "Audi";
	   } else if ( num == 2 ) {
		      numOpção = num;
		      marca = "Volkswagem";
	   } else if( num == 3) {
		      numOpção = num; 
		      marca = "Bmw";
	   }
	}
	

	public String getMarca() {
		return marca;
	}
	
	public int getNum() {
		return numOpção;
	}

	

}
