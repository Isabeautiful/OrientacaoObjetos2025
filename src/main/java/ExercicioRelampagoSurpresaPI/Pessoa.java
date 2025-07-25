package ExercicioRelampagoSurpresaPI;

public class Pessoa {
    private String nome;
    private Escolaridade escolaridade;
    private Cidade naturalidade;

    public Pessoa (String nome){
        setNome(nome);
        this.escolaridade = null;
        setCidade(null);
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
        return this.naturalidade;
    }

    public void setCidade(Cidade cidade) {
        this.naturalidade = cidade;
    }

    public String getNomeGraduacao(){
        if(this.escolaridade == null){
            return "Pessoa sem escolaridade";
        }
        return getEscolaridade().getGraduacao();
    }

    public String getNaturalidade(){
        if(getCidade() == null){
            return "Pessoa sem naturalidade definida";
        }
        return getCidade().getNome() + " " + getCidade().getEstado().getNome();
    }

    public String getNomeCidade(){
        if(getCidade() == null){
            return "Pessoa sem naturalidade definida";
        }
        return getCidade().getNome();
    }

    public String getNomeEstado(){
        if(getCidade() == null){
            return "Pessoa sem naturalidade definida";
        }
        return getCidade().getNomeEstado();
    }

    public String getNomeEscolaridade(){
        if(this.escolaridade == null){
            return "Pessoa sem escolaridade";
        }
        return getEscolaridade().getGraduacao();
    }
}
