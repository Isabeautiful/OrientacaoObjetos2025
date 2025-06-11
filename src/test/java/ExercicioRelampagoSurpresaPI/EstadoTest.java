package ExercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoTest {
    @Test
    void alteraNomeEstado() {
        Estado estado = new Estado("São Paulo");
        assertEquals("São Paulo", estado.getNome());
    }

    @Test
    void deveLancarExcecaoAoCriarEstadoNomeInvalido() {
        try {
            Estado estado = new Estado("");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: argumento nome nao pode ser uma string vazia", e.getMessage());
        }
    }
}