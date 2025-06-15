package ExercicioRelampagoSurpresa934;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {
  @Test
  void deveInstanciarEmpresa() {
    Empresa empresa = new Empresa("Tech Solutions");
    
    assertEquals("Tech Solutions", empresa.getNome());
    assertEquals("Empresa sem diretor definido", empresa.getNomeDiretor());
    assertEquals("Empresa sem grupo definido", empresa.getNomeGrupo());
  }

  @Test
  void deveAlterarNomeEmpresa() {
    Empresa empresa = new Empresa("Tech Solutions");
    
    empresa.setNome("Innovatech");
    
    assertEquals("Innovatech", empresa.getNome());
  }

  @Test
  void deveLancarExcecaoNomeEmpresaVazio() {
    try {
      Empresa empresa = new Empresa("");
      fail();
    } catch (IllegalArgumentException e) {
      assertEquals("Erro: Nome não pode ser vazio", e.getMessage());
    }
  }

  @Test
  void deveAlterarDiretorEmpresa() {
    Funcionario diretor = new Funcionario("Alice");
    Empresa empresa = new Empresa("Tech Solutions");
    
    empresa.setDiretor(diretor);
    
    assertEquals("Alice", empresa.getNomeDiretor());
  }

  @Test
  void deveRetornarEmpresaSemDiretor() {
    Empresa empresa = new Empresa("Tech Solutions");
    assertEquals("Empresa sem diretor definido", empresa.getNomeDiretor());
  }

  @Test
  void deveAlterarGrupoEmpresa() {
    Grupo grupo = new Grupo("Grupo de Inovação");
    Empresa empresa = new Empresa("Tech Solutions");
    
    empresa.setGrupo(grupo);
    
    assertEquals("Grupo de Inovação", empresa.getNomeGrupo());
  }

  @Test
  void deveRetornarEmpresaSemGrupo() {
    Empresa empresa = new Empresa("Tech Solutions");
    assertEquals("Empresa sem grupo definido", empresa.getNomeGrupo());
  }
}