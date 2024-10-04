package Generics;

public class Main {

    public static void main(String[] args) {
        // Criação de uma garagem para armazenar veículos
        Garagem<Carro> garagem = new Garagem<>();

        // Criação de veículos de diferentes marcas
        Carro hondaCivic = new Honda("Civic", 2020);
        Carro nissanSentra = new Nissan("Sentra", 2019);
        Carro mercedesCClass = new Mercedes("C-Class", 2021);

        // Guardar veículos na garagem genérica
        garagem.guardaVeiculoMisturados(hondaCivic);
        garagem.guardaVeiculoMisturados(nissanSentra);
        garagem.guardaVeiculoMisturados(mercedesCClass);

        // Guardar veículos por marca específica
        garagem.guardaVeiculoPorMarca("Honda", hondaCivic);
        garagem.guardaVeiculoPorMarca("Nissan", nissanSentra);
        garagem.guardaVeiculoPorMarca("Mercedes", mercedesCClass);

        // Exibir os veículos na garagem genérica
        System.out.println("Veículos na garagem genérica:");
        garagem.mostrarGaragemGenerica();

        // Exibir os veículos por marca específica
        System.out.println("\nVeículos da marca Honda:");
        garagem.mostrarVeiculosPorMarca("Honda");

        System.out.println("\nVeículos da marca Nissan:");
        garagem.mostrarVeiculosPorMarca("Nissan");

        System.out.println("\nVeículos da marca Mercedes:");
        garagem.mostrarVeiculosPorMarca("Mercedes");
    }
}