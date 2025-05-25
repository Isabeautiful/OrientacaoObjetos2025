package ListaExerciciosHerancaPolimorfismo.Ex5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoAlimentoTest {
    @Test
    void deveInstanciarProdutoAlimento(){
        ProdutoAlimento produtoAlimento = new ProdutoAlimento("P1", 1, 1);
        assertEquals("P1", produtoAlimento.getNome());
        assertEquals(1, produtoAlimento.getPrecoUnitario());
        assertEquals(1, produtoAlimento.getQuantidadeEstoque());
        assertEquals(0, produtoAlimento.getQuantidadeComprada());
    }

    @Test
    void deveAlterarQuantidadeKGComprada(){
        ProdutoAlimento produtoAlimento = new ProdutoAlimento("P1", 1, 1000);
        produtoAlimento.setQuantidadeKG(1);
        assertEquals(1,produtoAlimento.getQuantidadeKG());
    }

    @Test
    void deveLancarExcecaoQuantidadeKGCompradaInvalido(){
        try{
            ProdutoAlimento produtoAlimento = new ProdutoAlimento("P1", 1, 1);
            produtoAlimento.setQuantidadeKG(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento Quantidade de quilos comprados deve ser positiva ou menor do que a quantidade em estoque", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoQuantidadeKGCompradaSuperiorEstoque(){
        try{
            ProdutoAlimento produtoAlimento = new ProdutoAlimento("P1", 1, 1);
            produtoAlimento.setQuantidadeKG(1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento Quantidade de quilos comprados deve ser positiva ou menor do que a quantidade em estoque", e.getMessage());
        }
    }

    @Test
    void deveCalcularPreco(){
        ProdutoAlimento produtoAlimento = new ProdutoAlimento("P1", 1, 1000);
        produtoAlimento.setQuantidadeKG(1);
        assertEquals(1, produtoAlimento.calcularPreco());
    }

    @Test
    void deveComprar(){
        ProdutoAlimento produtoAlimento = new ProdutoAlimento("P1", 1, 1000);
        produtoAlimento.setQuantidadeKG(1);
        produtoAlimento.Comprar();
        assertEquals(1, produtoAlimento.calcularPreco());
        assertEquals(0, produtoAlimento.getQuantidadeEstoque());
    }

}