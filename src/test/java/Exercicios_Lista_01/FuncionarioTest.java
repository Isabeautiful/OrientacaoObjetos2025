package Exercicios_Lista_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    @Test
    void deveCalcularNovoSalario(){
        Funcionario funcionario = new Funcionario();
        funcionario.setSalarioBruto(50);
        funcionario.calcularNovoSalario(10);
        assertEquals(55, funcionario.getSalarioBruto());
    }

    @Test
    void deveLancarExcecaoSalarioInvalido(){
        try{
            Funcionario funcionario = new Funcionario();
            funcionario.setSalarioBruto(0);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Erro: Salario deve ser maior que zero", e.getMessage());
        }
    }

    @Test
    void deveLancarExcessaoPercentualDeAumentoInvalidoCalcularNovoSalario(){
        try{
            Funcionario funcionario = new Funcionario();
            funcionario.calcularNovoSalario(0);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Erro: Percentual de Aumento deve ser maior que zero", e.getMessage());
        }
    }

    @Test
    void deveLancarExcessaoPercentualDeAumentoInvalidoCalcularAumentoSalarial(){
        try{
            Funcionario funcionario = new Funcionario();
            funcionario.calcularAumentoSalarial(0);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Erro: Percentual de Aumento deve ser maior que zero", e.getMessage());
        }
    }

    @Test
    void deveCalcularSalarioLiquido(){
        Funcionario funcionario = new Funcionario();
        funcionario.setSalarioBruto(55);
        funcionario.setNumeroHorasExtras(2);
        funcionario.calcularSalarioLiquido(10);
        assertEquals(69, funcionario.getSalarioLiquido());
    }

    @Test
    void deveLancarExcessaoNumeroHoraExtraInvalido(){
        try{
            Funcionario funcionario = new Funcionario();
            funcionario.setNumeroHorasExtras(-1);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Erro: Numero de Horas Extras não pode ser negativo", e.getMessage());
        }
    }

    @Test
    void deveLancarExcessaoValorHoraExtraInvalido(){
        try{
            Funcionario funcionario = new Funcionario();
            funcionario.calcularSalarioLiquido(0);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Erro: Valor de Horas Extras deve ser maior que zero", e.getMessage());
        }
    }

}