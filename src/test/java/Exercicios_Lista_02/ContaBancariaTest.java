package Exercicios_Lista_02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {
    @Test
    void deveSacarValor(){
        ContaBancaria contaBancaria = new ContaBancaria("Jao da Silva", "001", 2);
        contaBancaria.sacar(1);
        assertEquals(1, contaBancaria.getSaldo());
    }

    @Test
    void deveDepositarValor(){
        ContaBancaria contaBancaria = new ContaBancaria("Jao da Silva", "001", 0);
        contaBancaria.depositar(1);
        assertEquals(1, contaBancaria.getSaldo());
    }

    @Test
    void deveLancarExcecaoSacarValorInvalido(){
        try {
            ContaBancaria contaBancaria = new ContaBancaria("Jao da Silva", "001", 2);
            contaBancaria.sacar(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Nao pode sacar valor negativo ou nulo",e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoDepositarValorInvalido(){
        try {
            ContaBancaria contaBancaria = new ContaBancaria("Jao da Silva", "001", 2);
            contaBancaria.depositar(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Nao pode depositar valor negativo ou nulo",e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSacarValorInvalidoSaldo(){
        try {
            ContaBancaria contaBancaria = new ContaBancaria("Jao da Silva", "001", 1);
            contaBancaria.sacar(2);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Nao pode sacar mais do que o valor do saldo",e.getMessage());
        }
    }

}