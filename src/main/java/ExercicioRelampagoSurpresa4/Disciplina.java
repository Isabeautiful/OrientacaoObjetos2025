package ExercicioRelampagoSurpresa4;

public class Disciplina {

    private String nome;

    public Disciplina(String nome){
        setNome(nome);
    }

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
