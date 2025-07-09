package ExercicioAN01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImovelApartamentoTest {

    @Test
    void deveLancarExcecaoNumAndaresInvalido(){
        try{
            Imovel imovel = new ImovelApartamento(1,-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: argumento numAndares não pode ser negativo", e.getMessage());
        }
    }

}