package Avaliacao2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OcorrenciaTest {

    @Test
    void deveAlterarMesOcorrencia(){
        Ocorrencia ocorrencia = new Ocorrencia();
        ocorrencia.setMesOcorrencia(1);
        assertEquals(1,ocorrencia.getMesOcorrencia());
    }

    @Test
    void deveLancarExcecaoMesOcorrenciaInvalidoMenorValor(){
        try{
            Ocorrencia ocorrencia = new Ocorrencia();
            ocorrencia.setMesOcorrencia(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: mesOcorrencia invalido",e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoMesOcorrenciaInvalidoMaiorValor(){
        try{
            Ocorrencia ocorrencia = new Ocorrencia();
            ocorrencia.setMesOcorrencia(13);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: mesOcorrencia invalido",e.getMessage());
        }
    }

    @Test
    void deveAlterarAnoOcorrencia(){
        Ocorrencia ocorrencia = new Ocorrencia();
        ocorrencia.setAnoOcorrencia(1);
        assertEquals(1,ocorrencia.getAnoOcorrencia());
    }

    @Test
    void deveLancarExcecaoAnoOcorrenciaInvalido(){
        try{
            Ocorrencia ocorrencia = new Ocorrencia();
            ocorrencia.setAnoOcorrencia(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: anoOcorrencia invalido",e.getMessage());
        }
    }

    @Test
    void deveAlterarValorOcorrencia(){
        Ocorrencia ocorrencia = new Ocorrencia();
        ocorrencia.setValorOcorrencia(1);
        assertEquals(1,ocorrencia.getValorOcorrencia());
    }

    @Test
    void deveLancarExcecaoValorOcorrenciaInvalido(){
        try{
            Ocorrencia ocorrencia = new Ocorrencia();
            ocorrencia.setValorOcorrencia(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Valor Ocorrencia Invalido",e.getMessage());
        }
    }

    @Test
    void deveAlterarDescricaoOcorrencia(){
        Ocorrencia ocorrencia = new Ocorrencia();
        ocorrencia.setDescricaoOcorrencia("DescricaoOcorrencia1");
        assertEquals("DescricaoOcorrencia1", ocorrencia.getDescricaoOcorrencia());
    }

    @Test
    void deveLancarExcecaoDescricaoOcorrenciaInvalida(){
        try{
            Ocorrencia ocorrencia = new Ocorrencia();
            ocorrencia.setDescricaoOcorrencia("");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: string descricaoOcorrencia invalida", e.getMessage());
        }
    }



}