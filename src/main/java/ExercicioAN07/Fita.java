package ExercicioAN07;

public abstract class Fita {
    protected int numDias;

    public Fita(int numDias) {
        this.numDias = numDias;
    }

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public abstract float calcularValor();
}
