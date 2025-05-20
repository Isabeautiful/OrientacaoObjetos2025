package ListaExerciciosHerancaPolimorfismo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioComumTest {

    @Test
    void deveInstanciarFuncionario(){
        FuncionarioComum funcionario = new FuncionarioComum(1);
        assertEquals(1, funcionario.getSalarioMensal());
        assertEquals(1,funcionario.calcularPagamento());
    }

    @Test
    void deveAlterarSalario(){
        FuncionarioComum funcionario = new FuncionarioComum(1);
        funcionario.setSalarioMensal(2);
        assertEquals(2,funcionario.getSalarioMensal());
    }

    @Test
    void deveLancarExcecaoSalarioInvalido(){
        try{
            FuncionarioComum funcionario = new FuncionarioComum(0);
            fail();
        }
        catch (IllegalArgumentException e ){
            assertEquals("Erro: Salario Mensal (double) deve ser positivo", e.getMessage());
        }
    }

}