package ListaExerciciosHerancaPolimorfismo;

public abstract class Funcionario {
    private double salarioMensal; //valor fixo!!

    public Funcionario(double salarioMensal){
        setSalarioMensal(salarioMensal);
    }

    public double getSalarioMensal() {
        return this.salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if(salarioMensal <= 0 ){
            throw new IllegalArgumentException("Erro: Salario Mensal (double) deve ser positivo");
        }
        this.salarioMensal = salarioMensal;
    }

    public abstract double calcularPagamento();

}
