package ExercicioAN07;

public class FitaLancamento extends Fita {
    private float valorDia;

    public FitaLancamento(int numDias, float valorDia) {
        super(numDias);
        this.valorDia = valorDia;
    }

    public float getValorDia() {
        return valorDia;
    }

    public void setValorDia(float valorDia) {
        this.valorDia = valorDia;
    }

    @Override
    public float calcularValor() {
        return valorDia * numDias;
    }
}
