package ExercicioRelampagoSurpresa4;

import java.util.ArrayList;

public class Turma {
    private Professor professor;
    private ArrayList<Aluno> alunos;
    Disciplina disciplina;

    public Turma(){
        this.alunos = new ArrayList<Aluno>();
    }

    public Disciplina getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        if(disciplina == null){
            throw new IllegalArgumentException("Erro: disciplina nao pode ser nula");
        }
        this.disciplina = disciplina;
    }

    public String getNomeDisciplina(){
        return this.disciplina.getNome();
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return this.alunos;
    }

    public void adicionarAluno(Aluno aluno){
        if(aluno == null){
            throw new IllegalArgumentException("Erro: aluno invalido");
        }
        if(this.alunos.contains(aluno)){
            throw new IllegalArgumentException("Erro: Aluno já encontrado na lista");
        }
        this.alunos.add(aluno);
    }

    //Questão 10: Excluir um aluno de uma turma
    public void removerAluno(Aluno aluno){
        if(aluno == null){
            throw new IllegalArgumentException("Erro: Aluno não pode ser nulo");
        }
        if(!this.alunos.contains(aluno)){
            throw new IllegalArgumentException("Erro: Aluno não encontrado na lista");
        }
        this.alunos.remove(aluno);
    }

    //Questão 1: Qual o nome de um professor de uma turma?
    public String getNomeProfessor(){
        if(this.professor == null){
            return "Turma sem professor";
        }
        return this.professor.getNome();
    }

    //Questão 2:Quais os nomes de todos os alunos de uma turma?
    public ArrayList<String> listarAlunos(){
        ArrayList<String> resultado = new ArrayList<String>();
        for (Aluno aluno : this.alunos) {
            resultado.add(aluno.getNome());
        }
        return resultado;
    }

    //Questão 7: verificar se um aluno está em uma turma
    public boolean verificarAlunoTurma(Aluno aluno){
        return this.alunos.contains(aluno);
    }

    public int getNumeroAlunos(){
        return this.alunos.size();
    }
}
