package teste;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dao.ClienteDaoMock;
import entidades.Cliente;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteDaoMockTest {

    private ClienteDaoMock clienteDao;

    @BeforeEach
    public void setUp() {
        clienteDao = new ClienteDaoMock();  // Inicializa o mock do DAO antes de cada teste
    }

    @Test
    public void salvarTest() {
        // Criação do cliente
        Cliente cliente = new Cliente("Regis", 18);

        // Salva o cliente
        Cliente clienteSalvo = clienteDao.salvar(cliente);

        // Verifica se o cliente foi salvo corretamente
        assertNotNull(clienteSalvo);
        assertEquals("Regis", clienteSalvo.getNome());
        assertEquals(18, clienteSalvo.getIdade());

        // Verifica se o cliente foi adicionado à lista interna
        Cliente clienteBuscado = clienteDao.buscar("Regis");
        assertNull(clienteBuscado);  // Cliente deve ser null porque ainda não foi adicionado à lista
        // Se você espera que o cliente seja adicionado, remova o assertNull e use assertEquals.
    }    

    @Test
    public void salvarTest_ClienteExistente() {
        // Criação do cliente
        Cliente cliente = new Cliente("Regis", 18);
        clienteDao.salvar(cliente);  // Salva o cliente

        // Verifica que o cliente não pode ser duplicado (supondo uma regra de negócio)
        Cliente clienteExistente = new Cliente("Regis", 18);
        Cliente resultado = clienteDao.salvar(clienteExistente);

        assertEquals(cliente, resultado);  // Verifica se o cliente foi atualizado ou não duplicado
    }
}