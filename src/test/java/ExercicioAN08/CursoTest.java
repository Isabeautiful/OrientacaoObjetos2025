package ExercicioAN08;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void deveLancarExcecaoCodigoInvalido() {
        try {
            Curso curso = new Curso("", "Java", 60);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Código inválido, string vazia", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoDescricaoInvalida() {
        try {
            Curso curso = new Curso("001", "", 60);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Descrição inválida, string vazia", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoCargaHorariaInvalida() {
        try {
            Curso curso = new Curso("001", "Java", 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Carga horária deve ser maior que zero", e.getMessage());
        }
    }

    @Test
    void deveAdicionarZeroAluno() {
        Curso curso = new Curso("001", "Java", 60);
        assertEquals(0, curso.getNumeroAlunos());
    }

    @Test
    void deveAdicionarUmAluno() {
        Curso curso = new Curso("001", "Java", 60);
        Aluno aluno = new AlunoBolsistaIntegral("123", "Maria", "Rua A", 6);
        curso.addAluno(aluno);
        assertEquals(1, curso.getNumeroAlunos());
    }

    @Test
    void deveAdicionarDoisAlunos() {
        Curso curso = new Curso("001", "Java", 60);
        Aluno aluno1 = new AlunoBolsistaIntegral("123", "Maria", "Rua A", 6);
        Aluno aluno2 = new AlunoMensalista("456", "João", "Rua B", 500, 6);
        curso.addAluno(aluno1);
        curso.addAluno(aluno2);
        assertEquals(2, curso.getNumeroAlunos());
    }

    @Test
    void deveLancarExcecaoAdicionarAlunoNulo() {
        try {
            Curso curso = new Curso("001", "Java", 60);
            curso.addAluno(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Aluno não pode ser nulo", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoRemoverAlunoNulo() {
        try {
            Curso curso = new Curso("001", "Java", 60);
            curso.removerAluno(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Aluno não pode ser nulo", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoRemoverAlunoNaoExistente() {
        try {
            Curso curso = new Curso("001", "Java", 60);
            Aluno aluno = new AlunoBolsistaIntegral("123", "Maria", "Rua A", 6);
            curso.removerAluno(aluno);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Aluno não encontrado na lista", e.getMessage());
        }
    }

    @Test
    void deveRemoverAluno() {
        Curso curso = new Curso("001", "Java", 60);
        Aluno aluno = new AlunoMensalista("123", "Carlos", "Rua X", 500, 6);
        curso.addAluno(aluno);
        curso.removerAluno(aluno);
        assertEquals(0, curso.getNumeroAlunos());
    }

    @Test
    void deveListarAlunos() {
        Curso curso = new Curso("001", "Java", 60);
        Aluno aluno1 = new AlunoMensalista("111", "José", "Rua Z", 500, 6);
        Aluno aluno2 = new AlunoBolsistaIntegral("222", "Ana", "Rua Y", 6);
        curso.addAluno(aluno1);
        curso.addAluno(aluno2);
        assertEquals("José - 111, Ana - 222, ", curso.listarAlunos());
    }

    @Test
    void deveRetornarListaAlunos() {
        Curso curso = new Curso("001", "Java", 60);
        Aluno aluno1 = new AlunoMensalista("111", "José", "Rua Z", 500, 6);
        Aluno aluno2 = new AlunoBolsistaIntegral("222", "Ana", "Rua Y", 6);

        curso.addAluno(aluno1);
        curso.addAluno(aluno2);

        ArrayList<Aluno> listaEsperada = new ArrayList<>();
        listaEsperada.add(aluno1);
        listaEsperada.add(aluno2);

        assertEquals(listaEsperada, curso.getAlunos());
    }
}
