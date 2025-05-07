package Exercicios_Lista_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    @Test
    void deveAlterarPeso(){
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(60);
        assertEquals(60,pessoa.getPeso());
    }

    @Test
    void deveLancarExcecaoPesoInvalido(){
        try {
            Pessoa pessoa = new Pessoa();
            pessoa.setPeso(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Peso deve ser maior que zero", e.getMessage());
        }
    }

    @Test
    void deveAlterarAltura(){
        Pessoa pessoa = new Pessoa();
        pessoa.setAltura(150);
        assertEquals(150,pessoa.getAltura());
    }

    @Test
    void deveLancarExcecaoAlturaInvalida(){
        try{
            Pessoa pessoa = new Pessoa();
            pessoa.setAltura(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Altura deve ser maior que zero", e.getMessage());
        }
    }

    @Test
    void deveAlterarSexo(){
        Pessoa pessoa = new Pessoa();
        pessoa.setSexo("F");
        assertEquals("F", pessoa.getSexo());
    }

    @Test
    void deveLancarExcecaoSexoInvalido(){
        try{
            Pessoa pessoa = new Pessoa();
            pessoa.setSexo("");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Erro: Sexo deve ser F ou M", e.getMessage());
        }
    }

    @Test
    void deveCalcularIMC(){
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(54);
        pessoa.setAltura(1.50);
        assertEquals(24, pessoa.calcularIMC());
    }

    @Test
    void deveClassificarIMCMulherAbaixoDoPeso(){
        Pessoa pessoa = new Pessoa();
        pessoa.setSexo("F");
        pessoa.setPeso(48);
        pessoa.setAltura(1.60);
        pessoa.calcularIMC();
        assertEquals("Mulher Abaixo do peso", pessoa.classificarIMC());
    }

    @Test
    void deveClassificarIMCMulherPesoNormal(){
        Pessoa pessoa = new Pessoa();
        pessoa.setSexo("F");
        pessoa.setPeso(49);
        pessoa.setAltura(1.60);
        pessoa.calcularIMC();
        assertEquals("Mulher no peso normal", pessoa.classificarIMC());
    }

    @Test
    void deveClassificarIMCMulherMarginalmenteAcimaDoPeso(){
        Pessoa pessoa = new Pessoa();
        pessoa.setSexo("F");
        pessoa.setPeso(72);
        pessoa.setAltura(1.65);
        pessoa.calcularIMC();
        assertEquals("Mulher Marginalmente acima do peso", pessoa.classificarIMC());
    }

    @Test
    void deveClassificarIMCMulherAcimaPesoIdeal(){
        Pessoa pessoa = new Pessoa();
        pessoa.setSexo("F");
        pessoa.setPeso(80);
        pessoa.setAltura(1.70);
        pessoa.calcularIMC();
        assertEquals("Mulher Acima do Peso ideal", pessoa.classificarIMC());
    }

    @Test
    void deveClassificarIMCMulherObesa(){
        Pessoa pessoa = new Pessoa();
        pessoa.setSexo("F");
        pessoa.setPeso(95);
        pessoa.setAltura(1.71);
        pessoa.calcularIMC();
        assertEquals("Mulher Obesa", pessoa.classificarIMC());
    }

    @Test
    void deveClassificarIMCHomemAbaixoDoPeso(){
        Pessoa pessoa = new Pessoa();
        pessoa.setSexo("M");
        pessoa.setPeso(50);
        pessoa.setAltura(1.60);
        pessoa.calcularIMC();
        assertEquals("Homem Abaixo do peso", pessoa.classificarIMC());
    }

    @Test
    void deveClassificarIMCHomemPesoNormal(){
        Pessoa pessoa = new Pessoa();
        pessoa.setSexo("M");
        pessoa.setPeso(54);
        pessoa.setAltura(1.61);
        pessoa.calcularIMC();
        assertEquals("Homem No peso normal", pessoa.classificarIMC());
    }

    @Test
    void deveClassificarIMCHomemMarginalmenteAcimaDoPeso(){
        Pessoa pessoa = new Pessoa();
        pessoa.setSexo("M");
        pessoa.setPeso(81);
        pessoa.setAltura(1.74);
        pessoa.calcularIMC();
        assertEquals("Homem Marginalmente acima do peso", pessoa.classificarIMC());
    }

    @Test
    void deveClassificarIMCHomemAcimaPesoIdeal(){
        Pessoa pessoa = new Pessoa();
        pessoa.setSexo("M");
        pessoa.setPeso(86);
        pessoa.setAltura(1.75);
        pessoa.calcularIMC();
        assertEquals("Homem Acima do Peso ideal", pessoa.classificarIMC());
    }

    @Test
    void deveClassificarIMCHomemObeso(){
        Pessoa pessoa = new Pessoa();
        pessoa.setSexo("M");
        pessoa.setPeso(96);
        pessoa.setAltura(1.75);
        pessoa.calcularIMC();
        assertEquals("Homem Obeso", pessoa.classificarIMC());
    }

}