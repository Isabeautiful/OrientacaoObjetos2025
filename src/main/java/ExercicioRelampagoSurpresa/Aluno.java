package ExercicioRelampagoSurpresa;

public abstract class Aluno extends Pessoa {
    private int nota1;
    private int nota2;
    private String matricula;

    public Aluno(String nome) {
        super(nome);
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        if(nota1 < 0){
            throw new IllegalArgumentException("Erro: Nota1 invalida");
        }
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        if(nota2 < 0){
            throw new IllegalArgumentException("Erro: Nota2 invalida");
        }
        this.nota2 = nota2;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double calcularMedia(){
        return (double) (nota1 + nota2) /2;
    }

    public abstract boolean verificarAprovacao();
}
