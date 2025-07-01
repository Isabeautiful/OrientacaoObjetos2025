package ExercicioAssociacaoNProfessor;

public class FuncionarioDiarista extends Funcionario {

    private int numDias;
    private float valorDia;

    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public float getValorDia() {
        return valorDia;
    }

    public void setValorDia(float valorDia) {
        this.valorDia = valorDia;
    }

    public float calcularSalario() {
        return this.numDias * this.valorDia;
    }
}