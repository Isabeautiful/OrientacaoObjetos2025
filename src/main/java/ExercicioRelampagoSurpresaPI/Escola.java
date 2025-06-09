package ExercicioRelampagoSurpresaPI;

public class Escola {
    private String nome;
    Cidade cidade;
    Professor diretor;

    public Escola(String nome, Cidade cidade, Professor diretor){
        setNome(nome);
        setCidade(cidade);
        setDiretor(diretor);
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
        if(diretor == null){
            throw new IllegalArgumentException("Erro: diretor nao pode ser nulo");
        }
        this.diretor = diretor;
    }

    public String getNomeDiretor(){
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
}
