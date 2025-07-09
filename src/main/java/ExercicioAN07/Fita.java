package ExercicioAN07;

public abstract class Fita {
    private int numDias;

    public Fita(int numDias) {
        setNumDias(numDias);
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        if (numDias <= 0) {
            throw new IllegalArgumentException("Erro: Número de dias deve ser maior que zero.");
        }
        this.numDias = numDias;
    }

    public abstract float calcularValor();
}
