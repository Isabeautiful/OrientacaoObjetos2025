package ExercicioAN08;

public class AlunoBolsistaParcial extends AlunoMensalista {
    private float percentualDesconto;

    public AlunoBolsistaParcial(String matricula, String nome, String endereco, float valorMensalidade, int numParcelas, float percentualDesconto) {
        super(matricula, nome, endereco, valorMensalidade, numParcelas);
        setPercentualDesconto(percentualDesconto);
    }

    public float getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(float percentualDesconto) {
        if (percentualDesconto < 0 || percentualDesconto > 50) {
            throw new IllegalArgumentException("Erro: Desconto deve estar entre 0% e 50%.");
        }
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public float calcularMensalidade() {
        return super.calcularMensalidade() * (1 - percentualDesconto / 100);
    }
}
