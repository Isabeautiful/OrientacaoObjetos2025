package Avaliacao2;

public class Departamento {
    private String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: string nome invalida");
        }
        this.nome = nome;
    }
}
