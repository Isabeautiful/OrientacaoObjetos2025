package ExercicioAN07;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class EmprestimoTest {

    @Test
    void deveLancarExcecaoDataNula() {
        try {
            Emprestimo e = new Emprestimo(null, "Filme");
            fail();
        } catch (IllegalArgumentException ex) {
            assertEquals("Erro: Data não pode ser nula.", ex.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoNomeFilmeVazio() {
        try {
            Emprestimo e = new Emprestimo(new Date(), "");
            fail();
        } catch (IllegalArgumentException ex) {
            assertEquals("Erro: Nome do filme não pode ser vazio.", ex.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoNomeFilmeNulo() {
        try {
            Emprestimo e = new Emprestimo(new Date(), null);
            fail();
        } catch (IllegalArgumentException ex) {
            assertEquals("Erro: Nome do filme não pode ser vazio.", ex.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoAdicionarFitaNula() {
        try {
            Emprestimo e = new Emprestimo(new Date(), "Matrix");
            e.adicionarFita(null);
            fail();
        } catch (IllegalArgumentException ex) {
            assertEquals("Erro: Fita não pode ser nula.", ex.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoRemoverFitaNula() {
        try {
            Emprestimo e = new Emprestimo(new Date(), "Matrix");
            e.removerFita(null);
            fail();
        } catch (IllegalArgumentException ex) {
            assertEquals("Erro: Fita não pode ser nula.", ex.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoRemoverFitaInexistente() {
        try {
            Emprestimo e = new Emprestimo(new Date(), "Matrix");
            Fita f = new FitaCatalogo(3);
            e.removerFita(f);
            fail();
        } catch (IllegalArgumentException ex) {
            assertEquals("Erro: Fita não encontrada na lista.", ex.getMessage());
        }
    }

    @Test
    void deveAdicionarZeroFitas() {
        Emprestimo e = new Emprestimo(new Date(), "Matrix");
        assertEquals(0, e.getNumeroFitas());
    }

    @Test
    void deveAdicionarUmaFita() {
        Emprestimo e = new Emprestimo(new Date(), "Matrix");
        Fita f = new FitaLancamento(2,1);
        e.adicionarFita(f);
        assertEquals(1, e.getNumeroFitas());
    }

    @Test
    void deveAdicionarDuasFitas() {
        Emprestimo e = new Emprestimo(new Date(), "Matrix");
        e.adicionarFita(new FitaLancamento(1,1));
        e.adicionarFita(new FitaEspecial(2,1));
        assertEquals(2, e.getNumeroFitas());
    }

    @Test
    void deveRemoverFitaComSucesso() {
        Emprestimo e = new Emprestimo(new Date(), "Matrix");
        Fita f = new FitaCatalogo(2);
        e.adicionarFita(f);
        e.removerFita(f);
        assertFalse(e.buscarFita(f));
    }

    @Test
    void deveEncontrarFita() {
        Emprestimo e = new Emprestimo(new Date(), "Matrix");
        Fita f = new FitaEspecial(3,1);
        e.adicionarFita(f);
        assertTrue(e.buscarFita(f));
    }

    @Test
    void naoDeveEncontrarFita() {
        Emprestimo e = new Emprestimo(new Date(), "Matrix");
        Fita f = new FitaCatalogo(2);
        assertFalse(e.buscarFita(f));
    }

    @Test
    void deveCalcularValorTotalEmprestimo() {
        Emprestimo e = new Emprestimo(new Date(), "Matrix");
        e.adicionarFita(new FitaCatalogo(2));   // 2.0
        e.adicionarFita(new FitaEspecial(2,1));   // 6.0
        e.adicionarFita(new FitaLancamento(1,1)); // 4.0

        float esperado = 2.0f + 6.0f + 5.0f;
        assertEquals(esperado, e.calcularValor());
    }

    @Test
    void deveListarFitas() {
        Emprestimo e = new Emprestimo(new Date(), "Matrix");
        e.adicionarFita(new FitaCatalogo(1));
        String lista = e.listarFitas();
        assertTrue(lista.contains("FitaCatalogo"));
    }

    @Test
    void deveGerarDescricao() {
        Date hoje = new Date();
        Emprestimo e = new Emprestimo(hoje, "Matrix");
        e.adicionarFita(new FitaCatalogo(1));

        String descricao = e.getDescricao();
        assertTrue(descricao.contains("Matrix"));
        assertTrue(descricao.contains("Valor Total: R$"));
        assertTrue(descricao.contains(hoje.toString()));
    }

    @Test
    void deveRetornarFitas() {
        Emprestimo e = new Emprestimo(new Date(), "Matrix");
        Fita f1 = new FitaCatalogo(2);
        Fita f2 = new FitaEspecial(1,1);
        e.adicionarFita(f1);
        e.adicionarFita(f2);

        ArrayList<Fita> listaEsperada = new ArrayList<>();
        listaEsperada.add(f1);
        listaEsperada.add(f2);

        assertEquals(listaEsperada, e.getFitas());
    }
}
