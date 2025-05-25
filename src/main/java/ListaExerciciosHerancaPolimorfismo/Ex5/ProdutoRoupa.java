package ListaExerciciosHerancaPolimorfismo.Ex5;

public class ProdutoRoupa extends Produto {
    private int quantidadeComprada;
    private int desconto;

    public ProdutoRoupa(String nome, float precoUnitario, int quantidadeEstoque, int quantidadeComprada){
        super(nome, precoUnitario, quantidadeEstoque);
        setQuantidadeComprada(quantidadeComprada);
        this.Comprar();
    }

    public int getQuantidadeComprada() {
        return this.quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        if(quantidadeComprada <= 0){
            throw new IllegalArgumentException("Erro: Argumento QuantidadeComprada deve ser positivo");
        }
        this.quantidadeComprada = quantidadeComprada;
    }

    public int getDesconto() {
        return this.desconto;
    }

    public void setDesconto(int desconto) {
        if (desconto < 0 || desconto > 100) {
            throw new IllegalArgumentException("Erro: Percentual de desconto deve estar entre 0 e 100");
        }
        this.desconto = desconto;
    }

    public float calcularPreco(){
        float precoTotal = getPrecoUnitario() * quantidadeComprada;
        return precoTotal * ((float) desconto /100);
    }

}
