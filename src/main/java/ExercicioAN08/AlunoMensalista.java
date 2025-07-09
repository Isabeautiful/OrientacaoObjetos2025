package ExercicioAN08;

public class AlunoMensalista extends Aluno {
    private float valorMensalidade;
    private int numParcelas;

    public AlunoMensalista(String matricula, String nome, String endereco, float valorMensalidade, int numParcelas) {
        super(matricula, nome, endereco);
        setValorMensalidade(valorMensalidade);
        setNumParcelas(numParcelas);
    }

    public float getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(float valorMensalidade) {
        if (valorMensalidade <= 0) {
            throw new IllegalArgumentException("Erro: Valor da mensalidade deve ser maior que zero.");
        }
        this.valorMensalidade = valorMensalidade;
    }

    public int getNumParcelas() {
        return numParcelas;
    }

    public void setNumParcelas(int numParcelas) {
        if (numParcelas <= 0) {
            throw new IllegalArgumentException("Erro: Número de parcelas deve ser maior que zero.");
        }
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
