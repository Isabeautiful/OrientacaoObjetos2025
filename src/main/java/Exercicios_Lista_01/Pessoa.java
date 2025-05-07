package Exercicios_Lista_01;

public class Pessoa {
    private float peso;
    private double altura;
    private String sexo;
    private double imc;

    //construtor
    public Pessoa(){
        this.peso = 1;
        this.altura = 1;
        this.imc = 0;
    }

    //gets e sets
    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        if(peso <= 0){
            throw new IllegalArgumentException("Erro: Peso deve ser maior que zero");
        }
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        if(altura <= 0){
            throw new IllegalArgumentException("Erro: Altura deve ser maior que zero");
        }
        this.altura = altura;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        if(sexo == "F" || sexo == "M"){
            this.sexo = sexo;
        }
        else{
            throw new IllegalArgumentException("Erro: Sexo deve ser F ou M");
        }
    }

    //calcula IMC da pessoa
    public double calcularIMC(){
        this.imc = this.peso / (this.altura * this.altura);
        return this.imc;
    }

    //classifica o IMC da pessoa
    public String classificarIMC(){
        String resultado = "";

        if(this.sexo == "F"){
            if(this.imc < 19.1)
                resultado = "Mulher Abaixo do peso";
            else if (this.imc >= 19.1 && this.imc < 25.8) {
                resultado = "Mulher no peso normal";
            } else if (this.imc >= 25.8 && this.imc < 27.3) {
                resultado = "Mulher Marginalmente acima do peso";
            } else if (this.imc >= 27.3 && this.imc < 32.3) {
                resultado = "Mulher Acima do Peso ideal";
            }
            else
                resultado = "Mulher Obesa";
        }
        else {
            if(this.imc < 20.7)
                resultado = "Homem Abaixo do peso";
            else if (this.imc >= 20.7 && this.imc < 26.4) {
                resultado = "Homem No peso normal";
            } else if (this.imc >= 26.4 && this.imc < 27.8) {
                resultado = "Homem Marginalmente acima do peso";
            } else if (this.imc >= 27.8 && this.imc < 31.1) {
                resultado = "Homem Acima do Peso ideal";
            }
            else
                resultado = "Homem Obeso";
        }
        return resultado;
    }
}
