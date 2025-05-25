package ListaExerciciosHerancaPolimorfismo.Ex5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    @Test
    void deveInstanciarProdutoRoupa(){
        ProdutoRoupa produtoRoupa = new ProdutoRoupa("P1", 1, 1);
        assertEquals("P1", produtoRoupa.getNome());
        assertEquals(1, produtoRoupa.getPrecoUnitario());
        assertEquals(1, produtoRoupa.getQuantidadeEstoque());
        assertEquals(0, produtoRoupa.getQuantidadeComprada());
    }

    @Test
    void deveAlterarQuantidadeComprada(){
        ProdutoRoupa produtoRoupa = new ProdutoRoupa("P1", 1, 1000);
        produtoRoupa.setQuantidadeComprada(1);
        assertEquals(1,produtoRoupa.getQuantidadeComprada());
    }

    @Test
    void deveLancarExcecaoQuantidadeCompradaCompradaInvalido(){
        try{
            ProdutoRoupa produtoRoupa = new ProdutoRoupa("P1", 1, 1);
            produtoRoupa.setQuantidadeComprada(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento QuantidadeComprada deve ser positivo ou menor do que a quantidade em estoque", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoQuantidadeCompradaSuperiorEstoque(){
        try{
            ProdutoRoupa produtoRoupa = new ProdutoRoupa("P1", 1, 1);
            produtoRoupa.setQuantidadeComprada(2);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento QuantidadeComprada deve ser positivo ou menor do que a quantidade em estoque", e.getMessage());
        }
    }

    @Test
    void deveCalcularPreco(){
        ProdutoRoupa produtoRoupa = new ProdutoRoupa("P1", 1, 1000);
        produtoRoupa.setQuantidadeComprada(1);
        assertEquals(1, produtoRoupa.calcularPreco());
    }

    @Test
    void deveComprar(){
        ProdutoRoupa produtoRoupa = new ProdutoRoupa("P1", 1, 1);
        produtoRoupa.setQuantidadeComprada(1);
        produtoRoupa.Comprar();
        assertEquals(1, produtoRoupa.calcularPreco());
        assertEquals(0, produtoRoupa.getQuantidadeEstoque());
    }

    @Test
    void deveAlterarDesconto(){
        ProdutoRoupa produtoRoupa = new ProdutoRoupa("P1", 1, 1);
        produtoRoupa.setDesconto(1);
        assertEquals(1, produtoRoupa.getDesconto());
    }

    @Test
    void deveLancarExcecaoDescontoInvalidoLimiteInferior(){
        try{
            ProdutoRoupa produtoRoupa = new ProdutoRoupa("P1", 1, 1);
            produtoRoupa.setDesconto(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Percentual de desconto deve estar entre 0 e 100", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoDescontoInvalidoLimiteSuperior(){
        try{
            ProdutoRoupa produtoRoupa = new ProdutoRoupa("P1", 1, 1);
            produtoRoupa.setDesconto(101);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Percentual de desconto deve estar entre 0 e 100", e.getMessage());
        }
    }

}