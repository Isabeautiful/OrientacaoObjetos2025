package ExercicioRelampagoSurpresa934;

public class Empresa {
  private String nome;
  private Funcionario diretor;
  private Grupo grupo;

  public Empresa(String nome) {
    setNome(nome);
    this.diretor = null;
    this.grupo = null;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    if (nome.trim().isEmpty()) {
      throw new IllegalArgumentException("Erro: Nome não pode ser vazio");
    }
    this.nome = nome;
  }

  public Funcionario getDiretor() {
    return this.diretor;
  }

  public void setDiretor(Funcionario diretor) {
    this.diretor = diretor;
  }

  public String getNomeDiretor() {
    if (this.diretor == null) {
      return "Empresa sem diretor definido";
    }
    return this.diretor.getNome();
  }

  public Grupo getGrupo() {
    return this.grupo;
  }

  public void setGrupo(Grupo grupo) {
    this.grupo = grupo;
  }

  public String getNomeGrupo() {
    if (this.grupo == null) {
      return "Empresa sem grupo definido";
    }
    return this.grupo.getNome();
  }

}