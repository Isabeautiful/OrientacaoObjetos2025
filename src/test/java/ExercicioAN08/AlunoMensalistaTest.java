package ExercicioAN08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlunoMensalistaTest {

    @Test
    void deveLancarExcecaoValorMensalidadeInvalido() {
        try {
            new AlunoMensalista("123", "Carlos", "Rua X", 0, 10);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Valor da mensalidade deve ser maior que zero.", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoNumeroParcelasInvalido() {
        try {
            new AlunoMensalista("123", "Carlos", "Rua X", 500, 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Número de parcelas deve ser maior que zero.", e.getMessage());
        }
    }

    @Test
    void deveRetornarMensalidade() {
        AlunoMensalista a = new AlunoMensalista("123", "Carlos", "Rua X", 500, 6);
        assertEquals(500f, a.calcularMensalidade());
    }
}
