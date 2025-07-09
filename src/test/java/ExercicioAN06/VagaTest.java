package ExercicioAN06;

import ExercicioAN04.Frete;
import ExercicioAN04.FreteEspecial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VagaTest {

    @Test
    void deveLancarExcecaoNumeroInvalido(){
        try{
            Vaga vaga = new VagaDiaria(-1,"1",1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: número da vaga inválido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoPlacaVeiculoInvalida(){
        try{
            Vaga vaga = new VagaDiaria(1,"",1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: placa do veículo inválida", e.getMessage());
        }
    }

}