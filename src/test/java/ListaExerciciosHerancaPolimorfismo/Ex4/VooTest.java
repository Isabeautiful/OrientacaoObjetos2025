package ListaExerciciosHerancaPolimorfismo.Ex4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooTest {

    @Test
    void deveInstanciarVoo(){
        Voo voo = new VooDomestico("O1", 1, "D1", "20/05/2025", 1);
        assertEquals("O1", voo.getOrigem());
        assertEquals("D1", voo.getDestino());
        assertEquals(1, voo.getDistancia());
        assertEquals("20/05/2025", voo.getDataVoo());
    }

    @Test
    void deveAlterarOrigem(){
        Voo voo = new VooDomestico("O1", 1, "D1", "20/05/2025", 1);
        voo.setOrigem("O2");
        assertEquals("O2", voo.getOrigem());
    }

    @Test
    void deveLancarExcecaoOrigemInvalida(){
        try{
            Voo voo = new VooDomestico("", 1, "D1", "20/05/2025", 1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento Origem nao pode ser uma string vazia", e.getMessage());
        }
    }

    @Test
    void deveAlterarDestino(){
        Voo voo = new VooDomestico("O1", 1, "D1", "20/05/2025", 1);
        voo.setDestino("D2");
        assertEquals("D2", voo.getDestino());
    }

    @Test
    void deveLancarExcecaoDestinoInvalida(){
        try{
            Voo voo = new VooDomestico("O1", 1, "", "20/05/2025", 1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento destino nao pode ser uma string vazia", e.getMessage());
        }
    }

    @Test
    void deveAlterarDistancia(){
        Voo voo = new VooDomestico("O1", 1, "D1", "20/05/2025", 1);
        voo.setDistancia(2);
        assertEquals(2, voo.getDistancia());
    }

    @Test
    void deveLancarExcecaoDistanciaInvalida(){
        try{
            Voo voo = new VooDomestico("O1", 0, "D1", "20/05/2025", 1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento distancia deve ser positivo", e.getMessage());
        }
    }

    @Test
    void deveAlterarDataVoo(){
        Voo voo = new VooDomestico("O1", 1, "D1", "20/05/2025", 1);
        voo.setDataVoo("25/05/2025");
        assertEquals("25/05/2025", voo.getDataVoo());
    }

    @Test
    void deveLancarExcecaoDataVooInvalida(){
        try{
            Voo voo = new VooDomestico("O1", 1, "D1", "", 1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento dataVoo nao pode ser uma string vazia", e.getMessage());
        }
    }

}