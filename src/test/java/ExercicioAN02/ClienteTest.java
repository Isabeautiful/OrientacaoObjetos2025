package ExercicioAN02;

import ExercicioAN01.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveLancarExcecaoCodigoInvalido(){
        try{
            Cliente cliente = new Cliente("", "Ana");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Codigo invalido, string vazia", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoNomeInvalido(){
        try{
            Cliente cliente = new Cliente("111", "");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Nome invalido, string vazia", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoAdicionarContaInvalido(){
        try{
            Cliente cliente = new Cliente("111", "João");
            cliente.adicionarContaBancaria(null);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: conta bancaria nao pode ser nula", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoRemoverContaInvalido(){
        try{
            Cliente cliente = new Cliente("111", "João");
            cliente.removerContaBancaria(null);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Conta bancaria nao pode ser nula", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoRemoverContaNaoExistente(){
        try{
            Cliente cliente = new Cliente("111", "João");
            cliente.removerContaBancaria(new ContaPoupanca(1,1));
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Conta bancaria nao encontrada na lista", e.getMessage());
        }
    }

    @Test
    void listarContasDoCliente(){
        Cliente cliente = new Cliente("111", "João");
        ContasBancaria conta = new ContaPoupanca(1,1);
        ContasBancaria conta1 = new ContaPoupanca(1,2);


        cliente.adicionarContaBancaria(conta);
        cliente.adicionarContaBancaria(conta1);

        assertEquals("Conta Poupanca - 1.0, Conta Poupanca - 1.0, ", cliente.listarContas());

    }

    // Testes exemplos do professor

    @Test
    void deveAdicionarZeroContas(){
        Cliente cliente = new Cliente("111", "João");
        assertEquals(0, cliente.getNumeroContas());
    }

    @Test
    void deveAdicionarUmaConta(){
        Cliente cliente = new Cliente("111", "João");
        ContasBancaria conta = new ContaPoupanca(1,1);
        cliente.adicionarContaBancaria(conta);
        assertEquals(1, cliente.getNumeroContas());
    }

    @Test
    void deveAlocarDuasContas(){
        Cliente cliente = new Cliente("111", "João");
        ContasBancaria conta = new ContaPoupanca(1,1);
        ContasBancaria conta1 = new ContaPoupanca(1,1);
        cliente.adicionarContaBancaria(conta);
        cliente.adicionarContaBancaria(conta1);
        assertEquals(2, cliente.getNumeroContas());
    }

    @Test
    void deveCalcularSaldoTotal(){
        Cliente cliente = new Cliente("111", "João");

        ContasBancaria conta = new ContaPoupanca(1,1);
        ContasBancaria conta1 = new ContaPoupanca(1,2);

        cliente.adicionarContaBancaria(conta);
        cliente.adicionarContaBancaria(conta1);

        float valorEsperado = 2.0f;

        assertEquals(valorEsperado, cliente.calcularSaldoTotal());
    }

    @Test
    void deveEncontrarContas(){
        Cliente cliente = new Cliente("111", "João");

        ContasBancaria conta = new ContaPoupanca(1,1);
        cliente.adicionarContaBancaria(conta);
        assertTrue(cliente.buscarConta(conta));
    }

    @Test
    void naoDeveEncontrarContas(){
        Cliente cliente = new Cliente("111", "João");

        ContasBancaria conta = new ContaPoupanca(1,1);
        assertFalse(cliente.buscarConta(conta));
    }

    @Test
    void deveRemoverContas(){
        Cliente cliente = new Cliente("111", "João");

        ContasBancaria conta = new ContaPoupanca(1,1);
        cliente.adicionarContaBancaria(conta);
        cliente.removerContaBancaria(conta);
        assertFalse(cliente.buscarConta(conta));
    }

    @Test
    void deveRetornarContas(){
        Cliente cliente = new Cliente("111", "João");

        ContasBancaria conta = new ContaPoupanca(1,1);
        ContasBancaria conta1 = new ContaPoupanca(1,2);

        cliente.adicionarContaBancaria(conta);
        cliente.adicionarContaBancaria(conta1);

        ArrayList<ContasBancaria> lista = new ArrayList<>();
        lista.add(conta);
        lista.add(conta1);

        assertEquals(lista, cliente.getContasBancarias());
    }

}