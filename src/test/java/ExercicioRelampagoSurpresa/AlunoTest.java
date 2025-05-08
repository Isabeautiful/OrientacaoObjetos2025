package ExercicioRelampagoSurpresa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {
    @Test
    void deveAlterarNota1(){
        Aluno a1 = new AlunoEnsinoMedio("A1", "123", 50, 50);
        a1.setNota1(60);
        assertEquals(60, a1.getNota1());
    }

    @Test
    void deveAlterarNota2(){
        Aluno a1 = new AlunoEnsinoMedio("A1", "123", 50, 50);
        a1.setNota2(60);
        assertEquals(60, a1.getNota2());
    }

    @Test
    void deveLancarExcecaoNota1Invalida(){
        try{
            Aluno a1 = new AlunoEnsinoMedio("A1", "123", -1, 50);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Nota1 invalida" ,e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoNota2Invalida(){
        try{
            Aluno a1 = new AlunoEnsinoMedio("A1", "123", 1, -1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Nota2 invalida" ,e.getMessage());
        }
    }

}