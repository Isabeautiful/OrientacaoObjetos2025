package ExercicioAN04;

public class FreteUrgente extends FreteEspecial {
    private int numeroItens;

    public FreteUrgente(int numero, float valorBase, float taxaEntrega, int numeroItens){
        super(numero, valorBase, taxaEntrega);
        setNumeroItens(numeroItens);
    }

    public int getNumeroItens(){
        return numeroItens;
    }

    public void setNumeroItens(int numeroItens){
        if(numeroItens < 0){
            throw new IllegalArgumentException("Erro: número de itens não pode ser negativo");
        }
        this.numeroItens = numeroItens;
    }

    @Override
    public float getValorFrete(){
        return super.getValorFrete() + (10.0f * numeroItens);
    }

    @Override
    public String getDescricao(){
        return "Frete Urgente - Nº " + getNumero() + " - Itens: " + numeroItens + " - Valor: R$ " + getValorFrete();
    }
}
