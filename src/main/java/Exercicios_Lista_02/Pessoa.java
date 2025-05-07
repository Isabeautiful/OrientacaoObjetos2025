package Exercicios_Lista_02;
//Exercicio 04
public class Pessoa {
    private String nome;
    private int idade;
    private float altura;
    private float peso;

    //construtor
    public Pessoa(String nome, int idade, float altura, float peso) {
        setNome(nome);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
    }

    //gets e sets
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade < 0){
            throw new IllegalArgumentException("Erro: Argumento idade (int) deve ser maior ou igual a zero");
        }
        this.idade = idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        if (altura <= 0){
            throw new IllegalArgumentException("Erro: Argumento altura (float) deve ser maior que zero");
        }
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        if (peso <= 0){
            throw new IllegalArgumentException("Erro: Argumento peso (float) deve ser maior que zero");
        }
        this.peso = peso;
    }

    //funções do exercicio 4
    public void envelhecer(){
        setIdade(getIdade()+1);
    }

    public void crescer(){
        if(getIdade() < 21){
            setAltura((float) (getAltura()+0.01));
        }
        else{
            throw new IllegalArgumentException("Erro: Idade deve ser menor que 21 para crescer.");
        }
    }

    public void ganharPeso(float quilos){
        if(quilos < 0){
            throw new IllegalArgumentException("Erro: Argumento quilos deve ser maior que zero.");
        }
        setPeso(getPeso()+quilos);
    }

    public void perderPeso(float quilos){
        if(quilos < 0){
            throw new IllegalArgumentException("Erro: Argumento quilos deve ser maior que zero.");
        }
        setPeso(getPeso()-quilos);
    }
}
