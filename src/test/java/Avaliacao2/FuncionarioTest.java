package Avaliacao2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveAlterarCargo(){
        Funcionario funcionario = new Funcionario("Ana");
        Cargo cargo = new Cargo();
        funcionario.setCargo(cargo);
        assertEquals(cargo, funcionario.getCargo());
    }

    @Test
    void deveLancarExcecaoCargoInvalido(){
        try{
            Funcionario funcionario = new Funcionario("Ana");
            funcionario.setCargo(null);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: cargo invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeDepartamento(){
        Funcionario funcionario = new Funcionario("Ana");
        Departamento departamento = new Departamento();
        departamento.setNome("TI");
        funcionario.setDepartamento(departamento);

        assertEquals("TI", funcionario.getNomeDepartamento());
    }

    @Test
    void deveRetornarFuncionarioSemDepartamento(){
        Funcionario funcionario = new Funcionario("Ana");
        funcionario.setDepartamento(null);

        assertEquals("Funcionario sem departamento", funcionario.getNomeDepartamento());
    }

    @Test
    void deveLancarExcecaoDependenteDuplicado(){
        try{
            Funcionario funcionario = new Funcionario("Ana");
            Dependente dependente = new Dependente("Anna");
            funcionario.adicionarDependente(dependente);
            funcionario.adicionarDependente(dependente);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Dependente ja encontrado na lista", e.getMessage());
        }
    }

    @Test
    void deveAdicionarUmDependente(){
        Funcionario funcionario = new Funcionario("Ana");
        Dependente dependente = new Dependente("Anna");
        funcionario.adicionarDependente(dependente);
        assertEquals(1, funcionario.getNumeroDependentes());
    }

    @Test
    void deveAdicionarDoisDependentes(){
        Funcionario funcionario = new Funcionario("Ana");
        Dependente dependente = new Dependente("Anna");
        Dependente dependente1 = new Dependente("Annna");
        funcionario.adicionarDependente(dependente);
        funcionario.adicionarDependente(dependente1);
        assertEquals(2, funcionario.getNumeroDependentes());
    }

    @Test
    void deveListarNomeDependentes(){
        Funcionario funcionario = new Funcionario("Ana");
        Dependente dependente = new Dependente("Anna");
        Dependente dependente1 = new Dependente("Annna");
        funcionario.adicionarDependente(dependente);
        funcionario.adicionarDependente(dependente1);

        ArrayList<String> resultadoTeste = new ArrayList<String>();
        resultadoTeste.add(dependente.getNome());
        resultadoTeste.add(dependente1.getNome());

        assertEquals(resultadoTeste, funcionario.listarNomeDependentes());
    }

    @Test
    void deveLancarExcecaoOcorrenciaDuplicada(){
        try{
            Funcionario funcionario = new Funcionario("Ana");

            Ocorrencia ocorrencia = new Ocorrencia();

            funcionario.adicionarOcorrencia(ocorrencia);
            funcionario.adicionarOcorrencia(ocorrencia);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Ocorrencia ja encontrado na lista", e.getMessage());
        }
    }

    @Test
    void deveAdicionarUmaOcorrencia(){
        Funcionario funcionario = new Funcionario("Ana");

        Ocorrencia ocorrencia = new Ocorrencia();

        funcionario.adicionarOcorrencia(ocorrencia);

        assertEquals(1, funcionario.getNumeroOcorrencias());
    }

    @Test
    void deveAdicionarDuasOcorrencias(){
        Funcionario funcionario = new Funcionario("Ana");

        Ocorrencia ocorrencia = new Ocorrencia();
        Ocorrencia ocorrencia1 = new Ocorrencia();

        funcionario.adicionarOcorrencia(ocorrencia);
        funcionario.adicionarOcorrencia(ocorrencia1);

        assertEquals(2, funcionario.getNumeroOcorrencias());
    }

    @Test
    void deveCalcularSalarioLiquidoAcrescimo(){
        Funcionario funcionario = new Funcionario("Ana");

        Ocorrencia ocorrencia = new Ocorrencia();
        ocorrencia.setTipoOcorrencia(true);
        ocorrencia.setValorOcorrencia(1);
        ocorrencia.setMesOcorrencia(1);
        ocorrencia.setAnoOcorrencia(1);

        Dependente dependente = new Dependente("Anna");
        Dependente dependente1 = new Dependente("Annna");

        funcionario.adicionarDependente(dependente);
        funcionario.adicionarDependente(dependente1);
        funcionario.adicionarOcorrencia(ocorrencia);

        assertEquals(201, funcionario.calcularSalarioLiquido(1,1));
    }

    @Test
    void deveCalcularSalarioLiquidoSubtracao(){
        Funcionario funcionario = new Funcionario("Ana");

        Ocorrencia ocorrencia = new Ocorrencia();
        ocorrencia.setTipoOcorrencia(false);
        ocorrencia.setValorOcorrencia(1);
        ocorrencia.setMesOcorrencia(1);
        ocorrencia.setAnoOcorrencia(1);

        Dependente dependente = new Dependente("Anna");
        Dependente dependente1 = new Dependente("Annna");

        funcionario.adicionarDependente(dependente);
        funcionario.adicionarDependente(dependente1);
        funcionario.adicionarOcorrencia(ocorrencia);

        assertEquals(199, funcionario.calcularSalarioLiquido(1,1));
    }

}