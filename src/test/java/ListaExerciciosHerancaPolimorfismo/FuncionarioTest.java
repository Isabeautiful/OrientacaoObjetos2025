package ListaExerciciosHerancaPolimorfismo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveInstanciarFuncionario(){
        Funcionario funcionario = new FuncionarioComum(1);
        assertEquals(1, funcionario.getSalarioMensal());
        assertEquals(1,funcionario.calcularPagamento());
    }

    @Test
    void deveAlterarSalario(){
        Funcionario funcionario = new FuncionarioComum(1);
        funcionario.setSalarioMensal(2);
        assertEquals(2,funcionario.getSalarioMensal());
    }

    @Test
    void deveLancarExcecaoSalarioInvalido(){
        try{
            Funcionario funcionario = new FuncionarioComum(0);
            fail();
        }
        catch (IllegalArgumentException e ){
            assertEquals("Erro: Salario Mensal (double) deve ser positivo", e.getMessage());
        }
    }

}