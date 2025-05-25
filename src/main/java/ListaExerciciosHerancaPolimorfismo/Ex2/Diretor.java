package ListaExerciciosHerancaPolimorfismo.Ex2;

public class Diretor extends Funcionario {
    private double valorParticipacao; //depende dos lucros da empresa

    public Diretor(double salarioMensal, int participacao, double lucrosEmpresa){
        super(salarioMensal);
        setValorParticipacao(participacao, lucrosEmpresa);
    }

    public double getValorParticipacao() {
        return this.valorParticipacao;
    }

    public void setValorParticipacao(int participacao, double lucrosEmpresa) {
        if(participacao < 0 || lucrosEmpresa < 0){
            throw new IllegalArgumentException("Erro: argumentos participacao ou lucros devem ser positivos");
        }
        this.valorParticipacao = ((double) participacao /100) * lucrosEmpresa;
        //ele ganha uma porcentagem baseada na participacao sobre os lucros
    }

    @Override
    public double calcularPagamento() {
        return getSalarioMensal() + getValorParticipacao();
    }
}