package Hospital;

/**
 * Interface InfPaciente (Informações do Paciente).
 * <p>
 * Este contrato define os métodos que devem ser implementados por qualquer classe que implemente esta interface.
 * <p>
 * As classes que implementam esta interface devem fornecer implementações concretas para os métodos definidos aqui.
 */
public interface InfPaciente {

    /**
     * Define o nome do paciente.
     *
     * @param nome O nome do paciente.
     */
    void setNome(String nome);

    /**
     * Define o CPF do paciente.
     *
     * @param cpf O CPF do paciente.
     */
    void setCpf(String cpf);

    /**
     * Define a idade do paciente.
     *
     * @param idade A idade do paciente.
     */
    void setIdade(String idade);

    /**
     * Define o endereço do paciente.
     *
     * @param endereço O endereço do paciente.
     */
    void setEndereço(String endereço);
}
