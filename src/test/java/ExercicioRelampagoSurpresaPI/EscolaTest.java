package ExercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {
    @Test
    void instanciaEscola(){
      Estado estado = new Estado("São Paulo");
      Cidade cidade = new Cidade("São Paulo", estado);
      Escola escola = new Escola("Escola Teste", cidade);
      assertEquals("Escola Teste", escola.getNome());
      assertEquals("São Paulo", escola.getNomeCidade());
      assertEquals("São Paulo", escola.getNomeEstado());
    }

    @Test
    void alteraNomeEscola() {
        Estado estado = new Estado("São Paulo");
        Cidade cidade = new Cidade("São Paulo", estado);
        Escola escola = new Escola("Escola Teste", cidade);
        escola.setNome("Nova Escola Teste");
        assertEquals("Nova Escola Teste", escola.getNome());
    }

    @Test
    void deveLancarExcecaoAoCriarEscolaNomeInvalido() {
        try{
            Estado estado = new Estado("São Paulo");
            Cidade cidade = new Cidade("São Paulo", estado);
            Escola escola = new Escola("", cidade);
            fail();
          fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro: argumento nome nao pode ser vazio", e.getMessage());
        }
    }

    @Test
    void deveAlterarNomeCidade() {
        Estado estado = new Estado("São Paulo");
        Cidade cidade = new Cidade("São Paulo", estado);
        Escola escola = new Escola("Escola Teste", cidade);
        cidade.setNome("Nova São Paulo");
        assertEquals("Nova São Paulo", escola.getNomeCidade());
    }

    @Test
    void deveLancarExcecaoAoCriarEscolaCidadeNula() {
        try{
            Escola escola = new Escola("Escola Teste", null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Erro: argumento cidade nao pode ser nulo", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeDiretor() {
        Estado estado = new Estado("São Paulo");
        Cidade cidade = new Cidade("São Paulo", estado);
        Escola escola = new Escola("Escola Teste", cidade);
        Professor diretor = new Professor("Carlos");
        escola.setDiretor(diretor);
        assertEquals("Carlos", escola.getNomeDiretor());
    }

    @Test
    void deveRetornarEscolaSemDiretor() {
        Estado estado = new Estado("São Paulo");
        Cidade cidade = new Cidade("São Paulo", estado);
        Escola escola = new Escola("Escola Teste", cidade);
        assertEquals("Escola nao possui diretor", escola.getNomeDiretor());
    }

    @Test
    void deveRetornarCEP() {
        Estado estado = new Estado("São Paulo");
        Cidade cidade = new Cidade("São Paulo", estado);
        Escola escola = new Escola("Escola Teste", cidade);
        assertEquals("São Paulo São Paulo", escola.getCEP());
    }

    @Test
    void deveLancarExcecaoRetornarCEPComCidadeNula() {
        try {
            Escola escola = new Escola("Escola Teste", null);
            escola.getCEP();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: argumento cidade nao pode ser nulo", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoRetornarCEPComEstadoNulo() {
        try {
            Estado estado = new Estado("São Paulo");
            Cidade cidade = new Cidade("São Paulo", null);
            Escola escola = new Escola("Escola Teste", cidade);
            escola.getCEP();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: argumento estado nao pode ser nulo", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoRetornarCEPComEscolaSemCidade() {
        try {
            Escola escola = new Escola("Escola Teste", null);
            escola.getCEP();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: argumento cidade nao pode ser nulo", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoRetornarCEPComEscolaSemEstado() {
        try {
            Estado estado = new Estado("São Paulo");
            Cidade cidade = new Cidade("São Paulo", estado);
            cidade.setEstado(null);
            Escola escola = new Escola("Escola Teste", cidade);
            escola.getCEP();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: argumento estado nao pode ser nulo", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoRetornarEscolaSemCidade() {
        try {
            Estado estado = new Estado("São Paulo");
            Escola escola = new Escola("Escola Teste", null);
            escola.getNomeCidade();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: argumento cidade nao pode ser nulo", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoRetornarEscolaSemEstado() {
        try {
            Estado estado = new Estado("São Paulo");
            Cidade cidade = new Cidade("São Paulo", estado);
            cidade.setEstado(null);
            Escola escola = new Escola("Escola Teste", cidade);
            escola.getNomeEstado();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: argumento estado nao pode ser nulo", e.getMessage());
        }
    }

    @Test
    void deveRetornarEscolaridadeDiretor() {
        Estado estado = new Estado("São Paulo");
        Cidade cidade = new Cidade("São Paulo", estado);
        Escola escola = new Escola("Escola Teste", cidade);
        Escolaridade escolaridade = new Escolaridade("Mestrado");
        Professor diretor = new Professor("Ana");
        diretor.setEscolaridade(escolaridade);
        escola.setDiretor(diretor);
        assertEquals("Mestrado", escola.getNomeEscolaridadeDiretor());
    }

    @Test
    void deveRetornarDiretorSemEscolaridade() {
        Estado estado = new Estado("São Paulo");
        Cidade cidade = new Cidade("São Paulo", estado);
        Escola escola = new Escola("Escola Teste", cidade);
        Professor diretor = new Professor("João");
        escola.setDiretor(diretor);
        assertEquals("Pessoa sem escolaridade", escola.getNomeEscolaridadeDiretor());
    }

    @Test
    void deveRetornarEscolaSemDiretorEscolaridade() {
        Estado estado = new Estado("São Paulo");
        Cidade cidade = new Cidade("São Paulo", estado);
        Escola escola = new Escola("Escola Teste", cidade);
        assertEquals("Escola sem diretor", escola.getNomeEscolaridadeDiretor());
    }
}