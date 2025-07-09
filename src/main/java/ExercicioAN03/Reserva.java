package ExercicioAN03;

public abstract class Reserva {
    private int dias;

    public Reserva(int dias) {
        setDias(dias);
    }

    public void setDias(int dias){
        if(dias <= 0){
            throw new IllegalArgumentException("Erro");
        }
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public abstract float calcularTotal();
    public abstract String getDescricao();

}
