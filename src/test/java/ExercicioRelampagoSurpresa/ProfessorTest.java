package ExercicioRelampagoSurpresa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {
    @Test
    void deveInstanciarProfessorCorretamente(){
        Professor p1 = new Professor("Teste", "P1" );
        assertEquals("P1", p1.getNome());
        assertEquals("Teste", p1.getTitulacaoMaxima());
    }

}