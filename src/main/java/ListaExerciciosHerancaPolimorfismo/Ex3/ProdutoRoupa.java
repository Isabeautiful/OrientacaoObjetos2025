package ListaExerciciosHerancaPolimorfismo.Ex3;

public class ProdutoRoupa extends Produto {
    public ProdutoRoupa(String nome, double precoBase){
        super(nome, precoBase);
    }

    public float getDescontoPorcentagem() {
        return 0.3f;
    }

    //TODO: casos de teste de Roupa, Livro e Eletronico
}
