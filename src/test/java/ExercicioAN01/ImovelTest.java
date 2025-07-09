package ExercicioAN01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImovelTest {

    @Test
    void deveLancarExcecaoMetroQuadradoInvalido(){
        try{
            Imovel imovel = new ImovelLote(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: O metro quadrado não pode ser zero ou negativo.", e.getMessage());
        }
    }

}