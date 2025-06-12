package ExercicioRelampagoSurpresaPI;

public class Professor extends Pessoa {
    private Curso contratacao;

    public Professor (String nome){
        super(nome);
        setEscolaridade(null);
        this.contratacao = null;
    }

    public Curso getContratacao() {
        return this.contratacao;
    }

    public void setContratacao(Curso contratacao) {
        this.contratacao = contratacao;
    }

    public String getNomeContratacao(){
        if(this.contratacao == null){
            return "Professor nao trabalha nesse curso";
        }
        return getContratacao().getNome();
    }

    public String getNomeTipoDeEnsino(){
        if(this.contratacao == null){
            return "Professor nao trabalha nesse curso";
        }
        return getContratacao().getTipoEnsino().getNome();
    }

    public String getNomeDiretor() {
        if (this.contratacao == null) {
            return "Professor sem curso";
        }
        else {
            return this.contratacao.getNomeDiretor();
        }
    }

    public String getNomeCoordenador() {
        if (this.contratacao == null) {
            return "Professor sem curso";
        }
        else {
            return this.contratacao.getNomeCoordenador();
        }
    }

    public String getNomeTipoEnsino(){
        if(this.contratacao == null){
            return "Professor sem curso";
        }
        return this.contratacao.getNomeTipoEnsino();
    }

    //TODO: cidade nascimento professor
}
