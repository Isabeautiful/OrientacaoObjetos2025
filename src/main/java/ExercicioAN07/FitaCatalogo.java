package ExercicioAN07;

public class FitaCatalogo extends Fita {

    public FitaCatalogo(int numDias) {
        super(numDias);
    }

    @Override
    public float calcularValor() {
        return 5.0f * getNumDias(); // R$ 5,00 por dia
    }
}
