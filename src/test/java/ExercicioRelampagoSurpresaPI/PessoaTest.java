package ExercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveInstanciarPessoa(){
        Pessoa pessoa = new Pessoa("P1");
        assertEquals("P1", pessoa.getNome());
        assertNull(pessoa.getEscolaridade());
    }

    @Test
    void deveLancarExcecaoNomeInvalido(){
        try{
            Pessoa pessoa = new Pessoa("");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: argumento nome nao pode ser vazio", e.getMessage());
        }
    }
}