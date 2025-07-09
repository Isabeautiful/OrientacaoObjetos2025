package ExercicioAN07;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveLancarExcecaoCodigoInvalido() {
        try {
            Cliente cliente = new Cliente(-1, "João");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Código inválido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoNomeInvalido() {
        try {
            Cliente cliente = new Cliente(1, "");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Nome inválido, string vazia", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoAdicionarEmprestimoNulo() {
        try {
            Cliente cliente = new Cliente(1, "João");
            cliente.addEmprestimo(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Empréstimo não pode ser nulo", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoRemoverEmprestimoNulo() {
        try {
            Cliente cliente = new Cliente(1, "João");
            cliente.removerEmprestimo(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Empréstimo não pode ser nulo.", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoRemoverEmprestimoInexistente() {
        try {
            Cliente cliente = new Cliente(1, "João");
            Emprestimo emprestimo = new Emprestimo(new Date(), "Inception");
            cliente.removerEmprestimo(emprestimo);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Empréstimo não encontrado na lista.", e.getMessage());
        }
    }

    @Test
    void deveAdicionarZeroEmprestimos() {
        Cliente cliente = new Cliente(1, "João");
        assertEquals(0, cliente.getNumeroEmprestimos());
    }

    @Test
    void deveAdicionarUmEmprestimo() {
        Cliente cliente = new Cliente(1, "João");
        Emprestimo e = new Emprestimo(new Date(), "Filme A");
        e.adicionarFita(new FitaCatalogo(2));
        cliente.addEmprestimo(e);
        assertEquals(1, cliente.getNumeroEmprestimos());
    }

    @Test
    void deveAdicionarDoisEmprestimos() {
        Cliente cliente = new Cliente(1, "João");
        Emprestimo e1 = new Emprestimo(new Date(), "Filme A");
        e1.adicionarFita(new FitaEspecial(2,1));

        Emprestimo e2 = new Emprestimo(new Date(), "Filme B");
        e2.adicionarFita(new FitaLancamento(1,1));

        cliente.addEmprestimo(e1);
        cliente.addEmprestimo(e2);

        assertEquals(2, cliente.getNumeroEmprestimos());
    }

    @Test
    void deveRemoverEmprestimo() {
        Cliente cliente = new Cliente(1, "João");
        Emprestimo e = new Emprestimo(new Date(), "Matrix");
        e.adicionarFita(new FitaCatalogo(3));
        cliente.addEmprestimo(e);
        cliente.removerEmprestimo(e);
        assertFalse(cliente.buscarEmprestimo(e));
    }

    @Test
    void deveListarEmprestimos() {
        Cliente cliente = new Cliente(1, "João");
        Emprestimo e1 = new Emprestimo(new Date(), "Titanic");
        e1.adicionarFita(new FitaEspecial(2,1));
        cliente.addEmprestimo(e1);

        assertTrue(cliente.listarEmprestimos().contains("Titanic"));
    }

    @Test
    void deveCalcularTotalEmprestimos() {
        Cliente cliente = new Cliente(1, "João");

        Emprestimo e1 = new Emprestimo(new Date(), "Titanic");
        e1.adicionarFita(new FitaEspecial(2,1)); // 6.0

        Emprestimo e2 = new Emprestimo(new Date(), "Avatar");
        e2.adicionarFita(new FitaCatalogo(3)); // 3.0

        cliente.addEmprestimo(e1);
        cliente.addEmprestimo(e2);

        float esperado = 17.0f;
        assertEquals(esperado, cliente.calcularTotalEmprestimos());
    }

    @Test
    void deveEncontrarEmprestimo() {
        Cliente cliente = new Cliente(1, "João");
        Emprestimo e = new Emprestimo(new Date(), "Inception");
        e.adicionarFita(new FitaCatalogo(1));
        cliente.addEmprestimo(e);
        assertTrue(cliente.buscarEmprestimo(e));
    }

    @Test
    void naoDeveEncontrarEmprestimo() {
        Cliente cliente = new Cliente(1, "João");
        Emprestimo e = new Emprestimo(new Date(), "Inception");
        assertFalse(cliente.buscarEmprestimo(e));
    }

    @Test
    void deveRetornarEmprestimos() {
        Cliente cliente = new Cliente(1, "João");
        Emprestimo e1 = new Emprestimo(new Date(), "Filme 1");
        e1.adicionarFita(new FitaEspecial(2,1));

        Emprestimo e2 = new Emprestimo(new Date(), "Filme 2");
        e2.adicionarFita(new FitaCatalogo(3));

        cliente.addEmprestimo(e1);
        cliente.addEmprestimo(e2);

        ArrayList<Emprestimo> lista = new ArrayList<>();
        lista.add(e1);
        lista.add(e2);

        assertEquals(lista, cliente.getEmprestimos());
    }
}
