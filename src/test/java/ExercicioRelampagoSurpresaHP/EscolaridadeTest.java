package ExercicioRelampagoSurpresaHP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaridadeTest {
    @Test
    void deveInstanciarEscolaridade() {
        Escolaridade escolaridade = new Escolaridade("Ensino Médio");

        assertEquals("Ensino Médio", escolaridade.getNome());
    }

    @Test
    void deveAlterarNomeEscolaridade() {
        Escolaridade escolaridade = new Escolaridade("Ensino Médio");

        escolaridade.setNome("Ensino Superior");

        assertEquals("Ensino Superior", escolaridade.getNome());
    }

    @Test
    void deveLancarExcecaoNomeEscolaridadeVazio() {
        try {
            Escolaridade escolaridade = new Escolaridade("");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Nome não pode ser vazio", e.getMessage());
        }
    }
}