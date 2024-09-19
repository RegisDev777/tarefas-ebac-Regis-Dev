package AbstractFactory;

public class CarroEsportivoModelo extends CarroEsportivo{

	public void modelos() {
		   int numModel = super.getNum();
		      if(numModel == 1) {
		    	  System.out.println("Carro disponiveis da " + super.getMarca() + ":");
		    	  System.out.println("Rs4 - Q3 - A3 sportback");
		   
		      } else if(numModel == 2) {
		    	  System.out.println("Carro disponiveis da " + super.getMarca() + ":");
		    	  System.out.println("Jetta - Golf gti - passat V6 - Tiguan ");
		      } else if(numModel == 3) {
		    	  System.out.println("Carro disponiveis da " + super.getMarca() + ":");
		    	  System.out.println("M1 - M2");
		      }
		}

	
	
}
