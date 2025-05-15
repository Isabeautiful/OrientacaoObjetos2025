package ExercicioHeranca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormaGeometricaTest {

    @Test
    void deveCalcularArea(){
        FormaGeometrica retangulo = new Retangulo(1,1);
        assertEquals(1, retangulo.getArea());
    }

    @Test
    void deveCalcularPerimetro(){
        FormaGeometrica retangulo = new Retangulo(1,1);
        assertEquals(4, retangulo.getPerimetro());
    }

}