package ListaExerciciosHerancaPolimorfismo.Ex3;

public class ProdutoRoupa extends Produto {
    public ProdutoRoupa(String nome, float precoBase){
        super(nome, precoBase);
    }

    public float getDescontoPorcentagem() {
        return 0.2f;
    }
}
