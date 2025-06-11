package ExercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {
   @Test
    void deveRetornarNomeEstadoNaturalidade() {
        Estado estado = new Estado("Minas Gerais");
        Cidade cidade = new Cidade("Juiz de Fora",estado);
        Aluno aluno = new Aluno("Joao");
        aluno.setCidade(cidade);
        assertEquals("Minas Gerais", aluno.getNomeEstadoNaturalidade());
    }

    @Test
    void deveRetornarNuturalidadeNula() {
        Aluno aluno = new Aluno("Joao");
        assertEquals("Aluno sem naturalidade definida", aluno.getNomeEstadoNaturalidade());
    }

    @Test
    void deveRetonarEstadoEmQueEstuda(){
        Estado estado = new Estado("Rio de Janeiro");
        Cidade cidade = new Cidade("Niteroi", estado);
        Curso curso = new Curso("Engenharia", new TipoEnsino("Presencial"));
        Escola escola = new Escola("Escola", cidade);
        curso.setEscola(escola);
        curso.getEscola().setCidade(cidade);
        Aluno aluno = new Aluno("Maria");
        aluno.setCurso(curso);
        assertEquals("Rio de Janeiro", aluno.getNomeEstadoEstudo());
    }

    @Test
    void deveRetornarEstadoEmQueEstudaNulo() {
        Aluno aluno = new Aluno("Carlos");
        assertEquals("Aluno sem curso definido", aluno.getNomeEstadoEstudo());
    }

    @Test
    void deveRetornarNomeCoordenadorDoCurso(){
        Professor coordenador = new Professor("Ana");
        Curso curso = new Curso("Matematica", new TipoEnsino("Presencial"));
        curso.setCoordenador(coordenador);
        Aluno aluno = new Aluno("Pedro");
        aluno.setCurso(curso);
        assertEquals("Ana", aluno.getCurso().getNomeCoordenador());
    }

    @Test
    void deveRetornarNomeCoordenadorCursoInvalido() {
        Aluno aluno = new Aluno("Lucas");
        assertEquals("Aluno sem curso definido", aluno.getNomeCoordenador());
    }

    @Test
    void deveRetornarCursoSemCoordenador() {
        Curso curso = new Curso("Historia", new TipoEnsino("Presencial"));
        Aluno aluno = new Aluno("Fernanda");
        aluno.setCurso(curso);
        assertEquals("Curso nao possui coordenador", aluno.getNomeCoordenador());
    }


}