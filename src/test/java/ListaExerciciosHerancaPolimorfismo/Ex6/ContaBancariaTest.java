package ListaExerciciosHerancaPolimorfismo.Ex6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {
    @Test
    void deveInstanciarContaBancaria(){
        ContaBancaria conta = new ContaCorrente("001", "T1", 1);
        assertEquals("001", conta.getNumeroConta());
        assertEquals("T1", conta.getTitular());
        assertEquals(1, conta.getSaldo());
    }

    @Test
    void deveAlterarNumeroConta(){
        ContaBancaria conta = new ContaCorrente("001", "T1", 1);
        conta.setNumeroConta("002");
        assertEquals("002", conta.getNumeroConta());
    }

    @Test
    void deveLancarExcecaoNumeroContaInvalido(){
        try{
            ContaBancaria conta = new ContaCorrente("001", "T1", 1);
            conta.setNumeroConta("");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento numeroConta nao pode ser uma string vazia", e.getMessage());
        }
    }

    @Test
    void deveAlterarSaldo(){
        ContaBancaria conta = new ContaCorrente("001", "T1", 1);
        conta.setSaldo(2);
        assertEquals(2,conta.getSaldo());
    }

    @Test
    void deveLancarExcecaoTitularInvalido(){
        try{
            ContaBancaria conta = new ContaCorrente("001", "", 1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento titular nao pode ser uma string vazia", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSaqueInvalidoValorNegativo(){
        try{
            ContaBancaria conta = new ContaCorrente("001", "T1", 1);
            conta.sacar(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento valor deve ser positivo", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSaqueInvalidoValorSuperiorSaldo(){
        try{
            ContaBancaria conta = new ContaCorrente("001", "T1", 1);
            conta.sacar(2);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Saldo insuficiente para saque", e.getMessage());
        }
    }
}