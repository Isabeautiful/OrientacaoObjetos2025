package ExercicioRelampagoSurpresaPI;

public class Curso {
    String nome;
    TipoEnsino tipoEnsino;
    Professor coordenador;

    public Curso(String nome, TipoEnsino tipoEnsino){
        setNome(nome);
        setTipoEnsino(tipoEnsino);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        //TODO: casos de teste
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: argumento nome nao pode ser vazio");
        }
        this.nome = nome;
    }

    public TipoEnsino getTipoEnsino() {
        return this.tipoEnsino;
    }

    public void setTipoEnsino(TipoEnsino tipoEnsino) {
        //TODO: casos de teste
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
        //TODO: casos de teste
        if(this.coordenador == null){
            return "Curso nao possui coordenador";
        }
        return getCoordenador().getNome();
    }

    public String getNomeTipoEnsino(){
        return getTipoEnsino().getNome();
    }
}
