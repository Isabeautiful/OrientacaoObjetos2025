package ListaExerciciosHerancaPolimorfismo.Ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    @Test
    void deveInstanciarProdutoEletronico(){
        ProdutoEletronico produtoEletronico = new ProdutoEletronico("P1", 1);
        assertEquals("P1", produtoEletronico.getNome());
        assertEquals(1, produtoEletronico.getPrecoBase());
    }

    @Test
    void deveCalcularPreco(){
        ProdutoEletronico produtoEletronico = new ProdutoEletronico("P1", 100);
        assertEquals(90, produtoEletronico.calcularPreco());
    }

}