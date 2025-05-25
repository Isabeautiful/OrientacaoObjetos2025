package ListaExerciciosHerancaPolimorfismo.Ex8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveInstanciarCarro() {
        Carro veiculo = new Carro("C1", "M1", 0.01);
        assertEquals("C1", veiculo.getMarca());
        assertEquals("M1", veiculo.getModelo());
        assertEquals(0.01, veiculo.getPrecoBase());
    }

    @Test
    void deveLancarExcecaoMarcaInvalida() {
        try {
            Carro veiculo = new Carro("", "M1", 1.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Argumento marca nao pode ser uma string vazia", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoModeloInvalido() {
        try {
            Carro veiculo = new Carro("C1", "", 1.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Argumento modelo nao pode ser uma string vazia", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoPrecoBaseInvalido() {
        try {
            Carro veiculo = new Carro("C1", "M1", 0.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Argumento PrecoBase deve ser positivo", e.getMessage());
        }
    }

    @Test
    void deveCalcularCusto() {
        Carro veiculo = new Carro("C1", "M1", 100.0);
        assertEquals(125, veiculo.calcularCusto());
    }

    @Test
    void deveAlterarMarca() {
        Carro veiculo = new Carro("C1", "M1", 1.0);
        veiculo.setMarca("C2");
        assertEquals("C2", veiculo.getMarca());
    }

    @Test
    void deveAlterarModelo() {
        Carro veiculo = new Carro("C1", "M1", 1.0);
        veiculo.setModelo("M2");
        assertEquals("M2", veiculo.getModelo());
    }

    @Test
    void deveAlterarPrecoBase() {
        Carro veiculo = new Carro("C1", "M1", 1.0);
        veiculo.setPrecoBase(2.0);
        assertEquals(2.0, veiculo.getPrecoBase());
    }

}