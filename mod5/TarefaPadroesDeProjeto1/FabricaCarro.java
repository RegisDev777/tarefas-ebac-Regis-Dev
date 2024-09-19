package AbstractFactory;

public class FabricaCarro implements FabricaMovel {

	@Override
	public CarroPopular criarCarroPopular() {
		return new CarroPopular();
	}


	@Override
	public Carro criarCarroEsportivo() {
       return new CarroEsportivo();
	}

}
