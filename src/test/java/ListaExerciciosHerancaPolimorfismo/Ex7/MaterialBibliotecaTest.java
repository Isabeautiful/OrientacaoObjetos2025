package ListaExerciciosHerancaPolimorfismo.Ex7;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MaterialBibliotecaTest {
    @Test
    void deveInstanciarMaterialBiblioteca() {
        MaterialBiblioteca material = new Livro("L1", LocalDate.of(1, 1, 1));
        assertEquals("L1", material.getTitulo());
        assertEquals(LocalDate.of(1, 1, 1), material.getDataPublicacao());
    }

    @Test
    void deveAlterarTitulo() {
        MaterialBiblioteca material = new Livro("L1", LocalDate.of(1, 1, 1));
        material.setTitulo("L2");
        assertEquals("L2", material.getTitulo());
    }

    @Test
    void deveLancarExcecaoTituloInvalido(){
        try{
            MaterialBiblioteca material = new Livro("L1", LocalDate.of(1,1,1));
            material.setTitulo("");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento titulo nao pode ser string vazia",e.getMessage());
        }
    }

    @Test
    void deveAlterarData(){
        MaterialBiblioteca material = new Livro("L1", LocalDate.of(1,1,1));
        material.setDataPublicacao(LocalDate.of(1,1,2));
        assertEquals(LocalDate.of(1,1,2), material.getDataPublicacao());
    }

    @Test
    void deveCalcularDataDevolucao(){
        MaterialBiblioteca material = new Livro("L1", LocalDate.of(1,1,1));
        assertEquals(LocalDate.of(1,1,17),material.calcularDataDevolucao(LocalDate.of(1,1,2)));
    }
}