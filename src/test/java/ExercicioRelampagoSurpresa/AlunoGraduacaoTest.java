package ExercicioRelampagoSurpresa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoGraduacaoTest {
    @Test
    void deveInstanciarAlunoGraduacao(){
        AlunoGraduacao a1 = new AlunoGraduacao("A1", "123", 50, 50);
        assertEquals("A1", a1.getNome());
        assertEquals("123", a1.getMatricula());
        assertEquals(true, a1.verificarAprovacao());
    }
}