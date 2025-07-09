package ExercicioAN07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FitaTest {

    @Test
    void deveLancarExcecaoNumDiasInvalido(){
        try {
            Fita fita = new FitaCatalogo(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Número de dias deve ser maior que zero.", e.getMessage());
        }
    }

}