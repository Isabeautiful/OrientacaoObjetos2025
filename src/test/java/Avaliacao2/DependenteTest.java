package Avaliacao2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DependenteTest {

    @Test
    void deveAlterarDataNascimento(){
        Dependente dependente = new Dependente("Ana");
        dependente.setDataNascimento("01/01/2025");
        assertEquals("01/01/2025", dependente.getDataNascimento());
    }

    @Test
    void deveLancarExcecaoDataNascimentoInvalida(){
        try {
            Dependente dependente = new Dependente("Ana");
            dependente.setDataNascimento("");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: String dataNascimento invalida", e.getMessage());
        }
    }

}