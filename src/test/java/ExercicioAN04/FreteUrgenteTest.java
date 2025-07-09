package ExercicioAN04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteUrgenteTest {

    @Test
    void deveLancarExcecaoNumeroItensInvalido(){
        try{
            Frete frete = new FreteUrgente(1,1, 1, -1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: número de itens não pode ser negativo", e.getMessage());
        }
    }

}