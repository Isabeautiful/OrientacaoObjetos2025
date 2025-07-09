package ExercicioAN03;

public class ReservaSingle extends Reserva {

    public ReservaSingle(int dias){
        super(dias);
    }

    @Override
    public float calcularTotal() {
        return getDias() * 50.0f;
    }

    @Override
    public String getDescricao() {
        return "Quarto Single - " + getDias() + "dias - Total: R$ " + calcularTotal();
    }
}
