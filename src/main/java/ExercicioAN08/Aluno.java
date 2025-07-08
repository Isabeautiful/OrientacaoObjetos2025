package ExercicioAN08;

public abstract class Aluno {
    private String matricula;
    private String nome;
    private String endereco;
    private Curso curso;

    public Aluno(String matricula, String nome, String endereco, Curso curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public abstract float calcularMensalidade();

    public abstract int getNumeroParcelas();
}
