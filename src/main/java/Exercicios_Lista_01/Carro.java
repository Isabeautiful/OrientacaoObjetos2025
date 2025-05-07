package Exercicios_Lista_01;

public class Carro {
    private float quilometrosRodados;
    private float combustivelConsumido;

    //construtor
    public Carro(){
        this.quilometrosRodados = 0;
        this.combustivelConsumido = 1;
    }

    //gets e sets
    public float getQuilometrosRodados(){
        return this.quilometrosRodados;
    }

    public void setQuilometrosRodados(float quilometrosRodados){
        if(quilometrosRodados < 0){
            throw new IllegalArgumentException("Erro: Quantidade de Km rodados negativa");
        }
        this.quilometrosRodados = quilometrosRodados;
    }

    public float getCombustivelConsumido() {
        return this.combustivelConsumido;
    }

    public void setCombustivelConsumido(float combustivelConsumido) {
        if(combustivelConsumido <= 0){
            throw new IllegalArgumentException("Erro: Quantidade de Combustivel Consumido deve ser maior que Zero");
        }
        this.combustivelConsumido = combustivelConsumido;
    }

    //calcula a quantidade média de combustivel gasto pelo carro
    public float calcularConsumoMedio(){
        return quilometrosRodados / combustivelConsumido;
    }
}
