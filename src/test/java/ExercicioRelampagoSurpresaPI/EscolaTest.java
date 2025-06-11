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

}