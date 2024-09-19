package AbstractFactory;

public class CarroPolularModelo extends CarroPopular {

	
	
	public void modelos() {
	   int numModel = super.getNum();
	      if(numModel == 1) {
	    	  System.out.println("Carro disponiveis da " + super.getMarca() + ":");
	    	  System.out.println("Palio - Siena - Argo - Cronos - Mobi");
	      } else if(numModel == 2) {
	    	  System.out.println("Carro disponiveis da " + super.getMarca() + ":");
	    	  System.out.println("HRV - fit - city - Civic Lxs");
	      } else if(numModel == 3) {
	    	  System.out.println("Carro disponiveis da " + super.getMarca() + ":");
	    	  System.out.println("Fox - polo - Golf - voyage - gol");
	      }
	}
	

}
