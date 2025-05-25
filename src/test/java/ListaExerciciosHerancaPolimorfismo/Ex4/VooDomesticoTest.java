package ListaExerciciosHerancaPolimorfismo.Ex4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VooDomesticoTest {

    @Test
    void deveInstanciarVooDomestico(){
        VooDomestico voo = new VooDomestico("O1", 1, "D1", "20/05/2025", 1);
        assertEquals("O1", voo.getOrigem());
        assertEquals("D1", voo.getDestino());
        assertEquals(1, voo.getDistancia());
        assertEquals(1, voo.getFatorPreco());
        assertEquals("20/05/2025", voo.getDataVoo());
    }

    @Test
    void deveAterarFatorPreco(){
        VooDomestico voo = new VooDomestico("O1", 1, "D1", "20/05/2025", 1);
        voo.setFatorPreco(2);
        assertEquals(2,voo.getFatorPreco());
    }

    @Test
    void deveLancarExcecaoFatorPrecoInvalido(){
        try{
            VooDomestico voo = new VooDomestico("O1", 1, "D1", "20/05/2025", 0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento FatorPreco deve ser positivo", e.getMessage());
        }
    }

    @Test
    void deveCalcularPreco(){
        VooDomestico voo = new VooDomestico("O1", 1, "D1", "20/05/2025", 1);
        assertEquals(1, voo.calcularPreco());
    }


}