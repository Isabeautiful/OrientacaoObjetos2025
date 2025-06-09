package ExercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoTest {
    @Test
    void deveInstanciarEstado(){
        Estado estado = new Estado("E1");
        assertEquals("E1", estado.getNome());
    }

    @Test
    void deveAlterarNome(){
        Estado estado = new Estado("E1");
        estado.setNome("E2");
        assertEquals("E2", estado.getNome());
    }

    @Test
    void deveLancarExcecaoNomeInvalido(){
        try{
            Estado estado = new Estado("");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: argumento nome nao pode ser uma string vazia", e.getMessage());
        }
    }
}