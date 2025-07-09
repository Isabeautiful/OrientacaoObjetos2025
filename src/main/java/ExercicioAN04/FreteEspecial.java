package ExercicioAN04;

public class FreteEspecial extends Frete {
    private float taxaEntrega;

    public FreteEspecial(int numero, float valorBase, float taxaEntrega){
        super(numero, valorBase);
        setTaxaEntrega(taxaEntrega);
    }

    public float getTaxaEntrega(){
        return taxaEntrega;
    }

    public void setTaxaEntrega(float taxaEntrega){
        if(taxaEntrega < 0){
            throw new IllegalArgumentException("Erro: taxa de entrega inválida");
        }
        this.taxaEntrega = taxaEntrega;
    }

    @Override
    public float getValorFrete(){
        return getValorBase() + taxaEntrega;
    }

    @Override
    public String getDescricao(){
        return "Frete Especial - Nº " + getNumero() + " - Valor: R$ " + getValorFrete();
    }
}
