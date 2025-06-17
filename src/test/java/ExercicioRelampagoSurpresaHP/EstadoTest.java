package ExercicioRelampagoSurpresaHP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoTest {
    @Test
    void deveInstanciarEstado() {
        Estado estado = new Estado("MG", new Pais("Brasil"));

        assertEquals("MG", estado.getNome());
        assertEquals("Brasil", estado.getNomePais());
    }

    @Test
    void deveAlterarNomeEstado() {
        Estado estado = new Estado("MG", new Pais("Brasil"));

        estado.setNome("SP");

        assertEquals("SP", estado.getNome());
    }

    @Test
    void deveLancarExcecaoNomeEstadoVazio() {
        try {
            Estado estado = new Estado("", new Pais("Brasil"));
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Nome não pode ser vazio", e.getMessage());
        }
    }

    @Test
    void deveAlterarPaisEstado() {
        Pais pais1 = new Pais("Brasil");
        Pais pais2 = new Pais("Argentina");
        Estado estado = new Estado("MG", pais1);

        estado.setPais(pais2);

        assertEquals("Argentina", estado.getNomePais());
    }

    @Test
    void deveLancarExcecaoPaisNulo() {
        try {
            Estado estado = new Estado("MG", null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: País não pode ser nulo", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomePais() {
        Pais pais = new Pais("Brasil");
        Estado estado = new Estado("MG", pais);

        assertEquals("Brasil", estado.getNomePais());
    }
}