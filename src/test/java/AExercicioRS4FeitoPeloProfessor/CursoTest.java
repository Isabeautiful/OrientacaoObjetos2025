package AExercicioRS4FeitoPeloProfessor;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveRetornarNomesAlunos() {
        Aluno aluno1 = new Aluno("Joao");
        Aluno aluno2 = new Aluno("Ana");
        Aluno aluno3 = new Aluno("Jose");
        Aluno aluno4 = new Aluno("Beatriz");
        Turma turma1 = new Turma();
        Turma turma2 = new Turma();
        turma1.matricular(aluno1);
        turma1.matricular(aluno2);
        turma2.matricular(aluno3);
        turma2.matricular(aluno4);
        Curso curso = new Curso();
        curso.abrirTurma(turma1);
        curso.abrirTurma(turma2);
        List<String> resultado = Arrays.asList("Joao", "Ana", "Jose", "Beatriz");
        assertEquals(resultado, curso.getNomesAlunos());
    }

    @Test
    void naoDeveAbrirTurmaDuplicata() {
        Turma turma = new Turma();
        Curso curso = new Curso();
        curso.abrirTurma(turma);
        curso.abrirTurma(turma);
        assertEquals(1, curso.obterQuantidadeTurmas());
    }

}