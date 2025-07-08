package ExercicioAN08;

public class AlunoBolsistaParcial extends AlunoMensalista {
    private float percentualDesconto;

    public AlunoBolsistaParcial(String matricula, String nome, String endereco, Curso curso, float valorMensalidade, int numParcelas, float percentualDesconto) {
        super(matricula, nome, endereco, curso, valorMensalidade, numParcelas);
        if (percentualDesconto > 50) {
            throw new IllegalArgumentException("Desconto não pode ser superior a 50%");
        }
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public float calcularMensalidade() {
        return super.calcularMensalidade() * (1 - percentualDesconto / 100);
    }
}
