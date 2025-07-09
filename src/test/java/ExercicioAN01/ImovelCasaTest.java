package ExercicioAN01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImovelCasaTest {

    @Test
    void deveLancarExcecaoMetragemConstrucaoInvalida(){
        try{
            Imovel imovel = new ImovelCasa(1,-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: metragem construcao nao pode ser negativo", e.getMessage());
        }
    }

}