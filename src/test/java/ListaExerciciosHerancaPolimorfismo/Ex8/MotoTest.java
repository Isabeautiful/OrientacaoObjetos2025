package ListaExerciciosHerancaPolimorfismo.Ex8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotoTest {

    @Test
    void deveInstanciarMoto() {
        Moto veiculo = new Moto("C1", "M1", 0.01);
        assertEquals("C1", veiculo.getMarca());
        assertEquals("M1", veiculo.getModelo());
        assertEquals(0.01, veiculo.getPrecoBase());
    }

    @Test
    void deveLancarExcecaoMarcaInvalida() {
        try {
            Moto veiculo = new Moto("", "M1", 1.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Argumento marca nao pode ser uma string vazia", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoModeloInvalido() {
        try {
            Moto veiculo = new Moto("C1", "", 1.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Argumento modelo nao pode ser uma string vazia", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoPrecoBaseInvalido() {
        try {
            Moto veiculo = new Moto("C1", "M1", 0.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Argumento PrecoBase deve ser positivo", e.getMessage());
        }
    }

    @Test
    void deveCalcularCusto() {
        Moto veiculo = new Moto("C1", "M1", 100.0);
        assertEquals(115, veiculo.calcularCusto());
    }

    @Test
    void deveAlterarMarca() {
        Moto veiculo = new Moto("C1", "M1", 1.0);
        veiculo.setMarca("C2");
        assertEquals("C2", veiculo.getMarca());
    }

    @Test
    void deveAlterarModelo() {
        Moto veiculo = new Moto("C1", "M1", 1.0);
        veiculo.setModelo("M2");
        assertEquals("M2", veiculo.getModelo());
    }

    @Test
    void deveAlterarPrecoBase() {
        Moto veiculo = new Moto("C1", "M1", 1.0);
        veiculo.setPrecoBase(2.0);
        assertEquals(2.0, veiculo.getPrecoBase());
    }

}