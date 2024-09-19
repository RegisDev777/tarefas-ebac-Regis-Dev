package AbstractFactory;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        FabricaMovel fc = new FabricaCarro();
        Scanner sc = new Scanner(System.in);

        System.out.println("Catalogo");
        System.out.println("(1) - popular");
        System.out.println("(2) - esportivo");
        int tipoCarro = sc.nextInt();

        System.out.println("Escolha o número da marca:");
        System.out.println("(1) - Marca 1");
        System.out.println("(2) - Marca 2");
        System.out.println("(3) - Marca 3");
        int num = sc.nextInt();

        if (tipoCarro == 1) {
            // Carro Popular
            CarroPopular carro = (CarroPopular) fc.criarCarroPopular();
            carro.exibirInfo(num);
            CarroPolularModelo carrosModelo = new CarroPolularModelo();
            carrosModelo.exibirInfo(num); // Também precisa ser configurado
            carrosModelo.modelos();
        } else if (tipoCarro == 2) {
            // Carro Esportivo
            CarroEsportivo carro = (CarroEsportivo) fc.criarCarroEsportivo();
            carro.exibirInfo(num);
            CarroEsportivoModelo carroEsportivoModelo = new CarroEsportivoModelo();
            carroEsportivoModelo.exibirInfo(num); // Também precisa ser configurado
            carroEsportivoModelo.modelos();
        }

        sc.close();
    }
}
