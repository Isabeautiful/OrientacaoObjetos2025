package ExercicioAN06;

public class VagaSemanal extends Vaga {
    private int numeroSemanas;

    public VagaSemanal(int numero, String placa, int numeroSemanas){
        super(numero, placa);
        setNumeroSemanas(numeroSemanas);
    }

    public int getNumeroSemanas() {
        return numeroSemanas;
    }

    public void setNumeroSemanas(int numeroSemanas) {
        if(numeroSemanas <= 0){
            throw new IllegalArgumentException("Erro: número de semanas inválido");
        }
        this.numeroSemanas = numeroSemanas;
    }

    @Override
    public float getValorAluguel() {
        return 40.0f * numeroSemanas;
    }

    @Override
    public String getDescricao() {
        return "Vaga Semanal - Nº " + getNumero() + ", Placa: " + getPlacaVeiculo() +
                ", Semanas: " + numeroSemanas + " - Valor: R$ " + getValorAluguel();
    }
}
