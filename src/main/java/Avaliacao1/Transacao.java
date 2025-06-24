package Avaliacao1;

public class Transacao {
    private String dataTransacao;
    private int quantidade;
    private Produto produto;

    public Transacao(String dataTransacao, Produto produto, int qtd){
        setDataTransacao(dataTransacao);
        setProduto(produto);
        setQuantidade(qtd);
    }

    public String getDataTransacao() {
        return this.dataTransacao;
    }

    public void setDataTransacao(String dataTransacao) {
        if(dataTransacao.trim().isEmpty()){
            throw new IllegalArgumentException("Data Transação invalida");
        }
        this.dataTransacao = dataTransacao;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade < 0){
            throw new IllegalArgumentException("Quantidade invalida");
        }
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return this.produto;
    }

    public void setProduto(Produto produto) {
        if(produto == null){
            throw new IllegalArgumentException("Produto invalido");
        }
        this.produto = produto;
    }
}
