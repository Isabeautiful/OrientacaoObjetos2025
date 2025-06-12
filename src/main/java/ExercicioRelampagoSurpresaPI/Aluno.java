package ExercicioRelampagoSurpresaPI;

public class Aluno extends Pessoa {
    Curso curso;

    public Aluno(String nome) {
        super(nome);
        this.curso = null;
        setCidade(null);
    }

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getNomeCurso(){
        if(this.curso == null){
            return "Aluno nao matriculado";
        }
        return getCurso().getNome();
    }

    public String getNaturalidade() {
        if (getCidade() == null) {
            return "Aluno sem naturalidade definida";
        }
        return getCidade().getNome();
    }

    public String getNomeEstadoNaturalidade() {
        if (getCidade() == null) {
            return "Aluno sem naturalidade definida";
        }
        return getCidade().getNomeEstado();
    }

    public String getNomeEstadoEstudo(){
        if (getCurso() == null) {
            return "Aluno sem curso definido";
        }
        return getCurso().getNomeEstadoEscola();
    }

    public String getNomeCoordenador() {
        if (getCurso() == null) {
            return "Aluno sem curso definido";
        }
        return getCurso().getNomeCoordenador();
    }
}
