package Avaliacao1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransacaoTest {

    @Test
    void deveLancarExcecaoDataTransacaoInvalida(){
        try{
            Produto produto = new Produto("P1", 1, 1, 1, 2);
            Transacao transacao = new Transacao("", produto, 1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Data Transação invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoQuantidadeInvalida(){
        try{
            Produto produto = new Produto("P1", 1, 1, 1, 2);
            Transacao transacao = new Transacao("11", produto, -1);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Quantidade invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoProdutoInvalido(){
        try{
            Transacao transacao = new Transacao("11", null, 1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Produto invalido", e.getMessage());
        }
    }

}