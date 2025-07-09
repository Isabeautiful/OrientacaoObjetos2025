package ExercicioAN04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteTest {

    @Test
    void deveLancarExcecaoNumeroInvalido(){
        try{
            Frete frete = new FreteNormal(-1,1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: número do frete inválido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoValorBaseInvalido(){
        try{
            Frete frete = new FreteNormal(1,0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: valor do frete deve ser maior que zero", e.getMessage());
        }
    }

}