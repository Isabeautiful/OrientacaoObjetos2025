package ExercicioAN08;

public class AlunoMensalista extends Aluno {
    private float valorMensalidade;
    private int numParcelas;

    public AlunoMensalista(String matricula, String nome, String endereco, Curso curso, float valorMensalidade, int numParcelas) {
        super(matricula, nome, endereco, curso);
        this.valorMensalidade = valorMensalidade;
        this.numParcelas = numParcelas;
    }

    @Override
    public float calcularMensalidade() {
        return valorMensalidade;
    }

    @Override
    public int getNumeroParcelas() {
        return numParcelas;
    }
}
