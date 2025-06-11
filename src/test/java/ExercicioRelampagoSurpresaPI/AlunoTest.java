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

}