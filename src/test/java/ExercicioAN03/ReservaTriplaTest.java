package ExercicioAN03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTriplaTest {

    @Test
    void deveLancarExcecaoRefeicaoInvalida(){
        try{
            Reserva reserva = new ReservaTripla(0, -1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro", e.getMessage());
        }
    }

}