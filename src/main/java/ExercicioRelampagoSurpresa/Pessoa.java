package ExercicioRelampagoSurpresa;

public class Pessoa {
    private String nome;

    //construtor
    public Pessoa(String nome) {
        setNome(nome);
    }

    //gets e sets
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
