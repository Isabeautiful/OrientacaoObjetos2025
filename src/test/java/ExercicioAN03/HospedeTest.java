package ExercicioAN03;

import ExercicioAN01.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HospedeTest {

    @Test
    void deveLancarExcecaoCodigoInvalido(){
        try{
            Contribuinte contribuinte = new Contribuinte("", "João");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Codigo invalido, string vazia", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoNomeInvalido(){
        try{
            Contribuinte contribuinte = new Contribuinte("111", "");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Nome invalido, string vazia", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoAdicionarImovelInvalido(){
        try{
            Contribuinte contribuinte = new Contribuinte("111", "João");
            contribuinte.adicionarImovel(null);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Imóvel não pode ser nulo", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoRemoverImovelInvalido(){
        try{
            Contribuinte contribuinte = new Contribuinte("111", "João");
            contribuinte.removerImovel(null);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Imóvel não pode ser nulo", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoRemoverImovelNaoExistente(){
        try{
            Contribuinte contribuinte = new Contribuinte("111", "João");
            contribuinte.removerImovel(new ImovelLote(1));
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Imóvel não encontrado na lista", e.getMessage());
        }
    }

    @Test
    void listarImoveisDoContribuinte(){
        Contribuinte contribuinte = new Contribuinte("111", "João");
        Imovel imovel = new ImovelLote(1);
        Imovel imovel1 = new ImovelLote(2);

        contribuinte.adicionarImovel(imovel);
        contribuinte.adicionarImovel(imovel1);

        assertEquals("Lote - 1.0 m² - Valor: R$ 30.0, Lote - 2.0 m² - Valor: R$ 60.0, ", contribuinte.listarImoveis());

    }

    // Testes exemplos do professor

    @Test
    void deveAdicionarZeroImovel(){
        Contribuinte contribuinte = new Contribuinte("111", "João");
        assertEquals(0, contribuinte.getNumeroImoveis());
    }

    @Test
    void deveAdicionarUmImovel(){
        Contribuinte contribuinte = new Contribuinte("111", "João");
        Imovel imovel = new ImovelLote(1);
        contribuinte.adicionarImovel(imovel);
        assertEquals(1, contribuinte.getNumeroImoveis());
    }

    @Test
    void deveAlocarDoisImoveis(){
        Contribuinte contribuinte = new Contribuinte("111", "João");
        Imovel imovel = new ImovelLote(1);
        Imovel imovel2 = new ImovelLote(2);
        contribuinte.adicionarImovel(imovel);
        contribuinte.adicionarImovel(imovel2);
        assertEquals(2, contribuinte.getNumeroImoveis());
    }

    @Test
    void deveCalcularTotalIPTU(){
        Contribuinte contribuinte = new Contribuinte("111", "João");
        Imovel imovel = new ImovelLote(1);
        Imovel imovel2 = new ImovelCasa(1,1);
        Imovel imovel3 = new ImovelApartamento(1,1);

        contribuinte.adicionarImovel(imovel);
        contribuinte.adicionarImovel(imovel2);
        contribuinte.adicionarImovel(imovel3);

        float valorEsperado = 30.0f + 80.0f + 36.0f;

        assertEquals(valorEsperado, contribuinte.calcularTotalIPTU());
    }

    @Test
    void deveEncontrarImovel(){
        Contribuinte contribuinte = new Contribuinte("111", "João");
        Imovel imovel = new ImovelLote(1);
        contribuinte.adicionarImovel(imovel);
        assertTrue(contribuinte.buscarImovel(imovel));
    }

    @Test
    void naoDeveEncontrarImovel(){
        Contribuinte contribuinte = new Contribuinte("111", "João");
        Imovel imovel = new ImovelLote(1);
        assertFalse(contribuinte.buscarImovel(imovel));
    }

    @Test
    void deveRemoverImovel(){
        Contribuinte contribuinte = new Contribuinte("111", "João");
        Imovel imovel = new ImovelLote(1);
        contribuinte.adicionarImovel(imovel);
        contribuinte.removerImovel(imovel);
        assertFalse(contribuinte.buscarImovel(imovel));
    }

    @Test
    void deveRetornarImoveis(){
        Contribuinte contribuinte = new Contribuinte("111", "João");
        Imovel imovel = new ImovelLote(1);
        Imovel imovel1 = new ImovelLote(2);
        contribuinte.adicionarImovel(imovel);
        contribuinte.adicionarImovel(imovel1);

        ArrayList<Imovel> lista = new ArrayList<Imovel>();
        lista.add(imovel);
        lista.add(imovel1);

        assertEquals(lista, contribuinte.getImoveis());
    }

}