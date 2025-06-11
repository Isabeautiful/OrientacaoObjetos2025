package ExercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {
    @Test
    void deveRetornarNomeTipoEnsino() {
        TipoEnsino tipoEnsino = new TipoEnsino("Curso","Ensino Fundamental");
        Curso curso = new Curso(tipoEnsino);
        assertEquals("Ensino Fundamental", curso.getNomeTipoEnsino());
    }

    @Test
    void deveRetornarExcecaoTipoEnsinoNuloConstrutor() {
        try {
            Curso curso = new Curso("Curso", null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Tipo ensino invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoTipoEnsinoNulo() {
        try {
            Curso curso = new Curso("Curso", new TipoEnsino());
            curso.setTipoEnsino(null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Tipo ensino invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeDiretor() {
        Professor professor = new Professor("Beatriz");
        Escola escola = new Escola("Escola A");
        escola.setDirecao(professor);
        Curso curso = new Curso("Curso", new TipoEnsino());
        curso.setEscola(escola);
        assertEquals("Beatriz", curso.getNomeDiretor());
    }

    @Test
    void deveRetornarCursoSemEscola() {
        Curso curso = new Curso("Curso", new TipoEnsino());
        assertEquals("Curso sem escola", curso.getNomeDiretor());
    }
}