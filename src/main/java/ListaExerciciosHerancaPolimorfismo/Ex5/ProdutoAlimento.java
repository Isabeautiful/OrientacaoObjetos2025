package ListaExerciciosHerancaPolimorfismo.Ex5;

public class ProdutoAlimento extends Produto {
    private float quantidadeKG;

    public ProdutoAlimento(String nome, float precoUnitario, int quantidadeEstoque){
        super(nome, precoUnitario, quantidadeEstoque);
        this.quantidadeKG = 0;
    }

    public int getQuantidadeComprada() {
        return (int) (this.quantidadeKG * 1000);
    }

    public float getQuantidadeKG(){
        return this.quantidadeKG;
    }

    public void setQuantidadeKG(float quantidadeKG) {
        if(quantidadeKG < 0 || quantidadeKG * 1000 > getQuantidadeEstoque()) {
            throw new IllegalArgumentException("Erro: Argumento Quantidade de quilos comprados deve ser positiva" +
                    " ou menor do que a quantidade em estoque");
        }
        this.quantidadeKG = quantidadeKG;
    }

    public float calcularPreco(){
        return (getPrecoUnitario() * getQuantidadeComprada())/1000;
    }
}
