package ExercicioRelampagoSurpresa934;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {
  @Test
  void deveInstanciarGrupo() {
    Pais pais = new Pais("Brasil");
    Grupo grupo = new Grupo("Grupo A", pais);
    
    assertEquals("Grupo A", grupo.getNome());
    assertEquals("Brasil", grupo.getNomeSede());
    assertNull(grupo.getPresidente());
    assertEquals("Grupo sem presidente definido", grupo.getNomePresidente());
  }

  @Test
  void deveAlterarNomeGrupo() {
    Pais pais = new Pais("Brasil");
    Grupo grupo = new Grupo("Grupo A", pais);
    
    grupo.setNome("Grupo B");
    assertEquals("Grupo B", grupo.getNome());
  }

  @Test
  void deveLancarExcecaoParaNomeVazio() {
    Pais pais = new Pais("Brasil");
    Grupo grupo = new Grupo("Grupo A", pais);
    
    Exception exception = assertThrows(IllegalArgumentException.class, () -> {
      grupo.setNome("");
    });
    
    assertEquals("Erro: Nome não pode ser vazio", exception.getMessage());
  }

  @Test
  void deveAlterarPresidente() {
    Pais pais = new Pais("Brasil");
    Grupo grupo = new Grupo("Grupo A", pais);
    Funcionario funcionario = new Funcionario("João");
    
    grupo.setPresidente(funcionario);
    assertEquals("João", grupo.getNomePresidente());
  }

  @Test
  void deveRetornarGrupoSemPresidente() {
    Pais pais = new Pais("Brasil");
    Grupo grupo = new Grupo("Grupo A", pais);
    
    assertEquals("Grupo sem presidente definido", grupo.getNomePresidente());
  }

  @Test
  void deveAlterarSede() {
    Pais pais1 = new Pais("Brasil");
    Pais pais2 = new Pais("Argentina");
    Grupo grupo = new Grupo("Grupo A", pais1);
    
    grupo.setSede(pais2);
    assertEquals("Argentina", grupo.getNomeSede());
  }

  @Test
  void deveLancarExcecaoParaSedeNula() {
    try{
      Grupo grupo = new Grupo("Grupo A", null);
      fail("Deveria lançar IllegalArgumentException");
    } catch (IllegalArgumentException e) {
      assertEquals("Erro: Sede não pode ser nula", e.getMessage());
    }
  }

  @Test
  void deveRetornarNomeSede() {
    Pais pais = new Pais("Brasil");
    Grupo grupo = new Grupo("Grupo A", pais);
    
    assertEquals("Brasil", grupo.getNomeSede());
  }
}