package ExercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadeTest {
    @Test
    void deveInstanciarCidade(){
        Estado estado = new Estado("E1");
        Cidade cidade = new Cidade("TE1", estado);
        assertEquals("TE1", cidade.getNome());
    }

    @Test
    void deveAlterarNome(){
        Estado estado = new Estado("E1");
        Cidade cidade = new Cidade("TE1", estado);
        cidade.setNome("TE2");
        assertEquals("TE2", cidade.getNome());
    }

    @Test
    void deveLancarExcecaoNomeInvalido(){
        try{
            Estado estado = new Estado("E1");
            Cidade cidade = new Cidade("", estado);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: argumento nome nao pode ser uma string vazia", e.getMessage());
        }
    }

    @Test
    void deveAlterarEstado(){
        Estado estado = new Estado("E1");
        Cidade cidade = new Cidade("TE1", estado);
        Estado estado1 = new Estado("E2");
        cidade.setEstado(estado1);
        assertEquals("E2", cidade.getNomeEstado());
    }

    @Test
    void deveLancarExcecaoEstadoInvalido(){
        try{
            Cidade cidade = new Cidade("C1", null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Argumento Estado nao pode ser nulo", e.getMessage());
        }
    }

    //deveretornarnomeestado
}