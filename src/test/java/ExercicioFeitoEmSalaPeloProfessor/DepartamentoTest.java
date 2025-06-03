package ExercicioFeitoEmSalaPeloProfessor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @Test
    void deveRetonarNomeChefe() {
        Departamento departamento = new Departamento();
        Funcionario funcionario = new Funcionario(departamento);
        funcionario.setNome("Marco");
        departamento.setChefe(funcionario);
        assertEquals("Marco", departamento.getNomeChefe());
    }

    @Test
    void deveRetonarDepartamentoSemNomeChefe() {
        Departamento departamento = new Departamento();
        Funcionario funcionario = new Funcionario(departamento);
        assertEquals("Departamento sem chefe", departamento.getNomeChefe());
    }

}