package ExercicioRelampagoSurpresaPI;

public class Pessoa {
    private String nome;
    private Escolaridade escolaridade;

    public Pessoa (String nome){
        setNome(nome);
        this.escolaridade = null;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: argumento nome nao pode ser vazio");
        }
        this.nome = nome;
    }

    public Escolaridade getEscolaridade() {
        return this.escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }
}
