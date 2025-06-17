package ExercicioRelampagoSurpresaHP;

public class Pais{
    private String nome;

    public Pais(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: Nome não pode ser vazio");
        }
        this.nome = nome;
    }
}