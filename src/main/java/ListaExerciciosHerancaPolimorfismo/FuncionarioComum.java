package ListaExerciciosHerancaPolimorfismo;

public class FuncionarioComum extends Funcionario{

    public FuncionarioComum(double salarioMensal){
        super(salarioMensal);
    }

    @Override
    public double calcularPagamento() {
        return getSalarioMensal();
    }
}
