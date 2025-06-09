package ExercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void deveInstanciarProfessor(){
        Estado estado = new Estado("E1");
        Cidade cidade = new Cidade("C1", estado);
        Escolaridade escolaridade = new Escolaridade("Mestrando");
        Professor professor = new Professor("P1", cidade);
        professor.setEscolaridade(escolaridade);
        assertEquals("MESTRANDO", professor.getNomeGraduacao());
        assertEquals("P1", professor.getNome());
    }

    @Test
    void deveRetornarNomeEscolaridade(){
        Estado estado = new Estado("E1");
        Cidade cidade = new Cidade("C1", estado);
        Escolaridade escolaridade = new Escolaridade("Doutorando");
        Professor professor = new Professor("P1", cidade);
        professor.setEscolaridade(escolaridade);
        assertEquals("DOUTORANDO", professor.getNomeGraduacao());
    }

    @Test
    void deveRetornarPessoaSemEscolaridade(){
        Estado estado = new Estado("E1");
        Cidade cidade = new Cidade("C1", estado);
        Professor professor = new Professor("P1", cidade);
        assertEquals("Pessoa sem escolaridade", professor.getNomeGraduacao());
    }

    @Test
    void deveRetornarNaturalidade(){
        Estado estado = new Estado("E1");
        Cidade cidade = new Cidade("C1", estado);
        Professor professor = new Professor("P1", cidade);
        assertEquals("C1 E1", professor.getNaturalidade());
    }

    @Test
    void deveLancarExcecaoCidadeInvalida(){
        try{
            Professor professor = new Professor("P1", null);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: argumento cidade nao pode ser nulo", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeContratacao(){
        Estado estado = new Estado("Estado1");
        Cidade cidade = new Cidade("C1", estado);
        Escolaridade escolaridade = new Escolaridade("mestrando");
        Professor professor = new Professor("P1", cidade);
        TipoEnsino tipoEnsino = new TipoEnsino("TE1");
        Curso curso = new Curso("Curso1", tipoEnsino, new Escola("Escola1", cidade, professor));
        professor.setContratacao(curso);
        assertEquals("Curso1", professor.getNomeContratacao());
    }

    @Test
    void deveRetornarProfessorSemContratacao(){
        Estado estado = new Estado("Estado1");
        Cidade cidade = new Cidade("C1", estado);
        Escolaridade escolaridade = new Escolaridade("mestrando");
        Professor professor = new Professor("P1", cidade);
        professor.setContratacao(null);
        assertEquals("Professor nao trabalha nesse curso", professor.getNomeContratacao());
    }

    @Test
    void deveRetornarNomeTipoEnsino(){
        Estado estado = new Estado("Estado1");
        Cidade cidade = new Cidade("C1", estado);
        Escolaridade escolaridade = new Escolaridade("mestrando");
        Professor professor = new Professor("P1", cidade);
        TipoEnsino tipoEnsino = new TipoEnsino("TE1");
        Curso curso = new Curso("Curso1", tipoEnsino, new Escola("Escola1", cidade, professor));
        professor.setContratacao(curso);
        assertEquals("TE1", professor.getNomeTipoDeEnsino());
    }

}