package ExercicioAN03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {

    @Test
    void deveLancarExcecaoDiasInvalidos(){
        try{
            Reserva reserva = new ReservaSingle(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }
    }

}