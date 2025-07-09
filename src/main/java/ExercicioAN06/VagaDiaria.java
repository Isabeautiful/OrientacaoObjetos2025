package ExercicioAN06;

public class VagaDiaria extends Vaga {
    private int numeroDias;

    public VagaDiaria(int numero, String placa, int numeroDias){
        super(numero, placa);
        setNumeroDias(numeroDias);
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(int numeroDias) {
        if(numeroDias <= 0){
            throw new IllegalArgumentException("Erro: número de dias inválido");
        }
        this.numeroDias = numeroDias;
    }

    @Override
    public float getValorAluguel() {
        return 10.0f * numeroDias;
    }

    @Override
    public String getDescricao() {
        return "Vaga Diária - Nº " + getNumero() + ", Placa: " + getPlacaVeiculo() +
                ", Dias: " + numeroDias + " - Valor: R$ " + getValorAluguel();
    }
}
