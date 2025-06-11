package ExercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {
   @Test
    void deveRetornarNomeEstadoNaturalidade() {
        Estado estado = new Estado("Minas Gerais");
        Cidade cidade = new Cidade("Juiz de Fora",estado);
        Aluno aluno = new Aluno("Joao");
        aluno.setNaturalidade(cidade);
        assertEquals("Minas Gerais", aluno.getNomeEstadoNaturalidade());
    }

    @Test
    void deveRetornarNuturalidadeNula() {
        Aluno aluno = new Aluno();
        assertEquals("Pessoa sem naturalidade", aluno.getNomeEstadoNaturalidade());
    }

    @Test
    void deveRetonarEstadoEmQueEstuda(){
        Estado estado = new Estado("Rio de Janeiro");
        Cidade cidade = new Cidade("Niteroi", estado);
        Curso curso = new Curso("Engenharia", new TipoEnsino("Presencial"));
        curso.setCidade(cidade);
        Aluno aluno = new Aluno("Maria");
        aluno.setCurso(curso);
        assertEquals("Rio de Janeiro", aluno.getNomeEstadoEstudo());
    }

    @Test
    void deveRetornarEstadoEmQueEstudaNulo() {
        Aluno aluno = new Aluno("Carlos");
        assertEquals("Aluno sem curso definido", aluno.getNomeEstadoEstudo());
    }
}