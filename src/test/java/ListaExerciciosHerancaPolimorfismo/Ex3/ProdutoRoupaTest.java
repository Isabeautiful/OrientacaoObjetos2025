package ListaExerciciosHerancaPolimorfismo.Ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    @Test
    void deveInstanciarProdutoRoupa(){
        ProdutoRoupa produtoRoupa = new ProdutoRoupa("P1", 1);
    }

    @Test
    void deveCalcularPreco(){
        ProdutoRoupa produtoRoupa = new ProdutoRoupa("P1", 100);
        assertEquals(90, produtoRoupa.calcularPreco());
    }

}