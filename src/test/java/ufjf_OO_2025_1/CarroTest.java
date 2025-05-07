package ufjf_OO_2025_1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveAcelerarCarro() {
        Carro carro = new Carro();
        carro.ligar();
        carro.acelerar(100);
        assertEquals(100, carro.getVelocidadeAtual());
    }

    @Test
    void deveLancarExcecaoAceleracaoInvalida() {
        try {
            Carro carro = new Carro();
            carro.ligar();
            carro.acelerar(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Aceleracao invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoAcelerarCarroDesligado() {
        try {
            Carro carro = new Carro();
            carro.acelerar(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nao pode acelerar carro desligado", e.getMessage());
        }
    }

    @Test
    void deveLigarCarroDesligado() {
        Carro carro = new Carro();
        carro.ligar();
        assertEquals(true, carro.isLigado());
    }

    @Test
    void deveDesLigarCarroLigado() {
        Carro carro = new Carro();
        carro.ligar();
        carro.desligar();
        assertEquals(false, carro.isLigado());
        assertEquals(0, carro.getVelocidadeAtual());
    }

    @Test
    void deveLancarExcecaoLigarCarroLigado() {
        try {
            Carro carro = new Carro();
            carro.ligar();
            carro.ligar();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nao pode ligar carro ligado", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoDesLigarCarroDesligado() {
        try {
            Carro carro = new Carro();
            carro.desligar();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nao pode desligar carro desligado", e.getMessage());
        }
    }

    @Test
    void deveFrearCarro() {
        Carro carro = new Carro();
        carro.ligar();
        carro.acelerar(100);
        carro.frear(100);
        assertEquals(0, carro.getVelocidadeAtual());
    }

    @Test
    void deveLancarExcecaoFrearAlemVelocidadeAtual() {
        try {
            Carro carro = new Carro();
            carro.ligar();
            carro.acelerar(100);
            carro.frear(101);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nao pode frear alem da velocidade atual", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoFrenagemInvalida() {
        try {
            Carro carro = new Carro();
            carro.ligar();
            carro.frear(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Frenagem invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoFrearCarroDesligado() {
        try {
            Carro carro = new Carro();
            carro.frear(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nao pode frear carro desligado", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoDesligarCarroMovimento() {
        try {
            Carro carro = new Carro();
            carro.ligar();
            carro.acelerar(100);
            carro.desligar();
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Nao pode desligar carro em movimento", e.getMessage());
        }
    }

}