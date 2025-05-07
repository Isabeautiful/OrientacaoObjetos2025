package Exercicios_Lista_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveCalcularMediaDeCombustivelGasto(){
        Carro carro = new Carro();
        carro.setQuilometrosRodados(350);
        carro.setCombustivelConsumido(28);
        assertEquals(12.5, carro.calcularConsumoMedio());
    }

    @Test
    void deveSetarQuilometrosRodados(){
        Carro carro = new Carro();
        carro.setQuilometrosRodados(0);
        assertEquals(0, carro.getQuilometrosRodados());
    }

    @Test
    void deveSetarCombustivelConsumido(){
        Carro carro = new Carro();
        carro.setCombustivelConsumido(1);
        assertEquals(1, carro.getCombustivelConsumido());
    }

    @Test
    void deveLancarExcecaoQuilometrosRodadosInvalido(){
        try {
            Carro carro = new Carro();
            carro.setQuilometrosRodados(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Quantidade de Km rodados negativa", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoCombustivelConsumidoInvalido(){
        try {
            Carro carro = new Carro();
            carro.setCombustivelConsumido(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Quantidade de Combustivel Consumido deve ser maior que Zero", e.getMessage());
        }
    }
}