package ExercicioRelampagoSurpresaPI;

public class Cidade {
    String nome;
    Estado estado;

    public Cidade(String nome, Estado estado){
        setNome(nome);
        setEstado(estado);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: argumento nome nao pode ser uma string vazia");
        }
        this.nome = nome;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        if(estado == null){
            throw new IllegalArgumentException("Erro: Argumento Estado nao pode ser nulo");
        }
        this.estado = estado;
    }

    public String getNomeEstado(){
        return getEstado().getNome();
    }
}
