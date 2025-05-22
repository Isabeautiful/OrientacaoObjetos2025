package ListaExerciciosHerancaPolimorfismo.Ex3;

public class ProdutoLivro extends Produto {
    public ProdutoLivro(String nome, double precoBase){
        super(nome, precoBase);
    }

    @Override
    public float getDescontoPorcentagem() {
        return 0.05f;
    }
}
