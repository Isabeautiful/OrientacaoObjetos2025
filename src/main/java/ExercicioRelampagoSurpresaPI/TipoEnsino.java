package ExercicioRelampagoSurpresaPI;

public class TipoEnsino {
    String nome;

    public TipoEnsino(String nome){
        setNome(nome);
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
}
