package ListaExerciciosHerancaPolimorfismo.Ex5;

public class ProdutoAlimento extends Produto {
    private float quantidadeKG;

    public ProdutoAlimento(String nome, float precoUnitario, int quantidadeEstoque, float quantidadeKG){
        super(nome, precoUnitario, quantidadeEstoque);
        setQuantidadeKG(quantidadeKG);
        this.Comprar();
    }

    public int getQuantidadeComprada() {
        return (int) (this.quantidadeKG * 1000);
    }

    public void setQuantidadeKG(float quantidadeKG) {
        if(quantidadeKG <= 0) {
            throw new IllegalArgumentException("Erro: Argumento Quantidade de quilos deve ser positiva");
        }
        this.quantidadeKG = quantidadeKG;
    }

    public float calcularPreco(){
        return getPrecoUnitario() * getQuantidadeComprada();
    }
}
