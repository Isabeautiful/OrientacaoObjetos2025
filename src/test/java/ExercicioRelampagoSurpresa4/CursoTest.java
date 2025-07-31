package ExercicioRelampagoSurpresa4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveLancarExcecaoAdicionarAlunoNulo() {
        try {
            Curso curso = new Curso();
            curso.adicionarAluno(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: aluno não pode ser nulo", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoAdicionarTurmaNula() {
        try {
            Curso curso = new Curso();
            curso.adicionarTurma(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: turma não pode ser nula", e.getMessage());
        }
    }

    @Test
    void deveAdicionarZeroAlunos(){
        Curso curso = new Curso();
        assertEquals(0, curso.getNumeroAlunos());
    }

    @Test
    void deveAdicionarZeroTurmas(){
        Curso curso = new Curso();
        assertEquals(0, curso.getNumeroTurmas());
    }

    @Test
    void deveAdicionarAluno() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno("João");
        curso.adicionarAluno(aluno);
        assertEquals(1, curso.getNumeroAlunos());
    }

    @Test
    void deveAdicionarTurma() {
        Curso curso = new Curso();
        Turma turma = new Turma();
        curso.adicionarTurma(turma);
        assertEquals(1, curso.getNumeroTurmas());
    }

    @Test
    void deveAdicionarDoisAlunos(){
        Curso curso = new Curso();
        curso.adicionarAluno(new Aluno("Ana"));
        curso.adicionarAluno(new Aluno("Anne"));

        assertEquals(2, curso.getNumeroAlunos());
    }

    @Test
    void deveAdicionarDuasTurmas(){
        Curso curso = new Curso();
        curso.adicionarTurma(new Turma());
        curso.adicionarTurma(new Turma());

        assertEquals(2,curso.getNumeroTurmas());
    }

    @Test
    void deveRemoverAluno() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno("João");
        curso.adicionarAluno(aluno);
        curso.removerAluno(aluno);
        assertEquals(0, curso.getNumeroAlunos());
    }

    @Test
    void deveRemoverTurma() {
        Curso curso = new Curso();
        Turma turma = new Turma();
        curso.adicionarTurma(turma);
        curso.removerTurma(turma);
        assertEquals(0, curso.getNumeroTurmas());
    }

    @Test
    void deveLancarExcecaoRemoverAlunoNaoExistente() {
        try {
            Curso curso = new Curso();
            curso.removerAluno(new Aluno("Ana"));
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: aluno não encontrado na lista", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoRemoverTurmaNaoExistente() {
        try {
            Curso curso = new Curso();
            curso.removerTurma(new Turma());
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Turma não encontrada na lista", e.getMessage());
        }
    }

    @Test
    void deveListarProfessoresTurmas() {
        Curso curso = new Curso();
        Turma turma1 = new Turma();
        Turma turma2 = new Turma();

        Professor professor1 = new Professor("Professor A");
        Professor professor2 = new Professor("Professor B");

        turma1.setProfessor(professor1);
        turma2.setProfessor(professor2);

        curso.adicionarTurma(turma1);
        curso.adicionarTurma(turma2);

        assertEquals("Professor A, Professor B", curso.listarProfessoresTurmas());
    }

    @Test
    void deveListarDisciplinasCurso() {
        Curso curso = new Curso();
        Turma turma1 = new Turma();
        Turma turma2 = new Turma();

        Disciplina disciplina1 = new Disciplina("Matemática");
        Disciplina disciplina2 = new Disciplina("Física");

        turma1.setDisciplina(disciplina1);
        turma2.setDisciplina(disciplina2);

        curso.adicionarTurma(turma1);
        curso.adicionarTurma(turma2);

        assertEquals("Matemática, Física", curso.listarDisciplinasCurso());
    }

    @Test
    void deveRetornarNomesAlunos() {
        Aluno aluno1 = new Aluno("Joao");
        Aluno aluno2 = new Aluno("Ana");
        Aluno aluno3 = new Aluno("Jose");
        Aluno aluno4 = new Aluno("Beatriz");
        Turma turma1 = new Turma();
        Turma turma2 = new Turma();
        turma1.adicionarAluno(aluno1);
        turma1.adicionarAluno(aluno2);
        turma2.adicionarAluno(aluno3);
        turma2.adicionarAluno(aluno4);
        Curso curso = new Curso();
        curso.adicionarTurma(turma1);
        curso.adicionarTurma(turma2);
        List<String> resultado = Arrays.asList("Joao", "Ana", "Jose", "Beatriz");
        assertEquals(resultado, curso.listarAlunosTurmaCurso());
    }

    @Test
    void deveListarAlunosCurso() {
        Curso curso = new Curso();

        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Ana");

        curso.adicionarAluno(aluno1);
        curso.adicionarAluno(aluno2);

        assertEquals("João, Ana", curso.listarAlunosCurso());
    }

    @Test
    void deveVerificarAlunoNoCurso() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno("João");

        curso.adicionarAluno(aluno);

        assertTrue(curso.verificarAlunoCurso(aluno));
    }

    @Test
    void naoDeveVerificarAlunoNoCurso() {
        Curso curso = new Curso();
        Aluno aluno = new Aluno("João");

        assertFalse(curso.verificarAlunoCurso(aluno));
    }

    @Test
    void deveVerificarTurmaNoCurso() {
        Curso curso = new Curso();
        Turma turma = new Turma();

        curso.adicionarTurma(turma);

        assertTrue(curso.verificarTurmaCurso(turma));
    }

    @Test
    void naoDeveVerificarTurmaNoCurso() {
        Curso curso = new Curso();
        Turma turma = new Turma();

        assertFalse(curso.verificarTurmaCurso(turma));
    }

}