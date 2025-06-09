package ExercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TipoEnsinoTest {
    @Test
    void deveInstanciarTipoEnsino(){
        TipoEnsino tipoEnsino = new TipoEnsino("TE1");
        assertEquals("TE1", tipoEnsino.getNome());
    }

    @Test
    void deveAlterarNome(){
        TipoEnsino tipoEnsino = new TipoEnsino("TE1");
        tipoEnsino.setNome("TE2");
        assertEquals("TE2", tipoEnsino.getNome());
    }

    @Test
    void deveLancarExcecaoNomeInvalido(){
        try{
            TipoEnsino tipoEnsino = new TipoEnsino("");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: argumento nome nao pode ser vazio", e.getMessage());
        }
    }

}