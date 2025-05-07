package Exercicios_Lista_02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    @Test
    public void deveCriarLivro() {
        Livro livro = new Livro("A Bíblia do Procrastinador", "Prof. Amanhã Gonzalez", 2025, 100, "Produtividade Negativa");
        assertEquals("A Bíblia do Procrastinador", livro.getTitulo());
        assertEquals("Prof. Amanhã Gonzalez", livro.getAutor());
        assertEquals(2025, livro.getAno_publicacao());
        assertEquals(100, livro.getNumero_paginas());
        assertEquals("Produtividade Negativa", livro.getGenero());
        assertEquals(1, livro.getPagina_atual());
        assertFalse(livro.isAberto());
    }

    @Test
    public void deveAbrir() {
        Livro livro = new Livro("A Bíblia do Procrastinador", "Prof. Amanhã Gonzalez", 2025, 100, "Produtividade Negativa");
        livro.abrir();
        assertTrue(livro.isAberto());
    }

    @Test
    public void deveFechar() {
        Livro livro = new Livro("A Bíblia do Procrastinador", "Prof. Amanhã Gonzalez", 2025, 100, "Produtividade Negativa");
        livro.abrir();
        livro.fechar();
        assertFalse(livro.isAberto());
    }

    @Test
    public void deveMarcarPagina() {
        Livro livro = new Livro("A Bíblia do Procrastinador", "Prof. Amanhã Gonzalez", 2025, 100, "Produtividade Negativa");
        livro.abrir();
        livro.setPagina_marcada();
        assertEquals(1, livro.getPagMarcada());
    }

    @Test
    public void deveAvancarPagina() {
        Livro livro = new Livro("A Bíblia do Procrastinador", "Prof. Amanhã Gonzalez", 2025, 100, "Produtividade Negativa");
        livro.abrir();
        livro.avancar_pagina();
        assertEquals(2, livro.getPagina_atual());
    }

    @Test
    public void deveVoltarPagina() {
        Livro livro = new Livro("A Bíblia do Procrastinador", "Prof. Amanhã Gonzalez", 2025, 100, "Produtividade Negativa");
        livro.abrir();
        livro.avancar_pagina();
        livro.retroceder_pagina();
        assertEquals(1, livro.getPagina_atual());
    }

    @Test
    public void deveLancarExcessaoAnoPublicacaoInvalido() {
        try {
            Livro livro = new Livro("A Bíblia do Procrastinador", "Prof. Amanhã Gonzalez", 2026, 1, "Produtividade Negativa");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Ano de publicacao superior ao ano atual", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcessaoNumeroPaginasInvalido() {
        try {
            Livro livro = new Livro("A Bíblia do Procrastinador", "Prof. Amanhã Gonzalez", 2025, 0, "Produtividade Negativa");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Numero de paginas deve ser um numero positivo nao nulo", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcessaoFecharInvalido() {
        try {
            Livro livro = new Livro("A Bíblia do Procrastinador", "Prof. Amanhã Gonzalez", 2025, 1, "Produtividade Negativa");
            livro.fechar();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Nao é possivel abrir um livro aberto ou fechar um livro fechado.", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcessaoAbrirInvalido() {
        try {
            Livro livro = new Livro("A Bíblia do Procrastinador", "Prof. Amanhã Gonzalez", 2025, 1, "Produtividade Negativa");
            livro.abrir();
            livro.abrir();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Nao é possivel abrir um livro aberto ou fechar um livro fechado.", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcessaoMarcarPaginaInvalido() {
        try {
            Livro livro = new Livro("A Bíblia do Procrastinador", "Prof. Amanhã Gonzalez", 2025, 1, "Produtividade Negativa");
            livro.marcar_pagina();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: O livro deve estar aberto para marcar a pagina", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcessaoAvancarPaginaInvalidoLivroFechado() {
        try {
            Livro livro = new Livro("A Bíblia do Procrastinador", "Prof. Amanhã Gonzalez", 2025, 1, "Produtividade Negativa");
            livro.avancar_pagina();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: O livro deve estar aberto para avancar a pagina", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcessaoRetrocederPaginaInvalidoLivroFechado() {
        try {
            Livro livro = new Livro("A Bíblia do Procrastinador", "Prof. Amanhã Gonzalez", 2025, 1, "Produtividade Negativa");
            livro.retroceder_pagina();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: O livro deve estar aberto para voltar a pagina", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcessaoAvancarPaginaInvalidoFinalLivro() {
        try {
            Livro livro = new Livro("A Bíblia do Procrastinador", "Prof. Amanhã Gonzalez", 2025, 1, "Produtividade Negativa");
            livro.abrir();
            livro.avancar_pagina();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Numero de paginas totais alcancado", e.getMessage());
        }
    }

    @Test
    public void deveLancarExcessaoRetrocederPaginaInvalidoInicioLivro() {
        try {
            Livro livro = new Livro("A Bíblia do Procrastinador", "Prof. Amanhã Gonzalez", 2025, 1, "Produtividade Negativa");
            livro.abrir();
            livro.retroceder_pagina();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Erro: Inicio do livro alcancado", e.getMessage());
        }
    }

}