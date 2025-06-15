package ExercicioRelampagoSurpresa934;

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
    Funcionario funcionario = new Funcionario("João", "123456789");
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
  
}