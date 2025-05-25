package ListaExerciciosHerancaPolimorfismo.Ex2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    @Test
    void deveInstanciarGerente(){
        Gerente gerente = new Gerente(100, 2);
        assertEquals(100, gerente.getSalarioMensal());
        assertEquals(2,gerente.getBonus());
        assertEquals(102,gerente.calcularPagamento());
    }

    @Test
    void deveAlterarSalario(){
        Gerente gerente = new Gerente(1, 1);
        gerente.setSalarioMensal(2);
        assertEquals(2,gerente.getSalarioMensal());
    }

    @Test
    void deveLancarExcecaoBonusInvalido(){
        try{
            Gerente gerente = new Gerente(1, 0);
            fail();
        }
        catch (IllegalArgumentException e ){
            assertEquals("Erro: Argumento bonus (double) deve ser positivo", e.getMessage());
        }
    }

}