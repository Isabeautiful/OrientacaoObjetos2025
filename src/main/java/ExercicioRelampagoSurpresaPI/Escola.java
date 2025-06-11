package ExercicioRelampagoSurpresaPI;

public class Escola {
    private String nome;
    Cidade cidade;
    Professor diretor;

    public Escola(String nome, Cidade cidade){
        setNome(nome);
        setCidade(cidade);
        setDiretor(null);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: argumento nome nao pode ser vazio");
        }
        this.nome = nome;
    }

    public Cidade getCidade() {
        return this.cidade;
    }

    public void setCidade(Cidade cidade) {
        if(cidade == null){
            throw new IllegalArgumentException("Erro: argumento cidade nao pode ser nulo");
        }
        this.cidade = cidade;
    }

    public Professor getDiretor() {
        return this.diretor;
    }

    public void setDiretor(Professor diretor) {
        this.diretor = diretor;
    }

    public String getNomeDiretor(){
        if(this.diretor == null){
            return "Escola nao possui diretor";
        }
        return getDiretor().getNome();
    }

    public String getNomeCidade(){
        return getCidade().getNome();
    }

    public String getNomeEstado(){
        return getCidade().getEstado().getNome();
    }

    public String getCEP(){
        return getCidade().getNome() + " " + getCidade().getEstado().getNome();
    }

    public String getNomeEscolaridadeDiretor(){
        if(this.diretor == null){
            return "Escola nao possui diretor";
        }
        return getDiretor().getNomeGraduacao();
    }
}
