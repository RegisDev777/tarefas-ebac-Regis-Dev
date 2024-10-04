package Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Garagem<T> {

    // Inicializar nossa garagem genérica e garagem específica por marca
    private List<T> garagemGenerica;
    private Map<String, List<T>> garagemEspecificas;

    public Garagem() {
        garagemGenerica = new ArrayList<>();
        garagemEspecificas = new HashMap<>();
    }

    /**
     * Coloca veículos em uma garagem genérica.
     * 
     * @param veiculo O veículo a ser adicionado na garagem genérica.
     */
    public void guardaVeiculoMisturados(T veiculo) {
        garagemGenerica.add(veiculo);
    }

    /**
     * Adiciona um veículo à garagem específica de uma determinada marca.
     * <p>
     * O método verifica se já existe uma lista de veículos para a marca fornecida.
     * Se a lista já existir, o veículo é adicionado a essa lista. Caso contrário,
     * uma nova lista para a marca é criada e o veículo é adicionado a ela.
     * 
     * @param marca   A marca do veículo (por exemplo, "Honda", "Nissan").
     *                Esta será a chave usada no mapa {@code garagemEspecificas}.
     * @param veiculo O veículo a ser guardado na garagem específica dessa marca.
     */
    public void guardaVeiculoPorMarca(String marca, T veiculo) {
        // Se a marca ainda não existir, cria uma nova lista para ela
        garagemEspecificas.computeIfAbsent(marca, k -> new ArrayList<>()).add(veiculo);
    }

    /**
     * Mostra todos os veículos na garagem genérica.
     */
    public void mostrarGaragemGenerica() {
        for (T veiculo : garagemGenerica) {
            System.out.println(veiculo);
        }
    }

    /**
     * Mostra todos os veículos de uma marca específica armazenados na garagem.
     * 
     * @param marca A marca dos veículos que deseja visualizar.
     */
    public void mostrarVeiculosPorMarca(String marca) {
        List<T> veiculos = garagemEspecificas.get(marca);
        if (veiculos != null) {
            for (T veiculo : veiculos) {
                System.out.println(veiculo);
            }
        } else {
            System.out.println("Nenhum veículo encontrado para a marca " + marca);
        }
    }
}