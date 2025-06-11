package ExercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TipoEnsinoTest {
    @Test
    void alteraNomeTipoEnsino() {
        TipoEnsino tipoEnsino = new TipoEnsino("Presencial");
        assertEquals("Presencial", tipoEnsino.getNome());
    }

    @Test
    void deveLancarExcecaoAoCriarTipoEnsinoNomeInvalido() {
        try {
            TipoEnsino tipoEnsino = new TipoEnsino("");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: argumento nome nao pode ser vazio", e.getMessage());
        }
    }

}