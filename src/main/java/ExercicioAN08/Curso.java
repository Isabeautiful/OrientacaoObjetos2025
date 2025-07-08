package ExercicioAN08;

import java.util.ArrayList;

public class Curso {
    private String codigo;
    private String descricao;
    private int cargaHoraria;
    private ArrayList<Aluno> alunos;

    public Curso(String codigo, String descricao, int cargaHoraria) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.alunos = new ArrayList<Aluno>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
}
