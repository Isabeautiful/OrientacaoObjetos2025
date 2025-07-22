package ExercicioRelampagoSurpresa4;

import java.util.ArrayList;

public class Curso {
    ArrayList<Turma> turmas;
    ArrayList<Aluno> alunos;

    public Curso(){
        this.alunos = new ArrayList<Aluno>();
        this.turmas = new ArrayList<Turma>();
    }

    public ArrayList<Turma> getTurmas() {
        return this.turmas;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno){
        if(aluno == null){
            throw new IllegalArgumentException("Erro: aluno não pode ser nulo");
        }
        this.alunos.add(aluno);
    }

    public void adicionarTurma(Turma turma){
        if(turma == null){
            throw new IllegalArgumentException("Erro: turma não pode ser nula");
        }
        this.turmas.add(turma);
    }

    //Questão 11: Excluir uma turma de um curso
    public void removerTurma(Turma turma){
        if(turma == null){
            throw new IllegalArgumentException("Erro: Turma não pode ser nula");
        }
        if(!this.turmas.contains(turma)){
            throw new IllegalArgumentException("Erro: Turma não encontrada na lista");
        }
        this.turmas.remove(turma);
    }

    //Questão 12: Excluir aluno de um curso
    public void removerAluno(Aluno aluno){
        if(aluno == null){
            throw new IllegalArgumentException("Erro: aluno não pode ser nulo");
        }
        if(!this.alunos.contains(aluno)){
            throw new IllegalArgumentException("Erro: aluno não encontrado na lista");
        }
        this.alunos.remove(aluno);
    }

    public int getNumeroTurmas(){
        return this.turmas.size();
    }

    public int getNumeroAlunos(){
        return this.alunos.size();
    }

    //Questão 3: Quais os nomes dos professores que lecionam em alguma turma de um curso?
    public String listarProfessoresTurmas(){
        StringBuilder nomeProfessores = new StringBuilder();
        for(Turma turma: this.turmas){
            nomeProfessores.append(turma.getNomeProfessor()).append(", ");
        }

        // Remove a última vírgula e espaço, se houver alunos
        if (!nomeProfessores.isEmpty()) {
            nomeProfessores.setLength(nomeProfessores.length() - 2);
        }
        return nomeProfessores.toString();
    }

    //Questão 6: Quais as disciplinas que estão em alguma turma de um curso?
    public String listarDisciplinasCurso() {
        StringBuilder nomesDisciplinas = new StringBuilder();

        for(Turma turma: this.turmas){
            nomesDisciplinas.append(turma.getNomeDisciplina()).append(", ");
        }

        if (!nomesDisciplinas.isEmpty()) {
            nomesDisciplinas.setLength(nomesDisciplinas.length() - 2); // Remove última vírgula
        }

        return nomesDisciplinas.toString();
    }

    //Questão 4: Quais os nomes dos alunos que estão em alguma turma de um curso?
    public String listarAlunosTurmaCurso() {
        StringBuilder nomeAlunos = new StringBuilder();

        for (Turma turma : this.turmas) {
            for (Aluno aluno : turma.getAlunos()) {
                nomeAlunos.append(aluno.getNome()).append(", ");
            }
        }

        // Remove a última vírgula e espaço, se houver alunos
        if (!nomeAlunos.isEmpty()) {
            nomeAlunos.setLength(nomeAlunos.length() - 2);
        }

        return nomeAlunos.toString();
    }


    //Questão 8: Verificar se um aluno está em um curso
    public boolean verificarAlunoCurso(Aluno aluno){
        return this.alunos.contains(aluno);
    }

    //Questão 9: Verificar se uma turma está em um curso
    public boolean verificarTurmaCurso(Turma turma){
        return this.turmas.contains(turma);
    }

    //Questão 5: Nomes dos alunos que estão registrados em um curso
    public String listarAlunosCurso(){
        StringBuilder nomeAlunos = new StringBuilder();
        for(Aluno aluno: this.alunos){
            nomeAlunos.append(aluno.getNome()).append(", ");
        }

        // Remove a última vírgula e espaço, se houver alunos
        if (!nomeAlunos.isEmpty()) {
            nomeAlunos.setLength(nomeAlunos.length() - 2);
        }

        return nomeAlunos.toString();
    }

}
