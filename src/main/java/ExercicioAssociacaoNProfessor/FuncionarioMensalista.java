package ExercicioAssociacaoNProfessor;

public class FuncionarioMensalista extends Funcionario {

    private float salarioMensal;

    public float getSalarioMensal() {
        return this.salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public float calcularSalario() {
        return this.salarioMensal;
    }
}