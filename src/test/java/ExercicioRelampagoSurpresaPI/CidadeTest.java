package ExercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadeTest {
    @Test
    void deveRetornarNomeEstado() {
        Estado estado = new Estado("Minas Gerais");
        Cidade cidade = new Cidade("Juiz de Fora",estado);
        assertEquals("Minas Gerais", cidade.getNomeEstado());
    }

    @Test
    void deveRetornarExcecaoEstadoNuloConstrutor() {
        try {
            Cidade cidade = new Cidade(null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro: argumento Estado nao pode ser nulo", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoEstadoNulo() {
        try {
            Cidade cidade = new Cidade(new Estado());
            cidade.setEstado(null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro: argumento estado nao Pode ser Nulo", e.getMessage());
        }
    }
}