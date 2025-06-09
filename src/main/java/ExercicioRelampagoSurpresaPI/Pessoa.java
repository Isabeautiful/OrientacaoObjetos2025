package ExercicioRelampagoSurpresaPI;

public class Pessoa {
    private String nome;
    private Escolaridade escolaridade;
    private Cidade cidade;

    public Pessoa (String nome, Cidade cidade){
        setNome(nome);
        this.escolaridade = null;
        setCidade(cidade);
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

    public Cidade getCidade() {
        return this.cidade;
    }

    public void setCidade(Cidade cidade) {
        if(cidade == null){
            throw new IllegalArgumentException("Erro: argumento cidade nao pode ser nulo");
        }
        this.cidade = cidade;
    }

    public String getNomeGraduacao(){
        if(this.escolaridade == null){
            return "Pessoa sem escolaridade";
        }
        return getEscolaridade().getGraduacao();
    }

    public String getNaturalidade(){
        return getCidade().getNome() + " " + getCidade().getEstado().getNome();
    }

    public String getNomeCidade(){
        return getCidade().getNome();
    }

    public String getNomeEstado(){
        return getCidade().getEstado().getNome();
    }

    public String getNomeEscolaridade(){
        return getEscolaridade().getGraduacao();
    }
}
