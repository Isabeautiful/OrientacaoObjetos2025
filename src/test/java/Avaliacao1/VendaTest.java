package Avaliacao1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaTest {
    @Test
    void deveAlterarCliente(){
        Produto produto = new Produto("Produto", 1, 1, 1, 2);
        Cliente cliente = new Cliente("Ana", "111");
        Venda venda = new Venda("24/06/2025", cliente, produto, 1);
        venda.setCliente(new Cliente("Bia", "222"));
        assertEquals("Bia", venda.getNomeCliente());
    }

    @Test
    void deveLancarExcecaoClienteInvalido(){
        try{
            Produto produto = new Produto("Produto", 1, 1, 1, 2);
            Cliente cliente = new Cliente("Ana", "111");
            Venda venda = new Venda("24/06/2025", cliente, produto, 1);
            venda.setCliente(null);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Cliente invalido", e.getMessage());
        }
    }

    @Test
    void deveVender(){
        Produto produto = new Produto("Produto", 1, 1, 1, 2);
        Cliente cliente = new Cliente("Ana", "111");
        Venda venda = new Venda("24/06/2025", cliente, produto, 1);

        assertTrue(venda.vender(produto,1));
    }

    @Test
    void deveRetornarFalseVenda(){
        Produto produto = new Produto("Produto", 1, 1, 1, 2);
        Cliente cliente = new Cliente("Ana", "111");
        Venda venda = new Venda("24/06/2025", cliente, produto, 1);

        assertFalse(venda.vender(produto, 2));
    }
}