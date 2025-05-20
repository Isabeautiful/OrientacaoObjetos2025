package ListaExerciciosHerancaPolimorfismo.Ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveInstanciarProduto(){
        Produto produto = new ProdutoEletronico("P1", 1, 0);
        assertEquals("P1", produto.getNome());
        assertEquals(1,produto.getPrecoBase());
    }

    @Test
    void deveAlterarNome(){
        Produto produto = new ProdutoEletronico("P1", 1, 0);
        produto.setNome("P2");
        assertEquals("P2", produto.getNome());
    }

    @Test
    void deveLancarExcecaoNomeInvalido(){
        //TODO: Try catch
    }

}