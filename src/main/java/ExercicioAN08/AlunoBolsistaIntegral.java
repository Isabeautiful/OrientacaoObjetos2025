package ExercicioAN08;

public class AlunoBolsistaIntegral extends Aluno {
    private int numParcelasIsentas;

    public AlunoBolsistaIntegral(String matricula, String nome, String endereco, Curso curso, int numParcelasIsentas) {
        super(matricula, nome, endereco, curso);
        this.numParcelasIsentas = numParcelasIsentas;
    }

    @Override
    public float calcularMensalidade() {
        return 0;
    }

    @Override
    public int getNumeroParcelas() {
        return numParcelasIsentas;
    }
}
