package ExercicioRelampagoSurpresa934;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialTest {
  @Test
  void deveInstanciarFilial() {
    Estado estado = new Estado("MG", new Pais("Brasil"));
    Cidade cidade = new Cidade("Juiz de Fora", estado);
    Filial filial = new Filial("Filial Centro", cidade);
    
    assertEquals("Filial Centro", filial.getNome());
    assertEquals("Juiz de Fora", filial.getNomeCidade());
    assertEquals("MG", filial.getNomeEstado());
    assertEquals("Brasil", filial.getNomePais());
    assertEquals("Filial sem empresa definida", filial.getNomeEmpresa());
  }

  @Test
  void deveAlterarNomeFilial() {
    Estado estado = new Estado("MG", new Pais("Brasil"));
    Cidade cidade = new Cidade("Juiz de Fora", estado);
    Filial filial = new Filial("Filial Centro", cidade);
    
    filial.setNome("Filial Sul");
    
    assertEquals("Filial Sul", filial.getNome());
  }

  @Test
  void deveLancarExcecaoNomeFilialVazio() {
    try {
       Estado estado = new Estado("MG", new Pais("Brasil"));
      Cidade cidade = new Cidade("Juiz de Fora", estado);
      Filial filial = new Filial("", cidade);
      fail();
    } catch (IllegalArgumentException e) {
      assertEquals("Erro: Nome não pode ser vazio", e.getMessage());
    }
  }

  @Test
  void deveAlterarCidadeFilial() {
    Estado estado1 = new Estado("MG", new Pais("Brasil"));
    Cidade cidade1 = new Cidade("Juiz de Fora", estado1);
    Filial filial = new Filial("Filial Centro", cidade1);
    
    Estado estado2 = new Estado("SP", new Pais("Brasil"));
    Cidade cidade2 = new Cidade("São Paulo", estado2);
    
    filial.setCidade(cidade2);
    
    assertEquals("São Paulo", filial.getNomeCidade());
    assertEquals("SP", filial.getNomeEstado());
    assertEquals("Brasil", filial.getNomePais());
  }

  @Test
  void deveLancarExcecaoCidadeNula() {
    try {
      Filial filial = new Filial("Filial Centro", null);
      fail();
    } catch (IllegalArgumentException e) {
      assertEquals("Erro: Cidade não pode ser nula", e.getMessage());
    }
  }

  @Test
  void deveAlterarEmpresaFilial() {
    Estado estado = new Estado("MG", new Pais("Brasil"));
    Cidade cidade = new Cidade("Juiz de Fora", estado);
    Filial filial = new Filial("Filial Centro", cidade);
    
    Empresa empresa = new Empresa("Tech Solutions");
    filial.setEmpresa(empresa);
    
    assertEquals("Tech Solutions", filial.getNomeEmpresa());
  }

  @Test
  void deveRetornarFilialSemEmpresa() {
    Estado estado = new Estado("MG", new Pais("Brasil"));
    Cidade cidade = new Cidade("Juiz de Fora", estado);
    Filial filial = new Filial("Filial Centro", cidade);
    
    assertEquals("Filial sem empresa definida", filial.getNomeEmpresa());
  }

  @Test
  void deveRetornarNomeGrupo() {
    Estado estado = new Estado("MG", new Pais("Brasil"));
    Cidade cidade = new Cidade("Juiz de Fora", estado);
    Filial filial = new Filial("Filial Centro", cidade);
    
    Empresa empresa = new Empresa("Tech Solutions");
    Grupo grupo = new Grupo("Grupo Tech", new Pais("Brasil"));
    empresa.setGrupo(grupo);
    filial.setEmpresa(empresa);
    
    assertEquals("Grupo Tech", filial.getNomeGrupo());
  }

  @Test
  void deveRetornarNomeSede() {
    Estado estado = new Estado("MG", new Pais("Brasil"));
    Cidade cidade = new Cidade("Juiz de Fora", estado);
    Filial filial = new Filial("Filial Centro", cidade);
    
    Empresa empresa = new Empresa("Tech Solutions");
    Grupo grupo = new Grupo("Grupo Tech", new Pais("Brasil"));
    empresa.setGrupo(grupo);
    filial.setEmpresa(empresa);
    
    assertEquals("Brasil", filial.getNomeSede());
  }
}