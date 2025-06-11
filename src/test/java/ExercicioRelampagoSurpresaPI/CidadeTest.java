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
            Cidade cidade = new Cidade("", new Estado("MG"));
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro: argumento nome nao pode ser uma string vazia", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoEstadoNulo() {
        try {
            Cidade cidade = new Cidade("Juiz de Fora",new Estado("MG"));
            cidade.getEstado().setNome("");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro: argumento nome nao pode ser uma string vazia", e.getMessage());
        }
    }
}