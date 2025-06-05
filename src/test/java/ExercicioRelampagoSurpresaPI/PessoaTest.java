package ExercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveInstanciarPessoa(){
        Estado estado = new Estado("E1");
        Cidade cidade = new Cidade("C1", estado);
        Pessoa pessoa = new Pessoa("P1", cidade);
        assertEquals("P1", pessoa.getNome());
        assertNull(pessoa.getEscolaridade());
    }

    @Test
    void deveLancarExcecaoNomeInvalido(){
        try{
            Estado estado = new Estado("E1");
            Cidade cidade = new Cidade("C1", estado);
            Pessoa pessoa = new Pessoa("", cidade);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: argumento nome nao pode ser vazio", e.getMessage());
        }
    }
}