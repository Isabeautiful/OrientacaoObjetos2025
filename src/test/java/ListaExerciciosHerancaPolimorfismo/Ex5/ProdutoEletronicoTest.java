package ListaExerciciosHerancaPolimorfismo.Ex5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    @Test
    void deveInstanciarProdutoEletronico(){
        ProdutoEletronico produtoEletronico = new ProdutoEletronico("P1", 1, 1);
        assertEquals("P1", produtoEletronico.getNome());
        assertEquals(1, produtoEletronico.getPrecoUnitario());
        assertEquals(1, produtoEletronico.getQuantidadeEstoque());
        assertEquals(0, produtoEletronico.getQuantidadeComprada());
    }

    @Test
    void deveAlterarQuantidadeComprada(){
        ProdutoEletronico produtoEletronico = new ProdutoEletronico("P1", 1, 1000);
        produtoEletronico.setQuantidadeComprada(1);
        assertEquals(1,produtoEletronico.getQuantidadeComprada());
    }

    @Test
    void deveLancarExcecaoQuantidadeCompradaCompradaInvalido(){
        try{
            ProdutoEletronico produtoEletronico = new ProdutoEletronico("P1", 1, 1);
            produtoEletronico.setQuantidadeComprada(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento QuantidadeComprada deve ser positivo ou menor do que a quantidade em estoque", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoQuantidadeCompradaSuperiorEstoque(){
        try{
            ProdutoEletronico produtoEletronico = new ProdutoEletronico("P1", 1, 1);
            produtoEletronico.setQuantidadeComprada(2);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento QuantidadeComprada deve ser positivo ou menor do que a quantidade em estoque", e.getMessage());
        }
    }

    @Test
    void deveCalcularPreco(){
        ProdutoEletronico produtoEletronico = new ProdutoEletronico("P1", 1, 1000);
        produtoEletronico.setQuantidadeComprada(1);
        assertEquals(1, produtoEletronico.calcularPreco());
    }

    @Test
    void deveComprar(){
        ProdutoEletronico produtoEletronico = new ProdutoEletronico("P1", 1, 1);
        produtoEletronico.setQuantidadeComprada(1);
        produtoEletronico.Comprar();
        assertEquals(1, produtoEletronico.calcularPreco());
        assertEquals(0, produtoEletronico.getQuantidadeEstoque());
    }

}