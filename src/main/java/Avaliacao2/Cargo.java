package Avaliacao2;

public class Cargo {
    private float salarioBruto;

    public float getSalarioBruto() {
        return this.salarioBruto;
    }

    public void setSalarioBruto(float salarioBruto) {
        if(salarioBruto <= 0){
            throw new IllegalArgumentException("Erro: salario não pode ser negativo ou zero");
        }
        this.salarioBruto = salarioBruto;
    }
}
