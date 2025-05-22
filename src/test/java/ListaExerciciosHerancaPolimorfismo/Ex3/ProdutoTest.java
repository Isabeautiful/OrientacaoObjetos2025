package ListaExerciciosHerancaPolimorfismo.Ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveInstanciarProduto(){
        Produto produto = new ProdutoEletronico("P1", 1);
        assertEquals("P1", produto.getNome());
        assertEquals(1,produto.getPrecoBase());
    }

    @Test
    void deveAlterarNome(){
        Produto produto = new ProdutoEletronico("P1", 1);
        produto.setNome("P2");
        assertEquals("P2", produto.getNome());
    }

    @Test
    void deveLancarExcecaoNomeInvalido(){
        try{
            Produto produto = new ProdutoEletronico("", 1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Argumento nome nao pode ser uma string vazia", e.getMessage());
        }
    }

    @Test
    void deveAlterarPrecoBase(){
        Produto produto = new ProdutoEletronico("P1", 1);
        produto.setPrecoBase(2);
        assertEquals(2, produto.getPrecoBase());
    }

    @Test
    void deveLancarExcecaoPrecoBaseInvalido(){
        try{
            Produto produto = new ProdutoEletronico("P1", -1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Argumento Preco Base deve ser positivo", e.getMessage());
        }
    }

}