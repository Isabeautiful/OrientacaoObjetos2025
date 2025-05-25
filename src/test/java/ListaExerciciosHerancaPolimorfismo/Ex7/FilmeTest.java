package ListaExerciciosHerancaPolimorfismo.Ex7;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FilmeTest {

    @Test
    void deveInstanciarFilme() {
        Filme material = new Filme("F1", LocalDate.of(1, 1, 1));
        assertEquals("F1", material.getTitulo());
        assertEquals(LocalDate.of(1, 1, 1), material.getDataPublicacao());
    }

    @Test
    void deveAlterarTitulo() {
        Filme material = new Filme("F1", LocalDate.of(1, 1, 1));
        material.setTitulo("F2");
        assertEquals("F2", material.getTitulo());
    }

    @Test
    void deveLancarExcecaoTituloInvalido(){
        try{
            Filme material = new Filme("F1", LocalDate.of(1,1,1));
            material.setTitulo("");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento titulo nao pode ser string vazia",e.getMessage());
        }
    }

    @Test
    void deveAlterarData(){
        Filme material = new Filme("F1", LocalDate.of(1,1,1));
        material.setDataPublicacao(LocalDate.of(1,1,2));
        assertEquals(LocalDate.of(1,1,2), material.getDataPublicacao());
    }

    @Test
    void deveCalcularDataDevolucao(){
        Filme material = new Filme("F1", LocalDate.of(1,1,1));
        assertEquals(LocalDate.of(1,1,7),material.calcularDataDevolucao(LocalDate.of(1,1,2)));
    }

}