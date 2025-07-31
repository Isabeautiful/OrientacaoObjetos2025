package AExercicioRS4FeitoPeloProfessor;

import java.util.ArrayList;

public class Turma {

    private ArrayList<Aluno> alunos;
    private Professor professor;

    public Turma() {
        this.alunos = new ArrayList<Aluno>();
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void matricular(Aluno aluno) {
        if (!this.alunos.contains(aluno)) {
            this.alunos.add(aluno);
        }
    }

    public int getQuantidadeAlunos() {
        return this.alunos.size();
    }

    public ArrayList<String> getNomesAlunos() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Aluno aluno : this.alunos) {
            resultado.add(aluno.getNome());
        }
        return resultado;
    }

    public String getNomeProfessor() {
        if (this.professor == null) {
            return "Turma sem professor";
        }
        else {
            return this.professor.getNome();
        }
    }

}