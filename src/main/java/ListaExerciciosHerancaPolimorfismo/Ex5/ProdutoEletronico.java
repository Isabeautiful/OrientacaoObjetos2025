package ListaExerciciosHerancaPolimorfismo.Ex5;

public class ProdutoEletronico extends Produto {
    private int quantidadeComprada;

    public ProdutoEletronico(String nome, float precoUnitario, int quantidadeEstoque, int quantidadeComprada){
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

    public float calcularPreco(){
        return getPrecoUnitario() * getQuantidadeComprada();
    }
}
