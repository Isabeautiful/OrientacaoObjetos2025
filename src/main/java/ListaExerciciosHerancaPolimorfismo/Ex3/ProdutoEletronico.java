package ListaExerciciosHerancaPolimorfismo.Ex3;

public class ProdutoEletronico extends Produto {
    private int descontoPorcentagem;

    public ProdutoEletronico(String nome, double precoBase, int descontoPorcentagem){
        super(nome, precoBase);
        setDescontoPorcentagem(descontoPorcentagem);
    }

    public int getDescontoPorcentagem() {
        return this.descontoPorcentagem;
    }

    public void setDescontoPorcentagem(int descontoPorcentagem) {
        if(descontoPorcentagem < 0){
            throw new IllegalArgumentException("Erro: Argumento desconto deve ser positivo ou nulo");
        }
        this.descontoPorcentagem = descontoPorcentagem;
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() - ((double) getDescontoPorcentagem() /100 * getPrecoBase());
    }
}
