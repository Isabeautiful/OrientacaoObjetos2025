package ListaExerciciosHerancaPolimorfismo;

public class Gerente extends Funcionario{
    private int bonus; //valor fixo

    public Gerente(double salarioMensal, int bonus){
        super(salarioMensal);
        setSalarioMensal(salarioMensal);
        setBonus(bonus);
    }

    public int getBonus() {
        return this.bonus;
    }

    public void setBonus(int bonus) {
        if(bonus <= 0){
            throw new IllegalArgumentException("Erro: Argumento bonus (double) deve ser positivo");
        }
        this.bonus = bonus;
    }

    @Override
    public double calcularPagamento() {
        return (getSalarioMensal() + ( getSalarioMensal() * (double) this.bonus /100));
    }
}
