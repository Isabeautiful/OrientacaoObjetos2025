package ExercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {
    @Test
    void deveRetornarNomeTipoEnsino() {
        TipoEnsino tipoEnsino = new TipoEnsino("Ensino Fundamental");
        Curso curso = new Curso("Curso",tipoEnsino);
        assertEquals("Ensino Fundamental", curso.getNomeTipoEnsino());
    }

    @Test
    void deveRetornarExcecaoTipoEnsinoNuloConstrutor() {
        try {
            Curso curso = new Curso("Curso", null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro: argumento tipo de ensino nao pode ser nulo", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoTipoEnsinoNulo() {
        try {
            Curso curso = new Curso("Curso", new TipoEnsino("Ensino Superior"));
            curso.setTipoEnsino(null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro: argumento tipo de ensino nao pode ser nulo", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeDiretor() {
        Professor professor = new Professor("Beatriz");
        Cidade cidade = new Cidade("Juiz de Fora", new Estado("MG"));
        Escola escola = new Escola("Escola A", cidade);
        escola.setDiretor(professor);
        Curso curso = new Curso("Curso", new TipoEnsino("Ensino Superior"));
        curso.setEscola(escola);
        assertEquals("Beatriz", curso.getNomeDiretor());
    }

    @Test
    void deveRetornarNomeCoordenador() {
        Professor coordenador = new Professor("Carlos");
        Curso curso = new Curso("Curso", new TipoEnsino("Ensino Superior"));
        curso.setCoordenador(coordenador);
        assertEquals("Carlos", curso.getNomeCoordenador());
    }

    @Test
    void deveRetornarCursoSemCoordenador() {
        Curso curso = new Curso("Curso", new TipoEnsino("Ensino Superior"));
        assertEquals("Curso nao possui coordenador", curso.getNomeCoordenador());
    }

    @Test
    void deveRetornarNomeEscola() {
        Cidade cidade = new Cidade("Juiz de Fora", new Estado("MG"));
        Escola escola = new Escola("Escola B", cidade);
        Curso curso = new Curso("Curso", new TipoEnsino("Ensino Superior"));
        curso.setEscola(escola);
        assertEquals("Escola B", curso.getNomeEscola());
    }

    @Test
    void deveRetornarCursoSemEscola() {
        Curso curso = new Curso("Curso", new TipoEnsino("Ensino Superior"));
        assertEquals("Curso nao vinculado a escola", curso.getNomeEscola());
    }

    @Test
    void deveRetornarNomeCurso() {
        Curso curso = new Curso("Curso", new TipoEnsino("Ensino Superior"));
        assertEquals("Curso", curso.getNome());
    }

    @Test
    void deveRetornarExcecaoNomeCursoVazio() {
        try {
            Curso curso = new Curso("", new TipoEnsino("Ensino Superior"));
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: argumento nome nao pode ser vazio", e.getMessage());
        }
    }

    @Test
    void deveRetornarEscolaridadeCoordenador() {
        Escolaridade escolaridade = new Escolaridade("Mestrado");
        Professor coordenador = new Professor("Ana");
        coordenador.setEscolaridade(escolaridade);
        Curso curso = new Curso("Curso", new TipoEnsino("Ensino Superior"));
        curso.setCoordenador(coordenador);
        assertEquals("MESTRADO", curso.getNomeEscolaridadeCoordenador());
    }

    @Test
    void deveRetornarCoordenadorSemEscolaridade() {
        Professor coordenador = new Professor("João");
        Curso curso = new Curso("Curso", new TipoEnsino("Ensino Superior"));
        curso.setCoordenador(coordenador);
        assertEquals("Pessoa sem escolaridade", curso.getNomeEscolaridadeCoordenador());
    }

    @Test
    void deveRetornarCoordenadorSemEscolaridadeCoordenadorNull() {
        Curso curso = new Curso("Curso", new TipoEnsino("Ensino Superior"));
        assertEquals("Curso sem coordenador", curso.getNomeEscolaridadeCoordenador());
    }
    //TODO: teste nome Estado 2x
}