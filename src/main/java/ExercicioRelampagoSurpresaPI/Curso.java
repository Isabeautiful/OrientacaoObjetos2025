package ExercicioRelampagoSurpresaPI;

public class Curso {
    String nome;
    TipoEnsino tipoEnsino;
    Professor coordenador;
    Escola escola;

    public Curso(String nome, TipoEnsino tipoEnsino){
        setNome(nome);
        setTipoEnsino(tipoEnsino);
        setEscola(null);
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

    public TipoEnsino getTipoEnsino() {
        return this.tipoEnsino;
    }

    public void setTipoEnsino(TipoEnsino tipoEnsino) {
        if(tipoEnsino == null){
            throw new IllegalArgumentException("Erro: argumento tipo de ensino nao pode ser nulo");
        }
        this.tipoEnsino = tipoEnsino;
    }

    public Professor getCoordenador() {
        return this.coordenador;
    }

    public void setCoordenador(Professor coordenador) {
        this.coordenador = coordenador;
    }

    public String getNomeCoordenador(){
        if(this.coordenador == null){
            return "Curso nao possui coordenador";
        }
        return getCoordenador().getNome();
    }

    public String getNomeTipoEnsino(){
        return getTipoEnsino().getNome();
    }

    public Escola getEscola() {
        return this.escola;
    }

    public void setEscola(Escola escola) {
        this.escola = escola;
    }

    public String getNomeEscola(){
        if(this.escola == null){
            return "Curso nao vinculado a escola";
        }
        return getEscola().getNome();
    }

    public String getNomeDiretor() {
        if(this.escola == null){
            return "Curso sem escola";
        }
        return this.escola.getNomeDiretor();
    }

    public String getNomeEscolaridadeCoordenador() {
        if(this.coordenador == null){
            return "Coordenador sem escolaridade definida";
        }
        if(this.coordenador.getEscolaridade() == null){
            return "Coordenador sem escolaridade definida";
        }
        return this.coordenador.getEscolaridade().getGraduacao();
    }

    public String getNomeCidade(){
        if(this.escola == null){
            return "Curso sem escola";
        }
        return getEscola().getNomeCidade();
    }
}
