package ListaExerciciosHerancaPolimorfismo.Ex3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    @Test
    void deveInstanciarProdutoEletronico(){
        ProdutoEletronico produtoEletronico = new ProdutoEletronico("P1", 1);
    }

    @Test
    void deveCalcularPreco(){
        ProdutoEletronico produtoEletronico = new ProdutoEletronico("P1", 100);
        assertEquals(90, produtoEletronico.calcularPreco());
    }

}