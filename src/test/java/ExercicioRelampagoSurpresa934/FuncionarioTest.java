package ExercicioRelampagoSurpresa934;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
  @Test
  void deveInstanciarFuncionario() {
    Funcionario funcionario = new Funcionario("João");
    
    assertEquals("João", funcionario.getNome());
    assertEquals("Funcionario sem escolaridade definida", funcionario.getNomeEscolaridade());
    assertEquals("Funcionario sem filial definida", funcionario.getNomeFilial());
  }

  @Test
  void deveAlterarNomeFuncionario() {
    Funcionario funcionario = new Funcionario("João");
    
    funcionario.setNome("Maria");
    
    assertEquals("Maria", funcionario.getNome());
  }

  @Test
  void deveLancarExcecaoNomeFuncionarioVazio() {
    try {
      Funcionario funcionario = new Funcionario("");
      fail();
    } catch (IllegalArgumentException e) {
      assertEquals("Erro: Nome não pode ser vazio", e.getMessage());
    }
  }

  @Test
  void deveAlterarEscolaridadeFuncionario() {
    Funcionario funcionario = new Funcionario("João");
    Escolaridade escolaridade = new Escolaridade("Ensino Médio");
    
    funcionario.setEscolaridade(escolaridade);
    
    assertEquals("Ensino Médio", funcionario.getNomeEscolaridade());
  }

  @Test
  void deveRetornarEscolaridadeNaoDefinida(){
    Funcionario funcionario = new Funcionario("João");
    assertEquals("Funcionario sem escolaridade definida", funcionario.getNomeEscolaridade());
  }

  @Test
  void deveAlterarFilialFuncionario() {
    Funcionario funcionario = new Funcionario("João");
    Filial filial = new Filial("Filial A");
    
    funcionario.setFilial(filial);
    
    assertEquals("Filial A", funcionario.getNomeFilial());
  }

  @Test
  void deveRetornarFilialNaoDefinida() {
    Funcionario funcionario = new Funcionario("João");
    assertEquals("Funcionario sem filial definida", funcionario.getNomeFilial());
  }

  @Test
  void deveRetornarNomeCidadeFilial() {
    Estado estado = new Estado("MG", new Pais("Brasil"));
    Cidade cidade = new Cidade("Belo Horizonte", estado);
    Filial filial = new Filial("Filial A", cidade);
    Funcionario funcionario = new Funcionario("João");
    
    funcionario.setFilial(filial);
    
    assertEquals("Belo Horizonte", funcionario.getNomeCidadeFilial());
  }

  @Test
  void deveRetornarNomeEstadoFilial() {
    Estado estado = new Estado("MG", new Pais("Brasil"));
    Cidade cidade = new Cidade("Belo Horizonte", estado);
    Filial filial = new Filial("Filial A", cidade);
    Funcionario funcionario = new Funcionario("João");
    
    funcionario.setFilial(filial);
    
    assertEquals("MG", funcionario.getNomeEstadoFilial());
  }

  @Test
  void deveRetornarNomePaisFilial() {
    Estado estado = new Estado("MG", new Pais("Brasil"));
    Cidade cidade = new Cidade("Belo Horizonte", estado);
    Filial filial = new Filial("Filial A", cidade);
    Funcionario funcionario = new Funcionario("João");
    
    funcionario.setFilial(filial);
    
    assertEquals("Brasil", funcionario.getNomePaisFilial());
  }

  @Test
  void deveRetornarFuncionarioSemFilialDefinidaCidade() {
    Funcionario funcionario = new Funcionario("João");
    assertEquals("Funcionario sem filial definida", funcionario.getNomeCidadeFilial());
  }

  @Test
  void deveRetornarFuncionarioSemFilialDefinidaEstado() {
    Funcionario funcionario = new Funcionario("João");
    assertEquals("Funcionario sem filial definida", funcionario.getNomeEstadoFilial());
  }

  @Test
  void deveRetornarFuncionarioSemFilialDefinidaPais() {
    Funcionario funcionario = new Funcionario("João");
    assertEquals("Funcionario sem filial definida", funcionario.getNomePaisFilial());
  }

  @Test
  void deveAlterarDepartamentoFuncionario() {
    Funcionario funcionario = new Funcionario("João");
    Departamento departamento = new Departamento("Departamento A");
    
    funcionario.setDepartamento(departamento);
    
    assertEquals("Departamento A", funcionario.getNomeDepartamento());
  }

  @Test
  void deveRetornarFuncionarioNaoAlocadoADepartamento() {
    Funcionario funcionario = new Funcionario("João");
    assertEquals("Funcionario nao alocado a nenhum departamento", funcionario.getNomeDepartamento());
  }

  @Test
  void deveRetornarNomeEmpresa(){
    Funcionario funcionario = new Funcionario("João");
    Departamento departamento = new Departamento("Departamento A");
    Empresa empresa = new Empresa("Tech Solutions");
    
    departamento.setEmpresa(empresa);
    funcionario.setDepartamento(departamento);
    
    assertEquals("Tech Solutions", funcionario.getNomeEmpresa());
  }

  @Test
  void deveRetornarFuncionarioSemDepartamentoEmpresa() {
    Funcionario funcionario = new Funcionario("João");
    assertEquals("Funcionario nao alocado a nenhum departamento", funcionario.getNomeEmpresa());
  }

  @Test
  void deveRetornarNomeGrupo() {
    Funcionario funcionario = new Funcionario("João");
    Departamento departamento = new Departamento("Departamento A");
    Empresa empresa = new Empresa("Tech Solutions");
    Grupo grupo = new Grupo("Grupo Tech", new Pais("Brasil"));
    
    empresa.setGrupo(grupo);
    departamento.setEmpresa(empresa);
    funcionario.setDepartamento(departamento);
    
    assertEquals("Grupo Tech", funcionario.getNomeGrupo());
  }

  @Test
  void deveRetornarFuncionarioSemDepartamentoGrupo() {
    Funcionario funcionario = new Funcionario("João");
    assertEquals("Funcionario nao alocado a nenhum departamento", funcionario.getNomeGrupo());
  }

  @Test
  void deveRetornarNomeSede() {
    Funcionario funcionario = new Funcionario("João");
    Departamento departamento = new Departamento("Departamento A");
    Empresa empresa = new Empresa("Tech Solutions");
    Grupo grupo = new Grupo("Grupo Tech", new Pais("Brasil"));
    
    empresa.setGrupo(grupo);
    departamento.setEmpresa(empresa);
    funcionario.setDepartamento(departamento);
    
    assertEquals("Brasil", funcionario.getNomeSede());
  }

  @Test
  void deveRetornarFuncionarioSemDepartamentoSede() {
    Funcionario funcionario = new Funcionario("João");
    assertEquals("Funcionario nao alocado a nenhum departamento", funcionario.getNomeSede());
  }

}