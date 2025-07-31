package AExercicioRS4FeitoPeloProfessor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveRetornarNome() {
        Aluno aluno = new Aluno("Ana");
        assertEquals("Ana", aluno.getNome());
    }

    @Test
    void deveLancarExcecaoNomeInvalido() {
        try {
            Aluno aluno = new Aluno("");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }

    }

}