package ExercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
  @Test
  void alteraNomePessoa() {
    Pessoa pessoa = new Pessoa("João");
    assertEquals("João", pessoa.getNome());
  }

  @Test
  void deveLancarExcecaoAoCriarPessoaNomeInvalido() {
    try {
      Pessoa pessoa = new Pessoa("");
      fail();
    } catch (IllegalArgumentException e) {
      assertEquals("Erro: argumento nome nao pode ser vazio", e.getMessage());
    }
  }

  @Test
  void deveRetornarNaturalidade(){
    Estado estado = new Estado("São Paulo");
    Cidade cidade = new Cidade("São Paulo", estado);
    Pessoa pessoa = new Pessoa("João");
    pessoa.setCidade(cidade);
    assertEquals("São Paulo São Paulo", pessoa.getNaturalidade());
  }

  @Test
  void deveRetornarNaturalidadeNula(){
    Pessoa pessoa = new Pessoa("João");
    pessoa.setCidade(null);
    assertEquals("Pessoa sem naturalidade definida", pessoa.getNaturalidade());
  }

  @Test
  void deveRetornarNomeCidade(){
    Estado estado = new Estado("São Paulo");
    Cidade cidade = new Cidade("São Paulo", estado);
    Pessoa pessoa = new Pessoa("João");
    pessoa.setCidade(cidade);
    assertEquals("São Paulo", pessoa.getNomeCidade());
  }

  @Test
  void deveRetornarNomeCidadeNula(){
    Pessoa pessoa = new Pessoa("João");
    pessoa.setCidade(null);
    assertEquals("Pessoa sem naturalidade definida", pessoa.getNomeCidade());
  }

  @Test
  void deveRetornarNomeEstado(){
    Estado estado = new Estado("São Paulo");
    Cidade cidade = new Cidade("São Paulo", estado);
    Pessoa pessoa = new Pessoa("João");
    pessoa.setCidade(cidade);
    assertEquals("São Paulo", pessoa.getNomeEstado());
  }

  @Test
  void deveRetornarNomeEstadoNulo(){
    Pessoa pessoa = new Pessoa("João");
    pessoa.setCidade(null);
    assertEquals("Pessoa sem naturalidade definida", pessoa.getNomeEstado());
  }

  @Test
  void deveRetornarEscolaridade(){
    Pessoa pessoa = new Pessoa("João");
    Escolaridade escolaridade = new Escolaridade("Ensino Superior");
    pessoa.setEscolaridade(escolaridade);
    assertEquals("ENSINO SUPERIOR", pessoa.getNomeEscolaridade());
  }

  @Test
  void deveRetornarEscolaridadeNula(){
    Pessoa pessoa = new Pessoa("João");
    pessoa.setEscolaridade(null);
    assertEquals("Pessoa sem escolaridade", pessoa.getNomeGraduacao());
  }
    
}