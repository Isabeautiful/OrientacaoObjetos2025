package ExercicioRelampagoSurpresa4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class TurmaTest {

    @Test
    void deveAdicionarZeroAlunos(){
        Turma turma = new Turma();
        assertEquals(0, turma.getNumeroAlunos());
    }

    @Test
    void deveAdicionarUmAluno(){
        Turma turma = new Turma();
        Aluno aluno = new Aluno("Ana");
        turma.adicionarAluno(aluno);
        assertEquals(1, turma.getNumeroAlunos());
    }

    @Test
    void deveAdicionarDoisAlunos(){
        Turma turma = new Turma();
        Aluno aluno = new Aluno("Ana");
        turma.adicionarAluno(aluno);
        turma.adicionarAluno(new Aluno("Anne"));
        assertEquals(2, turma.getNumeroAlunos());
    }


    @Test
    void deveLancarExcecaoAdicionarAlunoNulo(){
        try{
            Turma turma = new Turma();
            turma.adicionarAluno(null);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: aluno invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoRemoverAlunoNulo(){
        try {
            Turma turma = new Turma();
            turma.removerAluno(null);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Aluno não pode ser nulo", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoRemoverAlunoNaoExistente(){
        try {
            Turma turma = new Turma();
            turma.removerAluno(new Aluno("Ana"));
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Aluno não encontrado na lista", e.getMessage());
        }
    }

    @Test
    void deveListarAlunosTurma(){
        Turma turma = new Turma();
        Aluno aluno1 = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("João");

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);

        List<String> resultado = Arrays.asList("Pedro", "João");

        assertEquals(resultado, turma.listarAlunos());
    }

    //exemplo do prof:
    @Test
    void deveRetornarNomesAlunos() {
        AExercicioRS4FeitoPeloProfessor.Aluno aluno1 = new AExercicioRS4FeitoPeloProfessor.Aluno("Pedro");
        AExercicioRS4FeitoPeloProfessor.Aluno aluno2 = new AExercicioRS4FeitoPeloProfessor.Aluno("Joao");
        AExercicioRS4FeitoPeloProfessor.Turma turma = new AExercicioRS4FeitoPeloProfessor.Turma();
        turma.matricular(aluno1);
        turma.matricular(aluno2);
        List<String> resultado = Arrays.asList("Pedro", "Joao");
        assertEquals(resultado, turma.getNomesAlunos());
    }

    @Test
    void deveVerificarAlunoTurma(){
        Turma turma = new Turma();
        Aluno aluno = new Aluno("Ana");

        turma.adicionarAluno(aluno);

        assertTrue(turma.verificarAlunoTurma(aluno));
    }

    @Test
    void deveNaoEncontrarAlunoVerificacaoTurma(){
        Turma turma = new Turma();

        assertFalse(turma.verificarAlunoTurma(new Aluno("Ana")));
    }

    @Test
    void deveRemoverAlunoTurma(){
        Turma turma = new Turma();
        Aluno aluno = new Aluno("Ana");

        turma.adicionarAluno(aluno);
        turma.removerAluno(aluno);

        assertFalse(turma.verificarAlunoTurma(aluno));
    }

    @Test
    void deveRetornarNomeProfessor(){
        Turma turma = new Turma();
        Professor professor = new Professor("Ana");
        turma.setProfessor(professor);

        assertEquals("Ana", turma.getNomeProfessor());
    }

    @Test
    void deveRetornarMensagemTurmaSemProfessor(){
        Turma turma = new Turma();
        assertEquals("Turma sem professor", turma.getNomeProfessor());
    }

    @Test
    void deveRetornarNumeroAlunos(){
        Turma turma = new Turma();
        Aluno aluno1 = new Aluno("Ana");
        Aluno aluno2 = new Aluno("Anna");

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);

        assertEquals(2, turma.getNumeroAlunos());
    }

    @Test
    void deveLancarExcecaoAdicionarDisciplinaNula() {
        try {
            Turma turma = new Turma();
            turma.setDisciplina(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: disciplina nao pode ser nula", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeDisciplina() {
        Turma turma = new Turma();
        Disciplina disciplina = new Disciplina("Matemática");
        turma.setDisciplina(disciplina);

        assertEquals("Matemática", turma.getNomeDisciplina());
    }

}