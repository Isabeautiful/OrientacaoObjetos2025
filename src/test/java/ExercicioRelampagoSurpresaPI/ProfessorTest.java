package ExercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {
  @Test
    void deveRetornarNomeEscolaridade() {
        Escolaridade escolaridade = new Escolaridade("Mestrado");
        Professor professor = new Professor("Carlos");
        professor.setEscolaridade(escolaridade);
        assertEquals("MESTRADO", professor.getNomeEscolaridade());
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
        assertEquals("Professor sem curso", professor.getNomeTipoEnsino());
    }

    @Test
    void deveRetornarNomeDiretor() {
        Professor diretor = new Professor("Beatriz");
        Professor professor = new Professor("João");
        Curso curso = new Curso("Curso",new TipoEnsino("Presencial"));
        professor.setContratacao(curso);
        Cidade cidade = new Cidade("Juiz de fora", new Estado("MG"));
        Escola escola = new Escola("Escola XYZ", cidade);
        curso.setEscola(escola);
        escola.setDiretor(diretor);
        assertEquals("Beatriz", professor.getNomeDiretor());
    }

    @Test
    void deveRetornarProfessorSemCurso() {
        Professor professor = new Professor("Lucas");
        assertEquals("Professor sem curso", professor.getNomeDiretor());
    }

    @Test
    void deveRetornarCidadeNascimentoProfessor(){
        Cidade cidade = new Cidade("São Paulo", new Estado("SP"));
        Professor professor = new Professor("Ana");
        professor.setCidade(cidade);
        assertEquals("São Paulo", professor.getNomeCidade());
    }

    @Test
    void deveRetornarCoordenador(){
        Curso curso = new Curso("Curso de Matemática", new TipoEnsino("Presencial"));
        Professor coordenador = new Professor("Carlos");
        curso.setCoordenador(coordenador);
        Professor professor = new Professor("Ana");
        professor.setContratacao(curso);
        assertEquals("Carlos", professor.getNomeCoordenador());
    }

}