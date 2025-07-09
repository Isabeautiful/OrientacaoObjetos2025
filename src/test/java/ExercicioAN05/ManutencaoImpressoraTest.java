package ExercicioAN05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManutencaoImpressoraTest {

    @Test
    void deveLancarExcecaoValorPecasInvalido(){
        try{
            Manutencao manutencao = new ManutencaoImpressora(1,1,-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: valor das peças inválido", e.getMessage());
        }
    }

}