package ListaExerciciosHerancaPolimorfismo.Ex3;

public class ProdutoEletronico extends Produto {

    public ProdutoEletronico(String nome, float precoBase){
        super(nome, precoBase);
    }

    public float getDescontoPorcentagem() {
        return 0.1f;
    }
}
