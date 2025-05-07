package Exercicios_Lista_01;

public class Funcionario {
    private float salarioBruto; //É o "salario atual" do Exercicio 1
    private float salarioLiquido; //valor a ser calculado
    private int numHE; //Exercicio 2: numero de horas extras feitas também é atributo do funcionario

    //construtor
    public Funcionario(){
        this.salarioBruto = 1;
        this.numHE = 0;
        //salario liquido será calculado, portanto não é iniciado no construtor
    }

    //get e set
    public float getSalarioBruto() {
        return this.salarioBruto;
    }

    public float getSalarioLiquido(){
        return this.salarioLiquido;
    }

    public void setSalarioBruto(float salarioBruto) {
        if(salarioBruto <= 0){
            throw new IllegalArgumentException("Erro: Salario deve ser maior que zero");
        }
        this.salarioBruto = salarioBruto;
    }

    public int getNumeroHorasExtras() {
        return this.numHE;
    }

    //Funções Exercicio 1:
    public void setNumeroHorasExtras(int numHE) {
        if(numHE < 0){
            throw new IllegalArgumentException("Erro: Numero de Horas Extras não pode ser negativo");
        }
        this.numHE = numHE;
    }

    //calculo do valor do aumento salarial
    public float calcularAumentoSalarial(float percentualAumento){
        if(percentualAumento <= 0){
            throw new IllegalArgumentException("Erro: Percentual de Aumento deve ser maior que zero");
        }
        return (this.salarioBruto * percentualAumento) - this.salarioBruto;
    }

    //calculo do novo salario
    public void calcularNovoSalario(float percentualAumento){
        if (percentualAumento <= 0){
            throw new IllegalArgumentException("Erro: Percentual de Aumento deve ser maior que zero");
        }
        this.salarioBruto += (percentualAumento/100) * this.salarioBruto;
    }

    //Exercicio 2: calculo do salario liquido
    public void calcularSalarioLiquido(float valorHE){
        if(valorHE <= 0){
            throw new IllegalArgumentException("Erro: Valor de Horas Extras deve ser maior que zero");
        }
        this.salarioLiquido = (this.salarioBruto + valorHE * this.numHE);
        this.salarioLiquido -= 8 * this.salarioLiquido/100;
    }
}
