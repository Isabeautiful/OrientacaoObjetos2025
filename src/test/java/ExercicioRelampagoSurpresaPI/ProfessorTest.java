package ExercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {
  @Test
    void deveRetornarNomeEscolaridade() {
        Escolaridade escolaridade = new Escolaridade("Mestrado");
        Professor professor = new Professor("Carlos");
        professor.setEscolaridade(escolaridade);
        assertEquals("Mestrado", professor.getNomeEscolaridade());
    }

    @Test
    void deveRetornarPessoaSemEscolaridade() {
        Professor professor = new Professor("Ana");
        assertEquals("Pessoa sem escolaridade", professor.getNomeEscolaridade());
    }

    @Test
    void deveRetornarNomeTipoEnsino() {
        TipoEnsino tipoEnsino = new TipoEnsino("Ensino Fundamental");
        Curso curso = new Curso("Curso", tipoEnsino);
        Professor professor = new Professor("Maria");
        professor.setContratacao(curso);
        assertEquals("Ensino Fundamental", professor.getNomeTipoEnsino());
    }

    @Test
    void deveRetornarTipoEnsinoVazio() {
        Professor professor = new Professor("Ana");
        assertEquals("Professor nao trabalha nesse curso", professor.getNomeTipoEnsino());
    }

    @Test
    void deveRetornarNomeDiretor() {
        Professor diretor = new Professor("Beatriz");
        Professor professor = new Professor("João");
        Curso curso = new Curso("Curso",new TipoEnsino());
        professor.setContratacao(curso);
        Escola escola = new Escola("Escola XYZ");
        curso.setEscola(escola);
        escola.setDirecao(diretor);
        assertEquals("Beatriz", professor.getNomeDiretor());
    }

    @Test
    void deveRetornarProfessorSemCurso() {
        Professor professor = new Professor("Lucas");
        assertEquals("Professor nao trabalha nesse curso", professor.getNomeDiretor());
    }

}