package ExercicioAN08;

public class AlunoBolsistaIntegral extends Aluno {
    private int numParcelasIsentas;

    public AlunoBolsistaIntegral(String matricula, String nome, String endereco, int numParcelasIsentas) {
        super(matricula, nome, endereco);
        setNumParcelasIsentas(numParcelasIsentas);
    }

    public int getNumParcelasIsentas() {
        return numParcelasIsentas;
    }

    public void setNumParcelasIsentas(int numParcelasIsentas) {
        if (numParcelasIsentas <= 0) {
            throw new IllegalArgumentException("Erro: Número de parcelas isentas deve ser maior que zero.");
        }
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
