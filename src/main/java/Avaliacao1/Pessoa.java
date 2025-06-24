package Avaliacao1;

public class Pessoa {
    String nome;

    public Pessoa(String nome){
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome vazio");
        }
        this.nome = nome;
    }
}
