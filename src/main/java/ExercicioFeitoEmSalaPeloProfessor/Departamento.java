package ExercicioFeitoEmSalaPeloProfessor;

public class Departamento {

    private String nome;
    private Funcionario chefe;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getChefe() {
        return this.chefe;
    }

    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }

    public String getNomeChefe() {
        if (this.chefe == null) {
            return "Departamento sem chefe";
        }
        else {
            return this.chefe.getNome();
        }
    }
}
