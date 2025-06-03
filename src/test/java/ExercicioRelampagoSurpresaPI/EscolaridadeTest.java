package ExercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaridadeTest {
    @Test
    void deveInstanciarEscolaridade(){
        Escolaridade escolaridade = new Escolaridade("mestrando");
        assertEquals("MESTRANDO", escolaridade.getGraduacao());
    }

    @Test
    void deveAlterarGraduacao(){
        Escolaridade escolaridade = new Escolaridade("mestrando");
        escolaridade.setGraduacao("Doutorando");
        assertEquals("DOUTORANDO", escolaridade.getGraduacao());
    }

    @Test
    void deveLancarExcecaoGraduacaoInvalida(){
        try{
            Escolaridade escolaridade = new Escolaridade("");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: argumento graduacao nao pode ser vazio", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoGraduacaoInvalidaForaEscopo(){
        try{
            Escolaridade escolaridade = new Escolaridade("Ensino medio completo");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: argumento graduacao só pode ser mestrando ou doutorando", e.getMessage());
        }
    }
}