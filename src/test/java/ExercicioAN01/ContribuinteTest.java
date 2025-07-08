package ExercicioAN01;

import ExercicioRelampagoSurpresaHP.Departamento;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ContribuinteTest {

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

        //TODO: checar se esse valor ta certo
        assertEquals(0, contribuinte.calcularTotalIPTU());
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