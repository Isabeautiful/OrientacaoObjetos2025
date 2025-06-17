package ExercicioRelampagoSurpresaHP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaisTest {
    @Test
    void deveInstanciarPais() {
        Pais pais = new Pais("Brasil");
        assertEquals("Brasil", pais.getNome());
    }

    @Test
    void deveAlterarNomePais() {
        Pais pais = new Pais("Brasil");
        pais.setNome("Argentina");
        assertEquals("Argentina", pais.getNome());
    }

    @Test
    void deveLancarExcecaoParaNomeVazio() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Pais("");
        });

        assertEquals("Erro: Nome não pode ser vazio", exception.getMessage());
    }

}