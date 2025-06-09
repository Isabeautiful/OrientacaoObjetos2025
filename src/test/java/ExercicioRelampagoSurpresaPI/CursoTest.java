package ExercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {
    @Test
    void deveInstanciarCurso(){
        TipoEnsino tipoEnsino = new TipoEnsino("TE1");
        Estado estado = new Estado("E1");
        Cidade cidade = new Cidade("Cidade1", estado);
        Professor professor = new Professor("Coordenador", cidade);
        Escola escola = new Escola("E1", cidade, professor);
        Curso curso = new Curso("Curso1", tipoEnsino, escola);
        assertEquals("Curso1", curso.getNome());
        assertEquals("TE1", curso.getNomeTipoEnsino());
        assertEquals("E1", curso.getNomeEscola());
    }

    @Test
    void deveAlterarNomeCurso(){
        TipoEnsino tipoEnsino = new TipoEnsino("TE1");
        Cidade cidade = new Cidade("Cidade1", new Estado("Estado1"));
        Curso curso = new Curso("Curso1", tipoEnsino,
                new Escola("Escola1", cidade , new Professor("P1", cidade )));
        curso.setNome("Curso2");
        assertEquals("Curso2", curso.getNome());
    }

    @Test
    void deveLancarExcecaoNomeCursoInvalido(){
        try{
            TipoEnsino tipoEnsino = new TipoEnsino("TE1");
            Cidade cidade = new Cidade("Cidade1", new Estado("Estado1"));
            Curso curso = new Curso("", tipoEnsino,
                    new Escola("Escola1", cidade , new Professor("P1", cidade )));
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: argumento nome nao pode ser vazio", e.getMessage());
        }
    }

    @Test
    void deveAlterarTipoEnsino(){
        TipoEnsino tipoEnsino = new TipoEnsino("TE1");
        Cidade cidade = new Cidade("Cidade1", new Estado("Estado1"));
        Curso curso = new Curso("Curso1", tipoEnsino,
                new Escola("Escola1", cidade , new Professor("P1", cidade )));
        TipoEnsino tipoEnsino1 = new TipoEnsino("TE2");
        curso.setTipoEnsino(tipoEnsino1);
        assertEquals("TE2", curso.getNomeTipoEnsino());
    }

    @Test
    void deveLancarExcecaoTipoEnsinoInvalido(){
        try{
            Cidade cidade = new Cidade("Cidade1", new Estado("Estado1"));
            Curso curso = new Curso("Curso1", null,
                    new Escola("Escola1", cidade , new Professor("P1", cidade )));
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: argumento tipo de ensino nao pode ser nulo", e.getMessage());
        }
    }

    @Test
    void deveAlterarCoordenador(){
        TipoEnsino tipoEnsino = new TipoEnsino("TE1");
        Estado estado = new Estado("E1");
        Cidade cidade = new Cidade("Cidade1", estado);
        Professor professor = new Professor("Coordenador", cidade);
        Curso curso = new Curso("Curso1", tipoEnsino,
                new Escola("Escola1", cidade, professor));
        curso.setCoordenador(professor);
        assertEquals("Coordenador", curso.getNomeCoordenador());
    }

    @Test
    void deveVerificarCursoNaoPossuiCoordenador(){
        TipoEnsino tipoEnsino = new TipoEnsino("TE1");
        Cidade cidade = new Cidade("Cidade1", new Estado("Estado1"));
        Curso curso = new Curso("Curso1", tipoEnsino,
                new Escola("Escola1", cidade , new Professor("P1", cidade )));
        assertEquals("Curso nao possui coordenador", curso.getNomeCoordenador());
    }

    @Test
    void deveAlterarEscola(){
        TipoEnsino tipoEnsino = new TipoEnsino("TE1");
        Estado estado = new Estado("E1");
        Cidade cidade = new Cidade("Cidade1", estado);
        Professor professor = new Professor("Coordenador", cidade);
        Escola escola = new Escola("E1", cidade, professor);
        Curso curso = new Curso("Curso1", tipoEnsino, escola);
        curso.setEscola(escola);
        assertEquals("E1", escola.getNome());
    }

    @Test
    void deveLancarExcecaoEscolaInvalida(){
        try{
            TipoEnsino tipoEnsino = new TipoEnsino("TE1");
            Estado estado = new Estado("E1");
            Cidade cidade = new Cidade("Cidade1", estado);
            Professor professor = new Professor("Coordenador", cidade);
            Curso curso = new Curso("Curso1", tipoEnsino,
                    new Escola("Escola1", cidade, professor));
            curso.setEscola(null);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: o curso deve estar em uma escola", e.getMessage());
        }
    }
}