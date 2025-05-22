package ListaExerciciosHerancaPolimorfismo.Ex5;

public class ProdutoEletronico extends Produto {
    private int quantidadeComprada;

    public ProdutoEletronico(String nome, float precoUnitario, int quantidadeEstoque, int quantidadeComprada){
        super(nome, precoUnitario, quantidadeEstoque);
        setQuantidadeComprada(quantidadeComprada);
        recalcularEstoque();
    }

    public int getQuantidadeComprada() {
        return this.quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public void recalcularEstoque(){
        //TODO: tratamento de erro quantidade comprada superior ao estoque
        //TODO: Não deve haver venda caso não exista estoque suficiente. Deve baixar o estoque do produto após a venda.
        setQuantidadeEstoque(getQuantidadeEstoque() - getQuantidadeComprada());
    }
    public float calcularPreco(){
        return getPrecoUnitario() * getQuantidadeComprada();
    }
}
