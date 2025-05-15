package ExercicioHeranca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {

    @Test
    void deveInstanciarRetangulo(){
        Retangulo retangulo = new Retangulo(1,1);
        assertEquals(1, retangulo.getArea());
        assertEquals(4, retangulo.getPerimetro());
    }

    @Test
    void deveAlterarLargura(){
        Retangulo retangulo = new Retangulo(1,1);
        retangulo.setLargura(2);
        assertEquals(2, retangulo.getLargura());
    }

    @Test
    void deveAlterarAltura(){
        Retangulo retangulo = new Retangulo(1,1);
        retangulo.setAltura(2);
        assertEquals(2, retangulo.getAltura());
    }

    @Test
    void deveCalcularArea(){
        Retangulo retangulo = new Retangulo(1,1);
        assertEquals(1, retangulo.getArea());
    }

    @Test
    void deveCalcularPerimetro(){
        Retangulo retangulo = new Retangulo(1,1);
        assertEquals(4, retangulo.getPerimetro());
    }

    @Test
    void deveLancarExcecaoAlturaInvalida(){
        try{
            Retangulo retangulo = new Retangulo(1,0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: altura (double) deve ser positiva", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoLarguraInvalida(){
        try{
            Retangulo retangulo = new Retangulo(0,1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: largura (double) deve ser positiva", e.getMessage());
        }
    }

}