package ListaExerciciosHerancaPolimorfismo.Ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    @Test
    void deveInstanciarProdutoRoupa(){
        ProdutoRoupa produtoRoupa = new ProdutoRoupa("P1", 1);
        assertEquals("P1", produtoRoupa.getNome());
        assertEquals(1, produtoRoupa.getPrecoBase());
    }

    @Test
    void deveCalcularPreco(){
        ProdutoRoupa produtoRoupa = new ProdutoRoupa("P1", 100);
        assertEquals(80, produtoRoupa.calcularPreco());
    }

}