package ExercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {
    @Test
    void deveInstanciarAluno(){
        Estado estado = new Estado("E1");
        Cidade cidade = new Cidade("C1", estado);
        Aluno aluno = new Aluno("A1", cidade);
        assertEquals("A1", aluno.getNome());
        assertEquals("C1", aluno.getNomeCidade());
        assertEquals("E1", aluno.getNomeEstado());
    }

    @Test
    void deveAlterarCurso(){
        Estado estado = new Estado("E1");
        Cidade cidade = new Cidade("C1", estado);
        Curso curso = new Curso("Curso1");
        Aluno aluno = new Aluno("A1", cidade);
        aluno.setCurso(curso);
        assertEquals("Curso1", aluno.getNomeCurso());
    }

    @Test
    void deveAlterarCursoNaoMatriculado(){
        Estado estado = new Estado("E1");
        Cidade cidade = new Cidade("C1", estado);
        Aluno aluno = new Aluno("A1", cidade);
        aluno.setCurso(null);
        assertEquals("Aluno nao matriculado", aluno.getNomeCurso());
    }

}