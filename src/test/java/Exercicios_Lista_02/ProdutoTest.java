package Exercicios_Lista_02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    @Test
    void deveInstanciarProduto(){
        Produto produto = new Produto("P1", 1, 1, "Teste");
        assertEquals("P1", produto.getNome());
        assertEquals(1, produto.getQuantidade_estoque());
        assertEquals(1, produto.getPreco());
        assertEquals("Teste", produto.getCategoria());
    }

    @Test
    void deveAlterarPreco(){
        Produto produto = new Produto("P1", 1, 1, "Teste");
        produto.setPreco(2);
        assertEquals(2,produto.getPreco());
    }

    @Test
    void deveAlterarQuantidadeEstoque(){
        Produto produto = new Produto("P1", 1, 1, "Teste");
        produto.setQuantidade_estoque(0);
        assertEquals(0, produto.getQuantidade_estoque());
    }

    @Test
    void deveAdicionarEstoque(){
        Produto produto = new Produto("P1", 1, 0, "Teste");
        produto.adicionarEstoque(1);
        assertEquals(1,produto.getQuantidade_estoque());
    }

    @Test
    void deveRemoverEstoque(){
        Produto produto = new Produto("P1", 1, 1, "Teste");
        produto.removerEstoque(1);
        assertEquals(0,produto.getQuantidade_estoque());
    }

    @Test
    void deveAplicarDesconto(){
        Produto produto = new Produto("P1", 100, 0, "Teste");
        produto.aplicarDesconto(10);
        assertEquals(90,produto.getPreco());
    }

    @Test
    void deveLancarExcecaoPrecoInvalido(){
        try {
            Produto produto = new Produto("P1", 1, 1, "Teste");
            produto.setPreco(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Argumento Preço (double) não pode ser negativo ou nulo", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoQuantidadeEstoqueInvalida(){
        try {
            Produto produto = new Produto("P1", 1, 1, "Teste");
            produto.setQuantidade_estoque(-1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Argumento quantidade_estoque (int) não pode ser negativo", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoAdicionarEstoqueInvalido(){
        try {
            Produto produto = new Produto("P1", 1, 1, "Teste");
            produto.adicionarEstoque(-1);
            fail();
        }
        catch (IllegalArgumentException e ){
            assertEquals("Erro: Argumento quantidade (int) deve ser positivo", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoRemoverEstoqueInvalidoNegativo(){
        try{
            Produto produto = new Produto("P1", 1, 1, "Teste");
            produto.removerEstoque(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento quantidade (int) deve ser positivo", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoRemoverEstoqueInvalidoForaDeEstoque(){
        try{
            Produto produto = new Produto("P1", 1, 0, "Teste");
            produto.removerEstoque(1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro: Argumento quantidade não pode ser maior que o atributo estoque", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoRemoverEstoqueInvalidoQuantidadeSuperiorEstoque(){
        try{
            Produto produto = new Produto("P1", 1, 1, "Teste");
            produto.removerEstoque(2);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento quantidade não pode ser maior que o atributo estoque", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoAplicarDescontoInvalidoLimiteInferior(){
        try {
            Produto produto = new Produto("P1", 1, 1, "Teste");
            produto.aplicarDesconto(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento percentual invalido", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoAplicarDescontoInvalidoLimiteSuperior(){
        try{
            Produto produto = new Produto("P1", 1, 1, "Teste");
            produto.aplicarDesconto(101);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento percentual invalido", e.getMessage());
        }
    }

}