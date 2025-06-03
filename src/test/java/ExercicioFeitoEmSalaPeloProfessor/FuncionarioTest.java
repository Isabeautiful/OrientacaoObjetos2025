package ExercicioFeitoEmSalaPeloProfessor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    @Test
    void deveRetornarNomeDepartamento() {
        Departamento departamento = new Departamento();
        departamento.setNome("TI");
        Funcionario funcionario = new Funcionario(departamento);
        assertEquals("TI", funcionario.getNomeDepartamentoLotacao());
    }

    @Test
    void deveLancarExcecaoDepartamentoNulo() {
        try {
            Funcionario funcionario = new Funcionario(null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Lotacao invalida", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSetDepartamentoNulo() {
        try {
            Funcionario funcionario = new Funcionario(new Departamento());
            funcionario.setLotacao(null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Lotacao invalida", e.getMessage());
        }
    }
}