package ExercicioAN02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContasBancariaTest {

    @Test
    void deveLancarExcecaoNumeroContaInvalido(){
        try{
            ContasBancaria contasBancaria = new ContaPoupanca(1,-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Argumento numeroConta nao pode ser negativo", e.getMessage());
        }
    }

}