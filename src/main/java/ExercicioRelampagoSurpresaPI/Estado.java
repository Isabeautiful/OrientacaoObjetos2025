package ExercicioRelampagoSurpresaPI;

public class Estado {
    String nome;

    public Estado(String nome){
        setNome(nome);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        //TODO: casos de teste
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: argumento nome nao pode ser uma string vazia");
        }
        this.nome = nome;
    }


}
