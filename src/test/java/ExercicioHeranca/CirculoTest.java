package ExercicioHeranca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    @Test
    void deveInstanciarCirculo(){
        Circulo circulo = new Circulo(1);
        assertEquals(Math.PI, circulo.getArea());
        assertEquals(1, circulo.getRaio());
        assertEquals(2 * Math.PI, circulo.getPerimetro());
    }

    @Test
    void deveAlterarRaio(){
        Circulo circulo = new Circulo(1);
        circulo.setRaio(2);
        assertEquals(2,circulo.getRaio());
    }

    @Test
    void deveCalcularArea(){
        Circulo circulo = new Circulo(1);
        assertEquals(Math.PI, circulo.getArea());
    }

    @Test
    void deveCalcularPerimetro(){
        Circulo circulo = new Circulo(1);
        assertEquals(2*Math.PI, circulo.getPerimetro());
    }

    @Test
    void deveLancarExcecaoRaioInvalido(){
        try{
            Circulo circulo = new Circulo(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: raio (double) deve ser positivo", e.getMessage());
        }
    }
}