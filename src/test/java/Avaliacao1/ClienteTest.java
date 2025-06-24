package Avaliacao1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveLancarExcecaoCpfInvalidoSet(){
        try{
            Cliente Cliente = new Cliente("Ana", "111111111-11");
            Cliente.setCpf("");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cpf vazio", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoCpfInvalidoConstrutor(){
        try{
            Cliente Cliente = new Cliente("Ana", "");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cpf vazio", e.getMessage());
        }
    }

    @Test
    void deveAlterarCPF(){
        Cliente cliente = new Cliente("Ana", "111111111-11");
        assertEquals("111111111-11", cliente.getCpf());
    }
}