package ExercicioAN07;

public class FitaEspecial extends Fita {
    private float valorDia;

    public FitaEspecial(int numDias, float valorDia) {
        super(numDias);
        setValorDia(valorDia);
    }

    public float getValorDia() {
        return valorDia;
    }

    public void setValorDia(float valorDia) {
        if (valorDia <= 0) {
            throw new IllegalArgumentException("Erro: Valor por dia deve ser maior que zero.");
        }
        this.valorDia = valorDia;
    }

    @Override
    public float calcularValor() {
        return getValorDia() * getNumDias();
    }
}
