package Avaliacao1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {

    @Test
    void deveAlterarPrecoUnitario() {
        Fornecedor fornecedor = new Fornecedor("Fornecedor", "1111");
        Produto produto = new Produto("Produto", 1, 1, 1, 1);
        Compra compra = new Compra("24/06/2025", produto, fornecedor, 1, 1);
        compra.setPrecoUnitario(2);
        assertEquals(2, compra.getPrecoUnitario());
    }

    @Test
    void deveLancarExcecaoPrecoUnitarioInvalido(){
        try {
            Fornecedor fornecedor = new Fornecedor("Fornecedor", "1111");
            Produto produto = new Produto("Produto", 1, 1, 1, 1);
            Compra compra = new Compra("24/06/2025", produto, fornecedor, 1, 1);
            compra.setPrecoUnitario(-2);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Preço negativo", e.getMessage());
        }
    }

    @Test
    void setFornecedor() {
        Fornecedor fornecedor = new Fornecedor("Fornecedor", "1111");
        Produto produto = new Produto("Produto", 1, 1, 1, 1);
        Compra compra = new Compra("24/06/2025", produto, new Fornecedor("Ana", "2222"), 1, 1);
        compra.setFornecedor(fornecedor);
        assertEquals("Fornecedor", compra.getNomeFornecedor());
    }

    @Test
    void deveLancarExcecaoFornecedorInvalido(){
        try{
            Fornecedor fornecedor = new Fornecedor("Fornecedor", "1111");
            Produto produto = new Produto("Produto", 1, 1, 1, 1);
            Compra compra = new Compra("24/06/2025", produto, new Fornecedor("Ana", "2222"), 1, 1);
            compra.setFornecedor(null);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Fornecedor invalido", e.getMessage());
        }
    }

    @Test
    void deveComprar() {
        Fornecedor fornecedor = new Fornecedor("Fornecedor", "1111");
        Produto produto = new Produto("Produto", 1, 1, 1, 2);
        Compra compra = new Compra("24/06/2025", produto, new Fornecedor("Ana", "2222"), 2, 1);

        assertTrue(compra.comprar(produto,1));
    }

    @Test
    void deveRetornarFalseCompra(){
        Fornecedor fornecedor = new Fornecedor("Fornecedor", "1111");
        Produto produto = new Produto("Produto", 1, 1, 1, 1);
        Compra compra = new Compra("24/06/2025", produto, new Fornecedor("Ana", "2222"), 2, 1);

        assertFalse(compra.comprar(produto,1));
        }
}
