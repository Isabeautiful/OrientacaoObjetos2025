package ExercicioRelampagoSurpresaPI;

public class Aluno extends Pessoa {
    Curso curso;

    public Aluno(String nome, Cidade cidade) {
        super(nome, cidade);
        this.curso = null;
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

    //do aluno, pegamos naturalidade
}
