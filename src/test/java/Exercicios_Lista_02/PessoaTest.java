package Exercicios_Lista_02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    public void deveInstanciarPessoa() {
        Pessoa pessoa = new Pessoa("Jao da Silva", 0, 1, 1);
        assertEquals("Jao da Silva", pessoa.getNome());
        assertEquals(0, pessoa.getIdade());
        assertEquals(1, pessoa.getAltura());
        assertEquals(1, pessoa.getPeso());
    }

    @Test
    public void deveEnvelhecer(){
        Pessoa pessoa = new Pessoa("Jao da Silva", 0, 1, 1);
        pessoa.envelhecer();
        assertEquals(1, pessoa.getIdade());
    }

    @Test
    public void deveCrescer(){
        Pessoa pessoa = new Pessoa("Jao da Silva", 0, 1F, 1);
        pessoa.crescer();
        assertEquals(1.01F, pessoa.getAltura());
    }

    @Test
    public void deveGanharPeso(){
        Pessoa pessoa = new Pessoa("Jao da Silva", 0, 1, 1);
        pessoa.ganharPeso(1);
        assertEquals(2, pessoa.getPeso());
    }

    @Test
    public void devePerderPeso(){
        Pessoa pessoa = new Pessoa("Jao da Silva", 0, 1, 2);
        pessoa.perderPeso(1);
        assertEquals(1, pessoa.getPeso());
    }

    @Test
    public void deveLancarExcecaoCrescerInvalido(){
        try{
            Pessoa pessoa = new Pessoa("Jao da Silva", 21, 1, 1);
            pessoa.crescer();
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Erro: Idade deve ser menor que 21 para crescer.", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcecaoIdadeInvalida() {
        try {
            Pessoa pessoa = new Pessoa("Jao da Silva", -1, 1, 1);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Erro: Argumento idade (int) deve ser maior ou igual a zero", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcecaoAlturaInvalida(){
        try {
            Pessoa pessoa = new Pessoa("Nome", 0, 0, 1);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Erro: Argumento altura (float) deve ser maior que zero", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcecaoPesoInvalido(){
        try {
            Pessoa pessoa = new Pessoa("Jao da Silva", 0, 1, 0);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Erro: Argumento peso (float) deve ser maior que zero", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcessaoGanharPesoInvalido(){
        try {
            Pessoa pessoa = new Pessoa("Jao da Silva", 0, 1, 1);
            pessoa.ganharPeso(-1);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Erro: Argumento quilos deve ser maior que zero.", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcessaoPerderPesoInvalido(){
        try {
            Pessoa pessoa = new Pessoa("Jao da Silva", 0, 1, 1);
            pessoa.perderPeso(-1);
            fail();
        }
        catch(IllegalArgumentException e){
            assertEquals("Erro: Argumento quilos deve ser maior que zero.", e.getMessage());
        }
    }
}