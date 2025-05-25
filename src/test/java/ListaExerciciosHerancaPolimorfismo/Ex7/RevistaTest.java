package ListaExerciciosHerancaPolimorfismo.Ex7;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RevistaTest {
    @Test
    void deveInstanciarRevista() {
        Revista material = new Revista("R1", LocalDate.of(1, 1, 1));
        assertEquals("R1", material.getTitulo());
        assertEquals(LocalDate.of(1, 1, 1), material.getDataPublicacao());
    }

    @Test
    void deveAlterarTitulo() {
        Revista material = new Revista("R1", LocalDate.of(1, 1, 1));
        material.setTitulo("R2");
        assertEquals("R2", material.getTitulo());
    }

    @Test
    void deveLancarExcecaoTituloInvalido(){
        try{
            Revista material = new Revista("R1", LocalDate.of(1,1,1));
            material.setTitulo("");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento titulo nao pode ser string vazia",e.getMessage());
        }
    }

    @Test
    void deveAlterarData(){
        Revista material = new Revista("R1", LocalDate.of(1,1,1));
        material.setDataPublicacao(LocalDate.of(1,1,2));
        assertEquals(LocalDate.of(1,1,2), material.getDataPublicacao());
    }

    @Test
    void deveCalcularDataDevolucao(){
        Revista material = new Revista("R1", LocalDate.of(1,1,1));
        assertEquals(LocalDate.of(1,1,9),material.calcularDataDevolucao(LocalDate.of(1,1,2)));
    }


}