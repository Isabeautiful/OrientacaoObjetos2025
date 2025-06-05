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
}