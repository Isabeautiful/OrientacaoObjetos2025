package ListaExerciciosHerancaPolimorfismo.Ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoLivroTest {

    @Test
    void deveInstanciarProdutoLivro(){
        ProdutoLivro produtoLivro = new ProdutoLivro("P1", 1);
    }

    @Test
    void deveCalcularPreco(){
        ProdutoLivro produtoLivro = new ProdutoLivro("P1", 100);
        assertEquals(95, produtoLivro.calcularPreco());
    }

}