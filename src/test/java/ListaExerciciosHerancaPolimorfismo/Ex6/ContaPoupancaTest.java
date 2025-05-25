package ListaExerciciosHerancaPolimorfismo.Ex6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {

    @Test
    void deveInstanciarContaPoupanca(){
        ContaPoupanca conta = new ContaPoupanca("001", "T1", 1);
        assertEquals("001", conta.getNumeroConta());
        assertEquals("T1", conta.getTitular());
        assertEquals(1, conta.getSaldo());
    }

    @Test
    void deveAlterarNumeroConta(){
        ContaPoupanca conta = new ContaPoupanca("001", "T1", 1);
        conta.setNumeroConta("002");
        assertEquals("002", conta.getNumeroConta());
    }

    @Test
    void deveLancarExcecaoNumeroContaInvalido(){
        try{
            ContaPoupanca conta = new ContaPoupanca("001", "T1", 1);
            conta.setNumeroConta("");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento numeroConta nao pode ser uma string vazia", e.getMessage());
        }
    }

    @Test
    void deveAlterarSaldo(){
        ContaPoupanca conta = new ContaPoupanca("001", "T1", 1);
        conta.setSaldo(2);
        assertEquals(2,conta.getSaldo());
    }

    @Test
    void deveLancarExcecaoTitularInvalido(){
        try{
            ContaPoupanca conta = new ContaPoupanca("001", "", 1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento titular nao pode ser uma string vazia", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSaqueInvalidoValorNegativo(){
        try{
            ContaPoupanca conta = new ContaPoupanca("001", "T1", 1);
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
            ContaPoupanca conta = new ContaPoupanca("001", "T1", 1);
            conta.sacar(2);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Saldo insuficiente para saque", e.getMessage());
        }
    }

    @Test
    void deveDepositarValor(){
        ContaPoupanca conta = new ContaPoupanca("001", "T1", 1);
        conta.depositar(1);
        assertEquals(2,conta.getSaldo());
    }

    @Test
    void deveLancarExcecaoDepositoInvalido(){
        try{
            ContaPoupanca conta = new ContaPoupanca("001", "T1", 1);
            conta.depositar(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento valor deve ser positivo", e.getMessage());
        }
    }

    @Test
    void deveCalcularJurosMensais(){
        ContaPoupanca conta = new ContaPoupanca("001", "T1", 1);
        conta.calcularJuros();
        assertEquals(1.5,conta.getSaldo());
    }

}