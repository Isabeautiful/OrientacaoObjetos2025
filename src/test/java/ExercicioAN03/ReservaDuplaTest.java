package ExercicioAN03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaDuplaTest {

    @Test
    void deveLancarExcecaoRefeicaoInvalida(){
        try{
            Reserva reserva = new ReservaDupla(0, -1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }
    }

}