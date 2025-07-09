package ExercicioAN08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlunoBolsistaParcialTest {

    @Test
    void deveLancarExcecaoDescontoMaiorQueCinquenta() {
        try {
            new AlunoBolsistaParcial("123", "João", "Rua Z", 500, 6, 55);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Desconto deve estar entre 0% e 50%.", e.getMessage());
        }
    }

    @Test
    void deveCalcularMensalidadeComDesconto() {
        AlunoBolsistaParcial aluno = new AlunoBolsistaParcial("123", "João", "Rua Z", 1000, 6, 30);
        assertEquals(700f, aluno.calcularMensalidade(), 0.001);
    }
}
