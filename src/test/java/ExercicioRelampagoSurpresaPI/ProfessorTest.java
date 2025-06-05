package ExercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveInstanciarProfessor(){
        Estado estado = new Estado("E1");
        Cidade cidade = new Cidade("C1", estado);
        Escolaridade escolaridade = new Escolaridade("Mestrando");
        Professor professor = new Professor("P1", escolaridade, cidade);
        assertEquals("MESTRANDO", professor.getNomeGraduacao());
        assertEquals("P1", professor.getNome());
    }

    @Test
    void deveRetornarNomeEscolaridade(){
        Estado estado = new Estado("E1");
        Cidade cidade = new Cidade("C1", estado);
        Escolaridade escolaridade = new Escolaridade("Doutorando");
        Professor professor = new Professor("P1", escolaridade, cidade);
        assertEquals("DOUTORANDO", professor.getNomeGraduacao());
    }

    @Test
    void deveRetornarPessoaSemEscolaridade(){
        Estado estado = new Estado("E1");
        Cidade cidade = new Cidade("C1", estado);
        Professor professor = new Professor("P1", null, cidade);
        assertEquals("Pessoa sem escolaridade", professor.getNomeGraduacao());
    }

    @Test
    void deveRetornarNaturalidade(){
        Estado estado = new Estado("E1");
        Cidade cidade = new Cidade("C1", estado);
        Professor professor = new Professor("P1", null, cidade);
        assertEquals("C1 E1", professor.getNaturalidade());
    }

    @Test
    void deveLancarExcecaoCidadeInvalida(){
        try{
            Professor professor = new Professor("P1", null, null);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: argumento cidade nao pode ser nulo", e.getMessage());
        }
    }

}