package Exercicios_Lista_02;
//Exercicio 03
public class Livro {
    private String titulo;
    private String autor;
    private int ano_publicacao;
    private int numero_paginas;
    private String genero;

    //variaveis de controle dos metodos
    private int paginaAtual;
    private int pagMarcada;
    private boolean aberto;

    //Construtor
    public Livro(String titulo, String autor, int ano_publicacao, int numero_paginas, String genero) {
        setTitulo(titulo);
        setAutor(autor);
        setAno_publicacao(ano_publicacao);
        setNumero_paginas(numero_paginas);
        setGenero(genero);

        //inicialização das variaveis de controle
        this.paginaAtual = 1;
        this.pagMarcada = 1;
        this.aberto = false;
    }

    //gets e sets
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno_publicacao() {
        return this.ano_publicacao;
    }

    public void setAno_publicacao(int ano_publicacao) {
        if (ano_publicacao > 2025) {
            throw new IllegalArgumentException("Erro: Ano de publicacao superior ao ano atual");
        }
        this.ano_publicacao = ano_publicacao;
    }

    public int getNumero_paginas() {
        return this.numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        if (numero_paginas <= 0) {
            throw new IllegalArgumentException("Erro: Numero de paginas deve ser um numero positivo nao nulo");
        }
        this.numero_paginas = numero_paginas;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPagina_atual() {
        return this.paginaAtual;
    }

    public void setPagina_atual(int pagina_atual) {
        this.paginaAtual = pagina_atual;
    }

    public int getPagMarcada() {
        return this.pagMarcada;
    }

    public void setPagina_marcada() {
        this.pagMarcada = this.paginaAtual;
    }

    public boolean isAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        if (aberto == isAberto()) {
            throw new IllegalArgumentException("Erro: Nao é possivel abrir um livro aberto ou fechar um livro fechado.");
        }
        this.aberto = aberto;
    }
    //fim dos gets e sets

    //metodos dos exercicios
    public String abrir() {
        setAberto(true);
        return ("Livro Aberto");
    }

    public String fechar() {
        setAberto(false);
        return ("Livro Fechado");
    }

    public void marcar_pagina(){
        if (!isAberto()) {
            throw new IllegalArgumentException("Erro: O livro deve estar aberto para marcar a pagina");
        }
        else{
            setPagina_marcada();
        }
    }

    public void avancar_pagina(){
        if (!isAberto()) {
            throw new IllegalArgumentException("Erro: O livro deve estar aberto para avancar a pagina");
        }
        if (getPagina_atual() == getNumero_paginas()) {
            throw new IllegalArgumentException("Erro: Numero de paginas totais alcancado");
        }
        else{
            setPagina_atual(getPagina_atual() + 1);
        }
    }

    public void retroceder_pagina(){
        if(!isAberto()){
            throw new IllegalArgumentException("Erro: O livro deve estar aberto para voltar a pagina");
        }
        if(getPagina_atual() == 1){
            throw new IllegalArgumentException("Erro: Inicio do livro alcancado");
        }
        else {
            setPagina_atual(getPagina_atual() - 1);
        }
    }
}

