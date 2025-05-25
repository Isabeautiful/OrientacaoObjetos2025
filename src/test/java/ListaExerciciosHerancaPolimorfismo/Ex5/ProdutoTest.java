package ListaExerciciosHerancaPolimorfismo.Ex5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    @Test
    void deveInstanciarProduto(){
        Produto produto = new ProdutoEletronico("P1", 1, 1);
        assertEquals("P1", produto.getNome());
        assertEquals(1, produto.getPrecoUnitario());
        assertEquals(1, produto.getQuantidadeEstoque());
    }

    @Test
    void deveAlterarNome(){
        Produto produto = new ProdutoEletronico("P1", 1, 1);
        produto.setNome("P2");
        assertEquals("P2", produto.getNome());
    }

    @Test
    void deveLancarExcecaoNomeInvalido(){
        try{
            Produto produto = new ProdutoEletronico("", 1, 1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento Nome nao pode ser uma string vazia", e.getMessage());
        }
    }

    @Test
    void deveAlterarPrecoUnitario(){
        Produto produto = new ProdutoEletronico("P1", 1, 1);
        produto.setPrecoUnitario(2);
        assertEquals(2, produto.getPrecoUnitario());
    }

    @Test
    void deveLancarExcecaoPrecoUnitarioInvalido(){
        try{
            Produto produto = new ProdutoEletronico("P1", 0, 1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento Preço Unitario deve ser positivo", e.getMessage());
        }
    }

    @Test
    void deveAlterarQuantidadeEstoque(){
        Produto produto = new ProdutoEletronico("P1", 1, 1);
        produto.setQuantidadeEstoque(2);
        assertEquals(2, produto.getQuantidadeEstoque());
    }

    @Test
    void deveLancarExcecaoQuantidadeEstoqueInvalido(){
        try{
            Produto produto = new ProdutoEletronico("P1", 1, -1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento QuantidadeEstoque deve ser positivo ou nulo", e.getMessage());
        }
    }

    @Test
    void deveRemoverEstoque(){
        Produto produto = new ProdutoEletronico("P1", 1, 1);
        produto.removerEstoque(1);
        assertEquals(0, produto.getQuantidadeEstoque());
    }

    @Test
    void deveLancarExcecaoRemoverEstoqueInvalido(){
        try{
            Produto produto = new ProdutoEletronico("P1", 1, 0);
            produto.removerEstoque(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento quantidade deve ser positiva", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoRemoverEstoqueForaDeEstoque(){
        try{
            Produto produto = new ProdutoEletronico("P1", 1, 0);
            produto.removerEstoque(1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Quantidade em estoque insuficiente", e.getMessage());
        }
    }



}