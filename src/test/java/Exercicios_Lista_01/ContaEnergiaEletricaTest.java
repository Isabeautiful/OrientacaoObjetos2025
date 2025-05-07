package Exercicios_Lista_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaEnergiaEletricaTest {

    @Test
    void deveCalcularValorASerPago(){
        ContaEnergiaEletrica conta = new ContaEnergiaEletrica();
        conta.setNumConsumoKW(150);
        conta.calculaValorASerPago();
        assertEquals(21.24, conta.getValorConta());
    }

    @Test
    void deveSetarNumeroDeConsumoQuilowatts(){
        ContaEnergiaEletrica conta = new ContaEnergiaEletrica();
        conta.setNumConsumoKW(1);
        assertEquals(1,conta.getNumConsumoKW());
    }

    @Test
    void deveLancarExcecaoNumeroDeConsumoQuilowattsInvalido(){
        try {
            ContaEnergiaEletrica conta = new ContaEnergiaEletrica();
            conta.setNumConsumoKW(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Numero de Quilowatts consumidos não pode ser negativo", e.getMessage());
        }
    }

}