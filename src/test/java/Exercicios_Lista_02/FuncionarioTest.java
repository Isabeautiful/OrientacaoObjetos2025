package Exercicios_Lista_02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    @Test
    void deveInstanciarFuncionario(){
        Funcionario funcionario = new Funcionario("Teste", "T1", 1, "T");
        assertEquals("Teste", funcionario.getNome());
        assertEquals("T1", funcionario.getCargo());
        assertEquals(1, funcionario.getSalario());
        assertEquals("T", funcionario.getDepartamento());
    }

    @Test
    void deveAlterarSalario(){
        Funcionario funcionario = new Funcionario("Teste", "T1", 1, "T");
        funcionario.setSalario(2);
        assertEquals(2, funcionario.getSalario());
    }

    @Test
    void deveAlterarDepartamento(){
        Funcionario funcionario = new Funcionario("Teste", "T1", 1, "T");
        funcionario.setDepartamento("T2");
        assertEquals("T2", funcionario.getDepartamento());
    }

    @Test
    void deveReceberAumento(){
        Funcionario funcionario = new Funcionario("Teste", "T1", 10, "T");
        funcionario.receberAumento(10);
        assertEquals(11, funcionario.getSalario());
    }

    @Test
    void deveMudarDepartamento(){
        Funcionario funcionario = new Funcionario("Teste", "T1", 1, "T");
        funcionario.mudarDepartamento("T2");
        assertEquals("T2", funcionario.getDepartamento());
    }

    @Test
    void deveExibirDados(){
        Funcionario funcionario = new Funcionario("Teste", "T1", 1, "T");
        assertEquals("Teste T1 1.0 T", funcionario.exibirDados());
    }

    @Test
    void deveLancarExcecaoSalarioInvalido(){
        try{
            Funcionario funcionario = new Funcionario("Teste", "T1", 0, "T");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento salario (double) deve ser positivo", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoDepartamentoInvalido(){
        try{
            Funcionario funcionario = new Funcionario("Teste", "T1", 1, "");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento departamento (String) não pode ser vazio", e.getMessage());
        }
    }

}