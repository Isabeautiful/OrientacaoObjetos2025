package ExercicioRelampagoSurpresa4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisciplinaTest {

    @Test
    void deveAlterarNome(){
        Disciplina disciplina = new Disciplina("D1");
        assertEquals("D1", disciplina.getNome());
    }

    @Test
    void deveLancarExcecaoNomeInvalido(){
        try{
            Pessoa pessoa = new Pessoa("");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: string nome invalida", e.getMessage());
        }
    }

}