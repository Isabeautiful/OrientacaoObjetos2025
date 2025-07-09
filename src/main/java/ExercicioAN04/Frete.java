package ExercicioAN04;

public abstract class Frete {
    private int numero;
    private float valorBase;

    public Frete(int numero, float valorBase){
        setNumero(numero);
        setValorBase(valorBase);
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        if(numero <= 0){
            throw new IllegalArgumentException("Erro: número do frete inválido");
        }
        this.numero = numero;
    }

    public float getValorBase(){
        return valorBase;
    }

    public void setValorBase(float valorBase){
        if(valorBase <= 0){
            throw new IllegalArgumentException("Erro: valor do frete deve ser maior que zero");
        }
        this.valorBase = valorBase;
    }

    public abstract float getValorFrete();
    public abstract String getDescricao();
}
