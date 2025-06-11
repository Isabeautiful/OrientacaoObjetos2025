package ExercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaridadeTest {
    @Test
    void alteraNomeEscolaridade(){
        Escolaridade escolaridade = new Escolaridade("Ensino Médio");
        assertEquals("Ensino Médio", escolaridade.getNome());
    }

    @Test
    void deveLancarExcecaoNomeVazio(){
      try{
        Escolaridade escolaridade = new Escolaridade("");
        fail();
      }
      catch (IllegalArgumentException e){
          assertEquals("Erro: argumento graduacao nao pode ser vazio", e.getMessage());
      }
    }
}