package ExercicioAssociacaoNProfessor;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {


    @Test
    void deveAlocarZeroFuncionario() {
        Departamento departamento = new Departamento(1);
        assertEquals(0, departamento.getNumeroFuncionarios());
    }

    @Test
    void deveAlocarUmFuncionario() {
        Departamento departamento = new Departamento(1);
        Funcionario funcionario = new FuncionarioMensalista();
        departamento.alocar(funcionario);
        assertEquals(1, departamento.getNumeroFuncionarios());
    }

    @Test
    void deveAlocarDoisFuncionarios() {
        Departamento departamento = new Departamento(2);
        Funcionario funcionario = new FuncionarioMensalista();
        departamento.alocar(funcionario);
        Funcionario funcionario2 = new FuncionarioMensalista();
        departamento.alocar(funcionario2);
        assertEquals(2, departamento.getNumeroFuncionarios());
    }

    @Test
    void deveLancarExcecaoAlocacaoMais2Funcionarios() {
        try {
            Departamento departamento = new Departamento(2);
            departamento.alocar(new FuncionarioMensalista());
            departamento.alocar(new FuncionarioMensalista());
            departamento.alocar(new FuncionarioMensalista());
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Excedeu numero maximo funcionarios", e.getMessage());
        }
    }

    @Test
    void deveCalcularFolhaPagamento() {
        Departamento departamento = new Departamento(10);
        FuncionarioMensalista func1 = new FuncionarioMensalista();
        FuncionarioDiarista func2 = new FuncionarioDiarista();
        FuncionarioHorista func3 = new FuncionarioHorista();
        departamento.alocar(func1);
        departamento.alocar(func2);
        departamento.alocar(func3);

        func1.setSalarioMensal(1000.0f);
        func2.setNumDias(20);
        func2.setValorDia(100.0f);
        func3.setNumDias(30);
        func3.setNumHorasDia(10);
        func3.setValorHora(10.0f);

        assertEquals(6000.0f, departamento.calcularFolhaPagamento());
    }

    @Test
    void deveEncontrarFuncionario() {
        Departamento departamento = new Departamento(10);
        Funcionario funcionario = new FuncionarioMensalista();
        departamento.alocar(funcionario);
        assertTrue(departamento.verificarFuncionario(funcionario));
    }

    @Test
    void naoDeveEncontrarFuncionario() {
        Departamento departamento = new Departamento(10);
        Funcionario funcionario = new FuncionarioMensalista();
        assertFalse(departamento.verificarFuncionario(funcionario));
    }

    @Test
    void deveEncontrarFuncionarioPeloNome() {
        Departamento departamento = new Departamento(10);
        Funcionario func1 = new FuncionarioMensalista();
        Funcionario func2 = new FuncionarioMensalista();
        departamento.alocar(func1);
        departamento.alocar(func2);
        func1.setNome("Ana");
        func2.setNome("Maria");
        assertTrue(departamento.verificarFuncionarioPeloNome("Maria"));
    }

    @Test
    void naoDeveEncontrarFuncionarioPeloNome() {
        Departamento departamento = new Departamento(10);
        Funcionario func1 = new FuncionarioMensalista();
        Funcionario func2 = new FuncionarioMensalista();
        departamento.alocar(func1);
        departamento.alocar(func2);
        func1.setNome("Ana");
        func2.setNome("Maria");
        assertFalse(departamento.verificarFuncionarioPeloNome("Joana"));
    }

    @Test
    void deveDesalocarFuncionario() {
        Departamento departamento = new Departamento(10);
        Funcionario funcionario = new FuncionarioMensalista();
        departamento.alocar(funcionario);
        departamento.desalocar(funcionario);
        assertFalse(departamento.verificarFuncionario(funcionario));
    }

    @Test
    void deveRetornarFuncionarios() {
        Departamento departamento = new Departamento(10);
        Funcionario func1 = new FuncionarioMensalista();
        Funcionario func2 = new FuncionarioMensalista();
        departamento.alocar(func1);
        departamento.alocar(func2);
        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
        lista.add(func1);
        lista.add(func2);
        assertEquals(lista, departamento.getFuncionarios());
    }

    @Test
    void deveRetornarNomesFuncionarios() {
        Departamento departamento = new Departamento(10);
        Funcionario func1 = new FuncionarioMensalista();
        Funcionario func2 = new FuncionarioMensalista();
        departamento.alocar(func1);
        departamento.alocar(func2);
        func1.setNome("Ana");
        func2.setNome("Beatriz");
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Ana");
        lista.add("Beatriz");
        assertEquals(lista, departamento.obterNomesFuncionarios());
    }
}