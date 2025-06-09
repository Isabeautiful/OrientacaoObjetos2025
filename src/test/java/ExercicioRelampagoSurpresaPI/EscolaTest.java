package ExercicioRelampagoSurpresaPI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaTest {
    @Test
    void deveInstanciarEscola(){
        Estado estado = new Estado("Estado1");
        Cidade cidade = new Cidade("C1", estado);
        Professor professor = new Professor("Diretor", cidade);
        Escola escola = new Escola("Escola1", cidade, professor);
        assertEquals("Escola1", escola.getNome());
        assertEquals("C1", escola.getNomeCidade());
        assertEquals("Diretor", escola.getNomeDiretor());
        assertEquals("Estado1", escola.getNomeEstado());
    }

    @Test
    void deveAlterarNomeEscola(){
        Estado estado = new Estado("Estado1");
        Cidade cidade = new Cidade("C1", estado);
        Professor professor = new Professor("Diretor", cidade);
        Escola escola = new Escola("Escola1", cidade, professor);
        escola.setNome("Escola2");
        assertEquals("Escola2", escola.getNome());
    }

    @Test
    void deveLancarExcecaoNomeInvalido(){
        try{
            Estado estado = new Estado("Estado1");
            Cidade cidade = new Cidade("C1", estado);
            Professor professor = new Professor("Diretor", cidade);
            Escola escola = new Escola("", cidade, professor);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: argumento nome nao pode ser vazio", e.getMessage());
        }
    }

    @Test
    void deveAlterarCidade(){
        Estado estado = new Estado("Estado1");
        Cidade cidade = new Cidade("C1", estado);
        Professor professor = new Professor("Diretor", cidade);
        Escola escola = new Escola("Escola1", cidade, professor);
        Cidade cidade1 = new Cidade("C2", estado);
        escola.setCidade(cidade1);
        assertEquals("C2", escola.getNomeCidade());
    }

    @Test
    void deveLancarExcecaoCidadeInvalida(){
        try{
            Estado estado = new Estado("Estado1");
            Professor professor = new Professor("Diretor", null);
            Escola escola = new Escola("Escola1", null, professor);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: argumento cidade nao pode ser nulo", e.getMessage());
        }
    }

    @Test
    void deveAlterarDiretor(){
        Estado estado = new Estado("Estado1");
        Cidade cidade = new Cidade("C1", estado);
        Professor professor = new Professor("Diretor", cidade);
        Escola escola = new Escola("Escola1", cidade, professor);
        Professor professor1 = new Professor("Diretor2", cidade);
        escola.setDiretor(professor1);
        assertEquals("Diretor2", escola.getNomeDiretor());
    }

    @Test void deveLancarExcecaoDiretorInvalido(){
        try{
            Estado estado = new Estado("Estado1");
            Cidade cidade = new Cidade("C1", estado);
            Escola escola = new Escola("Escola1", cidade, null);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: diretor nao pode ser nulo", e.getMessage());
        }
    }
}