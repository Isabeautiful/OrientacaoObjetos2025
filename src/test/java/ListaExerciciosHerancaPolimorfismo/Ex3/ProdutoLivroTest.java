package ListaExerciciosHerancaPolimorfismo.Ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoLivroTest {

    @Test
    void deveInstanciarProdutoLivro(){
        ProdutoLivro produtoLivro = new ProdutoLivro("P1", 1);
        assertEquals("P1", produtoLivro.getNome());
        assertEquals(1, produtoLivro.getPrecoBase());
    }

    @Test
    void deveCalcularPreco(){
        ProdutoLivro produtoLivro = new ProdutoLivro("P1", 100);
        assertEquals(95, produtoLivro.calcularPreco());
    }

}