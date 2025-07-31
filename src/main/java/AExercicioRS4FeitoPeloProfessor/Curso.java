package AExercicioRS4FeitoPeloProfessor;

import java.util.ArrayList;

public class Curso {

    private ArrayList<Turma> turmas;

    public Curso() {
        this.turmas = new ArrayList<Turma>();
    }

    public void abrirTurma(Turma turma) {
        if (!this.turmas.contains(turma)) {
            this.turmas.add(turma);
        }
    }

    public int obterQuantidadeTurmas() {
        return this.turmas.size();
    }

    public ArrayList<String> getNomesAlunos() {
        ArrayList<String> resultado = new ArrayList<String>();
        for (Turma turma : this.turmas) {
            ArrayList<String> alunos = turma.getNomesAlunos();
            for (String aluno : alunos) {
                resultado.add(aluno);
            }
        }
        return resultado;
    }
}