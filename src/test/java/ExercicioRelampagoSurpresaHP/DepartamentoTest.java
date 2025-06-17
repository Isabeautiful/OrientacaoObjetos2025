package ExercicioRelampagoSurpresaHP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @Test
    void deveInstanciarDepartamento() {
        Departamento departamento = new Departamento("Recursos Humanos");

        assertEquals("Recursos Humanos", departamento.getNome());
        assertEquals("Departamento Sem chefia", departamento.getNomeChefia());
        assertEquals("Departamento sem empresa definida", departamento.getNomeEmpresa());
    }

    @Test
    void deveAlterarNomeDepartamento() {
        Departamento departamento = new Departamento("Recursos Humanos");

        departamento.setNome("Financeiro");

        assertEquals("Financeiro", departamento.getNome());
    }

    @Test
    void deveLancarExcecaoNomeDepartamentoVazio() {
        try {
            Departamento departamento = new Departamento("");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Nome não pode ser vazio", e.getMessage());
        }
    }

    @Test
    void deveAlterarChefiaDepartamento() {
        Funcionario funcionario = new Funcionario("João");
        Departamento departamento = new Departamento("Recursos Humanos");

        departamento.setChefia(funcionario);

        assertEquals("João", departamento.getNomeChefia());
    }

    @Test
    void deveRetornarDepartamentoSemChefia() {
        Departamento departamento = new Departamento("Recursos Humanos");
        assertEquals("Departamento Sem chefia", departamento.getNomeChefia());
    }

    @Test
    void deveAlterarEmpresaDepartamento() {
        Empresa empresa = new Empresa("Tech Solutions");
        Departamento departamento = new Departamento("Recursos Humanos");

        departamento.setEmpresa(empresa);

        assertEquals("Tech Solutions", departamento.getNomeEmpresa());
    }

    @Test
    void deveRetornarDepartamentoSemEmpresa() {
        Departamento departamento = new Departamento("Recursos Humanos");
        assertEquals("Departamento sem empresa definida", departamento.getNomeEmpresa());
    }

    @Test
    void deveRetornarNomeGrupo() {
        Empresa empresa = new Empresa("Tech Solutions");
        Grupo grupo = new Grupo("Grupo Tech", new Pais("Brasil"));
        empresa.setGrupo(grupo);

        Departamento departamento = new Departamento("Recursos Humanos");
        departamento.setEmpresa(empresa);

        assertEquals("Grupo Tech", departamento.getNomeGrupo());
    }

    @Test
    void deveRetornarNomeSede() {
        Empresa empresa = new Empresa("Tech Solutions");
        Grupo grupo = new Grupo("Grupo Tech", new Pais("Brasil"));
        empresa.setGrupo(grupo);

        Departamento departamento = new Departamento("Recursos Humanos");
        departamento.setEmpresa(empresa);

        assertEquals("Brasil", departamento.getNomeSede());
    }

    @Test
    void deveRetornarNomeDiretor() {
        Empresa empresa = new Empresa("Tech Solutions");
        Funcionario diretor = new Funcionario("Maria");
        empresa.setDiretor(diretor);

        Departamento departamento = new Departamento("Recursos Humanos");
        departamento.setEmpresa(empresa);

        assertEquals("Maria", departamento.getNomeDiretor());
    }

    @Test
    void deveRetornarNomePresidente() {
        Empresa empresa = new Empresa("Tech Solutions");
        Grupo grupo = new Grupo("Grupo Tech", new Pais("Brasil"));
        empresa.setGrupo(grupo);
        Funcionario presidente = new Funcionario("Carlos");
        grupo.setPresidente(presidente);

        Departamento departamento = new Departamento("Recursos Humanos");
        departamento.setEmpresa(empresa);

        assertEquals("Carlos", departamento.getNomePresidente());
    }

    @Test
    void deveRetornarDepartamentoSemEmpresaNomeEmpresa(){
        Departamento departamento = new Departamento("Recursos Humanos");

        assertEquals("Departamento sem empresa definida", departamento.getNomeEmpresa());
    }

    @Test
    void deveRetornarDepartamentoSemEmpresaNomeGrupo(){
        Departamento departamento = new Departamento("Recursos Humanos");

        assertEquals("Departamento empresa definida", departamento.getNomeGrupo());
    }

    @Test
    void deveRetornarDepartamentoSemEmpresaNomeSede(){
        Departamento departamento = new Departamento("Recursos Humanos");

        assertEquals("Departamento sem empresa definida", departamento.getNomeSede());
    }

    @Test
    void deveRetornarDepartamentoSemEmpresaNomeDiretor(){
        Departamento departamento = new Departamento("Recursos Humanos");

        assertEquals("Departamento sem empresa definida", departamento.getNomeDiretor());
    }

    @Test
    void deveRetornarDepartamentoSemEmpresaNomePresidente(){
        Departamento departamento = new Departamento("Recursos Humanos");

        assertEquals("Departamento sem empresa definida", departamento.getNomePresidente());
    }

    @Test
    void deveRetornarEscolaridadeChefia() {
        Funcionario funcionario = new Funcionario("João");
        funcionario.setEscolaridade(new Escolaridade("Mestrado"));

        Departamento departamento = new Departamento("Recursos Humanos");
        departamento.setChefia(funcionario);

        assertEquals("Mestrado", departamento.getNomeEscolaridadeChefia());
    }
}