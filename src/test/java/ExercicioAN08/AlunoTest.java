package ExercicioAN08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveLancarExcecaoMatriculaInvalida() {
        try {
            Aluno aluno = new AlunoBolsistaIntegral("", "João", "Rua A", 6);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Matrícula inválida, string vazia", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoNomeInvalido() {
        try {
            Aluno aluno = new AlunoBolsistaIntegral("123", "", "Rua A", 6);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Nome inválido, string vazia", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoEnderecoInvalido() {
        try {
            Aluno aluno = new AlunoBolsistaIntegral("123", "João", "", 6);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Endereço inválido, string vazia", e.getMessage());
        }
    }

    @Test
    void deveRetornarMatricula() {
        Aluno aluno = new AlunoBolsistaIntegral("123", "João", "Rua A", 6);
        assertEquals("123", aluno.getMatricula());
    }

    @Test
    void deveRetornarNome() {
        Aluno aluno = new AlunoBolsistaIntegral("123", "João", "Rua A", 6);
        assertEquals("João", aluno.getNome());
    }

    @Test
    void deveRetornarEndereco() {
        Aluno aluno = new AlunoBolsistaIntegral("123", "João", "Rua A", 6);
        assertEquals("Rua A", aluno.getEndereco());
    }

    @Test
    void deveAlterarNome() {
        Aluno aluno = new AlunoBolsistaIntegral("123", "João", "Rua A", 6);
        aluno.setNome("Maria");
        assertEquals("Maria", aluno.getNome());
    }

    @Test
    void deveAlterarEndereco() {
        Aluno aluno = new AlunoBolsistaIntegral("123", "João", "Rua A", 6);
        aluno.setEndereco("Rua Nova");
        assertEquals("Rua Nova", aluno.getEndereco());
    }

    @Test
    void deveAlterarMatricula() {
        Aluno aluno = new AlunoBolsistaIntegral("123", "João", "Rua A", 6);
        aluno.setMatricula("999");
        assertEquals("999", aluno.getMatricula());
    }

}
