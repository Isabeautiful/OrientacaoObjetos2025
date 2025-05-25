package ListaExerciciosHerancaPolimorfismo.Ex6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    @Test
    void deveInstanciarContaCorrente(){
        ContaCorrente conta = new ContaCorrente("001", "T1", 1);
        assertEquals("001", conta.getNumeroConta());
        assertEquals("T1", conta.getTitular());
        assertEquals(1, conta.getSaldo());
    }

    @Test
    void deveAlterarNumeroConta(){
        ContaCorrente conta = new ContaCorrente("001", "T1", 1);
        conta.setNumeroConta("002");
        assertEquals("002", conta.getNumeroConta());
    }

    @Test
    void deveLancarExcecaoNumeroContaInvalido(){
        try{
            ContaCorrente conta = new ContaCorrente("001", "T1", 1);
            conta.setNumeroConta("");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento numeroConta nao pode ser uma string vazia", e.getMessage());
        }
    }

    @Test
    void deveAlterarSaldo(){
        ContaCorrente conta = new ContaCorrente("001", "T1", 1);
        conta.setSaldo(2);
        assertEquals(2,conta.getSaldo());
    }

    @Test
    void deveLancarExcecaoTitularInvalido(){
        try{
            ContaCorrente conta = new ContaCorrente("001", "", 1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento titular nao pode ser uma string vazia", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSaqueInvalidoValorNegativo(){
        try{
            ContaCorrente conta = new ContaCorrente("001", "T1", 1);
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
            ContaCorrente conta = new ContaCorrente("001", "T1", 1);
            conta.sacar(2);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Saldo insuficiente para saque", e.getMessage());
        }
    }

    @Test
    void deveDepositarValor(){
        ContaCorrente conta = new ContaCorrente("001", "T1", 1);
        conta.depositar(1);
        assertEquals(1.5,conta.getSaldo());
    }

    @Test
    void deveLancarExcecaoDepositoInvalido(){
        try{
            ContaCorrente conta = new ContaCorrente("001", "T1", 1);
            conta.depositar(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento valor deve ser positivo", e.getMessage());
        }
    }

    @Test
    void deveCalcularJurosMensais(){
        ContaCorrente conta = new ContaCorrente("001", "T1", 1);
        conta.calcularJuros();
        assertEquals(-14,conta.getSaldo());
    }
}