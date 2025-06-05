package ExercicioRelampagoSurpresaPI;

public class Professor extends Pessoa {
    private Curso contratacao;

    public Professor (String nome, Escolaridade escolaridade, Cidade cidade){
        super(nome, cidade);
        setEscolaridade(escolaridade);
        this.contratacao = null;
    }

    public Curso getContratacao() {
        return this.contratacao;
    }

    public void setContratacao(Curso contratacao) {
        this.contratacao = contratacao;
    }

    public String getNomeContratacao(){
        //TODO: casos de teste
        if(this.contratacao == null){
            return "Professor nao trabalha nesse curso";
        }
        return getContratacao().getNome();
    }

    public String getNomeTipoDeEnsino(){
        //TODO: casos de teste
        if(this.contratacao == null){
            return "Professor nao trabalha com esse tipo de ensino";
        }
        return getContratacao().getTipoEnsino().getNome();
    }
}
