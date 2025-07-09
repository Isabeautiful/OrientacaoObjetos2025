package ExercicioAN08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlunoBolsistaIntegralTest {

    @Test
    void deveLancarExcecaoNumeroParcelasIsentasInvalido() {
        try {
            new AlunoBolsistaIntegral("123", "Ana", "Rua Y", 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Número de parcelas isentas deve ser maior que zero.", e.getMessage());
        }
    }

    @Test
    void deveRetornarMensalidadeZero() {
        AlunoBolsistaIntegral aluno = new AlunoBolsistaIntegral("123", "Ana", "Rua Y", 6);
        assertEquals(0f, aluno.calcularMensalidade());
        assertEquals(6, aluno.getNumeroParcelas());
    }
}
