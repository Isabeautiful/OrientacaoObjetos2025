package ExercicioAN06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VagaMensalTest {

    @Test
    void deveLancarExcecaoNumeroMesesInvalido(){
        try{
            Vaga vaga = new VagaMensal(1,"1",-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: número de meses inválido", e.getMessage());
        }
    }

}