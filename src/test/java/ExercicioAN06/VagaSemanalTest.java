package ExercicioAN06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VagaSemanalTest {

    @Test
    void deveLancarExcecaoNumeroSemanasInvalido(){
        try{
            Vaga vaga = new VagaSemanal(1,"1",-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: número de semanas inválido", e.getMessage());
        }
    }

}