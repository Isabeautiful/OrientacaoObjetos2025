package Exercicios_Lista_02;
//exercicio 05
public class Produto {
    private String nome;
    private double preco;
    private int quantidade_estoque;
    private String categoria;

    //construtor
    public Produto(String nome, double preco, int quantidade_estoque, String categoria){
        setNome(nome);
        setPreco(preco);
        setCategoria(categoria);
        setQuantidade_estoque(quantidade_estoque);
    }

    //gets e sets
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        if(preco <= 0){
            throw new IllegalArgumentException("Erro: Argumento Preço (double) não pode ser negativo ou nulo");
        }
        this.preco = preco;
    }

    public int getQuantidade_estoque() {
        return this.quantidade_estoque;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        if(quantidade_estoque < 0){
            throw new IllegalArgumentException("Erro: Argumento quantidade_estoque (int) não pode ser negativo");
        }
        this.quantidade_estoque = quantidade_estoque;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //funções do exercicio 05


}
