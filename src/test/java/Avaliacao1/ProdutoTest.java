package Avaliacao1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    @Test
    void deveLancarExcecaoNomeInvalido(){
        try {
            Produto produto = new Produto("Produto", 1, 1, 1, 2);
            produto.setNome("");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoQuantidadeEstoqueInvalida(){
        try{
            Produto produto = new Produto("Produto", -1, 1, 1, 2);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("quantidade estoque negativa", e.getMessage());
        }
    }

    @Test
    void deveDebilitarEstoque(){
        Produto produto = new Produto("Produto", 1, 1, 1, 2);
        produto.debilitarEstoque(1);
        assertEquals(0, produto.getQuantidadeEstoque());
    }

    @Test
    void deveCreditarEstoque(){
        Produto produto = new Produto("Produto", 1, 1, 1, 2);
        produto.creditarEstoque(1);
        assertEquals(2, produto.getQuantidadeEstoque());
    }


}