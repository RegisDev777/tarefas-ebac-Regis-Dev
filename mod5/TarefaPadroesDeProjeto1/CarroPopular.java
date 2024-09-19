package AbstractFactory;

public class CarroPopular implements Carro {
     
	private int numOpção;
    private String marca;
	
	@Override
	public void exibirInfo(int num) {
	   if(num == 1) {
		      numOpção = num;
		      marca = "Fiat";
	   } else if ( num == 2 ) {
		      numOpção = num;
		      marca = "Honda";
	   } else if( num == 3) {
		      numOpção = num; 
		      marca = "Volkswagem";
	   }
	}
	

	public String getMarca() {
		return marca;
	}
	
	public int getNum() {
		return numOpção;
	}



	
	
	
}
