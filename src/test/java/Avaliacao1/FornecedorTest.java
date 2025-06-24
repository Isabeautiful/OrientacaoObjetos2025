package Avaliacao1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FornecedorTest {

    @Test
    void deveLancarExcecaoCNPJInvalidoSet(){
        try{
            Fornecedor fornecedor = new Fornecedor("Fornecedor", "111111111-11");
            fornecedor.setCnpj("");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("CNPJ vazio", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoCNPJInvalidoConstrutor(){
        try{
            Fornecedor fornecedor = new Fornecedor("Fornecedor", "");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("CNPJ vazio", e.getMessage());
        }
    }

    @Test
    void deveAlterarCNPJ(){
        Fornecedor fornecedor = new Fornecedor("Fornecedor", "111111111-11");
        assertEquals("111111111-11", fornecedor.getCnpj());
    }

}