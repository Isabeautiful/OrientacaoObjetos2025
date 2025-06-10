package ExercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {
    @Test
    void deveInstanciarAluno(){
        Estado estado = new Estado("E1");
        Cidade cidade = new Cidade("C1", estado);
        Aluno aluno = new Aluno("A1", cidade);
        Escolaridade escolaridade = new Escolaridade("Estudante de Ensino Medio");
        aluno.setEscolaridade(escolaridade);
        assertEquals("A1", aluno.getNome());
        assertEquals("C1", aluno.getNomeCidade());
        assertEquals("E1", aluno.getNomeEstado());
        assertEquals("ESTUDANTE DE ENSINO MEDIO", aluno.getNomeEscolaridade());
    }

    @Test
    void deveAlterarCurso(){
        Estado estado = new Estado("E1");
        Cidade cidade = new Cidade("C1", estado);
        TipoEnsino tipoEnsino = new TipoEnsino("TE1");
        Curso curso = new Curso("Curso1", tipoEnsino,
                new Escola("Escola1", cidade, new Professor("P1", cidade)));
        Aluno aluno = new Aluno("A1", cidade);
        aluno.setCurso(curso);
        assertEquals("Curso1", aluno.getNomeCurso());
    }

    @Test
    void deveAlterarCursoNaoMatriculado(){
        Estado estado = new Estado("E1");
        Cidade cidade = new Cidade("C1", estado);
        Aluno aluno = new Aluno("A1", cidade);
        aluno.setCurso(null);
        assertEquals("Aluno nao matriculado", aluno.getNomeCurso());
    }

    //deveretornarnomeestadonaturalidade
    //deveretornarnaturalidadenula

}