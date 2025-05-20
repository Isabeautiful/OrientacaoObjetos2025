package ListaExerciciosHerancaPolimorfismo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiretorTest {

    @Test
    void deveInstanciarDiretor(){
        Diretor diretor = new Diretor(1,0,0);
        assertEquals(1,diretor.getSalarioMensal());
        assertEquals(0.0,diretor.getValorParticipacao());
    }

    @Test
    void deveAlterarValorParticipacao(){
        Diretor diretor = new Diretor(1,0,0);
        diretor.setValorParticipacao(100,100);
        assertEquals(100,diretor.getValorParticipacao());
    }

    @Test
    void deveLancarExcecaoParticipacaoInvalida(){
        try{
            Diretor diretor = new Diretor(1,-1,1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: argumentos participacao ou lucros devem ser positivos", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoLucroInvalido(){
        try{
            Diretor diretor = new Diretor(1,0,-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: argumentos participacao ou lucros devem ser positivos", e.getMessage());
        }
    }

}