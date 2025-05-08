package ExercicioRelampagoSurpresa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoEnsinoMedioTest {
    @Test
    void deveInstanciarAlunoEM(){
        AlunoEnsinoMedio a1 = new AlunoEnsinoMedio("A1", "123", 50, 50);
        assertEquals("A1", a1.getNome());
        assertEquals("123", a1.getMatricula());
        assertEquals(true, a1.verificarAprovacao());
    }

    @Test
    void deveVerificarAprovacaoFalse(){
        AlunoEnsinoMedio a1 = new AlunoEnsinoMedio("A1", "123", 0, 0);
        assertEquals(false, a1.verificarAprovacao());
    }

}