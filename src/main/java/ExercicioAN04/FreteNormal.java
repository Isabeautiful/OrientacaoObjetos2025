package ExercicioAN04;

public class FreteNormal extends Frete {

    public FreteNormal(int numero, float valorBase){
        super(numero, valorBase);
    }

    @Override
    public float getValorFrete(){
        return getValorBase();
    }

    @Override
    public String getDescricao(){
        return "Frete Normal - Nº " + getNumero() + " - Valor: R$ " + getValorFrete();
    }
}
