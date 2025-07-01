package ExercicioAssociacaoNProfessor;

public class FuncionarioHorista extends Funcionario {

    private int numHorasDia;
    private int numDias;
    private float valorHora;

    public int getNumHorasDia() {
        return this.numHorasDia;
    }

    public void setNumHorasDia(int numHorasDia) {
        this.numHorasDia = numHorasDia;
    }

    public int getNumDias() {
        return this.numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public float getValorHora() {
        return this.valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float calcularSalario() {
        return this.numDias * this.numHorasDia * this.valorHora;
    }
}