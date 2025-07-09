package ExercicioAN07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FitaEspecialTest {

    @Test
    void deveLancarExcecaoValorDiaInvalido(){
        try {
            Fita fita = new FitaEspecial(1,-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Valor por dia deve ser maior que zero.", e.getMessage());
        }
    }

}