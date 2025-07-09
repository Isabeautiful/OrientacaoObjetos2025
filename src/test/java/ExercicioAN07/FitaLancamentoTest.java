package ExercicioAN07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FitaLancamentoTest {

    @Test
    void deveLancarExcecaoValorDiaInvalido(){
        try {
            Fita fita = new FitaLancamento(1,-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Valor por dia deve ser maior que zero.", e.getMessage());
        }
    }

}