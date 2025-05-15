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
        if(nome.trim().equals("")){
            throw new IllegalArgumentException("Erro: Nome (string) invalida");
        }
        this.nome = nome;
    }

}
