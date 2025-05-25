package ListaExerciciosHerancaPolimorfismo.Ex5;

public class ProdutoEletronico extends Produto {
    private int quantidadeComprada;

    public ProdutoEletronico(String nome, float precoUnitario, int quantidadeEstoque){
        super(nome, precoUnitario, quantidadeEstoque);
        this.quantidadeComprada = 0;
    }

    public int getQuantidadeComprada() {
        return this.quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        if(quantidadeComprada < 0 || quantidadeComprada > getQuantidadeEstoque()){
            throw new IllegalArgumentException("Erro: Argumento QuantidadeComprada deve ser positivo ou menor do que a quantidade em estoque");
        }
        this.quantidadeComprada = quantidadeComprada;
    }

    public float calcularPreco(){
        return getPrecoUnitario() * getQuantidadeComprada();
    }
}
