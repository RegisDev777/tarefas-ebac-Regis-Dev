package Hospital;


/**
 * InfPacienteBuilder
 * <p>
 * Esta classe é uma implementação intermediária da interface InfPaciente. Ela fornece
 * a implementação dos métodos definidos pela interface e mantém as variáveis de controle
 * necessárias para criar um objeto Paciente.
 * <p>
 * As variáveis são usadas para armazenar os dados do paciente antes de criar uma instância
 * da classe Paciente.
 */
public class InfPacienteBuilder implements InfPaciente {

    /**
     * Variáveis de controle para armazenar informações do paciente.
     */
    private String nome;
    private String cpf;
    private String idade;
    private String endereço;

    /**
     * Define o nome do paciente.
     *
     * @param nome O nome do paciente.
     */
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Define o CPF do paciente.
     *
     * @param cpf O CPF do paciente.
     */
    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * Define a idade do paciente.
     *
     * @param idade A idade do paciente.
     */
    @Override
    public void setIdade(String idade) {
        this.idade = idade;
    }

    /**
     * Define o endereço do paciente.
     *
     * @param endereço O endereço do paciente.
     */
    @Override
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    /**
     * Cria um objeto Paciente com os dados fornecidos.
     *
     * @return Uma nova instância de {@link Paciente} com os dados definidos.
     */
    public Paciente getResultado() {
        return new Paciente(nome, cpf, idade, endereço);
    }
}
	
	