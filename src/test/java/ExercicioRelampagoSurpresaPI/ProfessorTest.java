package ExercicioRelampagoSurpresaPI;
//teste
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveInstanciarProfessor(){
        Escolaridade escolaridade = new Escolaridade("Mestrando");
        Professor professor = new Professor("P1", escolaridade);
        assertEquals("MESTRANDO", professor.getNomeGraduacao());
    }

}