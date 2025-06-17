package ExercicioRelampagoSurpresaHP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class CidadeTest {
    @Test
    void deveInstanciarCidade() {
        Estado estado = new Estado("MG", new Pais("Brasil"));
        Cidade cidade = new Cidade("Juiz de Fora", estado);

        assertEquals("Juiz de Fora", cidade.getNome());
        assertEquals("MG", cidade.getNomeEstado());
        assertEquals("Brasil", cidade.getNomePais());
    }

    @Test
    void deveAlterarNomeCidade() {
        Estado estado = new Estado("MG", new Pais("Brasil"));
        Cidade cidade = new Cidade("Juiz de Fora", estado);

        cidade.setNome("Belo Horizonte");

        assertEquals("Belo Horizonte", cidade.getNome());
    }

    @Test
    void deveLancarExcecaoNomeCidadeVazio() {
        try {
            Estado estado = new Estado("MG", new Pais("Brasil"));
            Cidade cidade = new Cidade("", estado);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Nome não pode ser vazio", e.getMessage());
        }
    }

    @Test
    void deveAlterarEstadoCidade() {
        Estado estado1 = new Estado("MG", new Pais("Brasil"));
        Estado estado2 = new Estado("SP", new Pais("Brasil"));
        Cidade cidade = new Cidade("Juiz de Fora", estado1);

        cidade.setEstado(estado2);

        assertEquals("SP", cidade.getNomeEstado());
    }

    @Test
    void deveLancarExcecaoEstadoNulo() {
        try {
            Cidade cidade = new Cidade("Juiz de Fora", null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Estado não pode ser nulo", e.getMessage());
        }
    }
}