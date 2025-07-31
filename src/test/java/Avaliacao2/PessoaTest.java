package Avaliacao2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveAlterarNome(){
        Pessoa pessoa = new Pessoa("Ana");
        pessoa.setNome("Anna");
        assertEquals("Anna", pessoa.getNome());
    }

    @Test
    void deveLancarExcecaoNomeInvalido(){
        try{
            Pessoa pessoa = new Pessoa("Ana");
            pessoa.setNome("");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: string nome invalida", e.getMessage());
        }
    }

}