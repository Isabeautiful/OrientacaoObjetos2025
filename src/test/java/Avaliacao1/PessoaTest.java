package Avaliacao1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    @Test
    void deveLancarExcecaoNomeInvalidoSet(){
        try{
            Pessoa pessoa = new Pessoa("Ana");
            pessoa.setNome("");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome vazio", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoNomeInvalidoConstrutor(){
        try{
            Pessoa pessoa = new Pessoa("");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome vazio", e.getMessage());
        }
    }

    @Test
    void deveAlterarNome(){
        Pessoa pessoa = new Pessoa("Ana");
        assertEquals("Ana", pessoa.getNome());
    }

}