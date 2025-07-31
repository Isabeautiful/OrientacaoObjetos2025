package Avaliacao2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CargoTest {

    @Test
    void deveAlterarSalarioBruto(){
        Cargo cargo = new Cargo();
        cargo.setSalarioBruto(1);
        assertEquals(1,cargo.getSalarioBruto());
    }

    @Test
    void deveLancarExcecaoSalarioBrutoInvalido(){
        try {
            Cargo cargo = new Cargo();
            cargo.setSalarioBruto(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: salario não pode ser negativo ou zero", e.getMessage());
        }
    }

}