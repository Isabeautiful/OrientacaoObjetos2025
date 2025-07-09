package ExercicioAN03;

public class ReservaDupla extends Reserva {
    private int refeicoes;

    public ReservaDupla(int dias, int refeicoes){
        super(dias);
        setRefeicoes(refeicoes);
    }

    public int getRefeicoes() {
        return this.refeicoes;
    }

    public void setRefeicoes(int refeicoes) {
        if(refeicoes < 0){
            throw new IllegalArgumentException("Erro");
        }
        this.refeicoes = refeicoes;
    }

    @Override
    public float calcularTotal() {
        return (getDias() * 80.0f) * (this.refeicoes * 10.0f);
    }

    @Override
    public String getDescricao() {
        return "Quarto Duplo - " + getDias() + " dias, " + getRefeicoes() + "refeições - Total: R$ " + calcularTotal();
    }
}
