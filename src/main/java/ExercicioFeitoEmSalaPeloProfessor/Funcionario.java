package ExercicioFeitoEmSalaPeloProfessor;

public class Funcionario {

    private String nome;
    private Departamento lotacao;

    public Funcionario(Departamento lotacao) {
        this.setLotacao(lotacao);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getLotacao() {
        return this.lotacao;
    }

    public void setLotacao(Departamento lotacao) {
        if (lotacao == null) {
            throw new IllegalArgumentException("Lotacao invalida");
        }
        this.lotacao = lotacao;
    }

    public String getNomeDepartamentoLotacao() {
        return this.lotacao.getNome();
    }
}