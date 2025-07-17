package ExercicioRelampagoSurpresa4;

import java.util.ArrayList;

public class Curso {
    ArrayList<Turma> turmas;
    ArrayList<Aluno> alunos;
    //TODO: metodos do ArrayList de alunos

    public ArrayList<Turma> getTurmas() {
        return this.turmas;
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

    //public String listarTurmas() não sei se precisa disso

    public int getNumeroTurmas(){
        return this.turmas.size();
    }

    //Questão 3: Quais os nomes dos professores que lecionam em alguma turma de um curso?
    public String listarProfessoresTurmas(){
        StringBuilder nomeProfessores = new StringBuilder();
        for(Turma turma: this.turmas){
            //TODO: arrumar isso daqui pq ele não curtiu no trabalho
            nomeProfessores.append(turma.getNomeProfessor()).append(", ");
        }
        return nomeProfessores.toString();
    }

    //TODO: fazer tbm buscando uma turma especifica pq vai q n é isso

    //Questão 8: Verificar se um aluno está em um curso
    public boolean verificarAlunoCurso(Aluno aluno){
        return this.alunos.contains(aluno);
    }

    //Questão 4: Nomes dos alunos que estão registrados em um curso
    public String listarAlunosCurso(){
        StringBuilder nomeAlunos = new StringBuilder();
        for(Aluno aluno: this.alunos){
            //TODO: arrumar isso daqui pq ele não curtiu no trabalho
            nomeAlunos.append(aluno.getNome()).append(", ");
        }
        return nomeAlunos.toString();
    }

}
