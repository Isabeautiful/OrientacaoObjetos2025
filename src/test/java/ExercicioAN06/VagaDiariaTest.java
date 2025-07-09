package ExercicioAN06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VagaDiariaTest {

    @Test
    void deveLancarExcecaoNumeroDiasInvalido(){
        try{
            Vaga vaga = new VagaDiaria(1,"1",0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: número de dias inválido", e.getMessage());
        }
    }

}