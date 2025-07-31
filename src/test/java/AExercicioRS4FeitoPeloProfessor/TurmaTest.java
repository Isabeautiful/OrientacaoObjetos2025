package AExercicioRS4FeitoPeloProfessor;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TurmaTest {

    @Test
    void deveRetornarNomesAlunos() {
        Aluno aluno1 = new Aluno("Pedro");
        Aluno aluno2 = new Aluno("Joao");
        Turma turma = new Turma();
        turma.matricular(aluno1);
        turma.matricular(aluno2);
        List<String> resultado = Arrays.asList("Pedro", "Joao");
        assertEquals(resultado, turma.getNomesAlunos());
    }

    @Test
    void naoDeveMatricularAlunoDuplicata() {
        Aluno aluno = new Aluno("Ana");
        Turma turma = new Turma();
        turma.matricular(aluno);
        turma.matricular(aluno);
        assertEquals(1, turma.getQuantidadeAlunos());
    }

    @Test
    void deveRetornarNomeProfessor() {
        Turma turma = new Turma();
        Professor professor = new Professor("Denise");
        turma.setProfessor(professor);
        assertEquals("Denise", turma.getNomeProfessor());
    }

    @Test
    void deveRetornarTurmaSemProfessor() {
        Turma turma = new Turma();
        assertEquals("Turma sem professor", turma.getNomeProfessor());
    }


}