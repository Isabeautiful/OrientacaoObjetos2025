package ExercicioAN06;

public class VagaMensal extends Vaga {
    private int numeroMeses;

    public VagaMensal(int numero, String placa, int numeroMeses){
        super(numero, placa);
        setNumeroMeses(numeroMeses);
    }

    public int getNumeroMeses() {
        return numeroMeses;
    }

    public void setNumeroMeses(int numeroMeses) {
        if(numeroMeses <= 0){
            throw new IllegalArgumentException("Erro: número de meses inválido");
        }
        this.numeroMeses = numeroMeses;
    }

    @Override
    public float getValorAluguel() {
        return 150.0f * numeroMeses;
    }

    @Override
    public String getDescricao() {
        return "Vaga Mensal - Nº " + getNumero() + ", Placa: " + getPlacaVeiculo() +
                ", Meses: " + numeroMeses + " - Valor: R$ " + getValorAluguel();
    }
}
