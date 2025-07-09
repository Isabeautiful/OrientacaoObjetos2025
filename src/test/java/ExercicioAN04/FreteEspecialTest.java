package ExercicioAN04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteEspecialTest {

    @Test
    void deveLancarExcecaoTaxaEntrega(){
        try{
            Frete frete = new FreteEspecial(1,1, -1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: taxa de entrega inválida", e.getMessage());
        }
    }

}