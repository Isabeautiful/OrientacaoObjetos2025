package ExercicioAN05;

import ExercicioAN04.Frete;
import ExercicioAN04.FreteUrgente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManutencaoTest {

    @Test
    void deveLancarExcecaoNumeroInvalido(){
        try{
            Manutencao manutencao = new ManutencaoCPU(0,1,1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: número inválido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoValorMaoObraInvalido(){
        try{
            Manutencao manutencao = new ManutencaoCPU(1,-1,1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: valor da mão-de-obra inválido", e.getMessage());
        }
    }

}