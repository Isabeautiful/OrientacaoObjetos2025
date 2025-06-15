package ExercicioRelampagoSurpresa934;

public class Grupo{
  private String nome;
  private Funcionario presidente;
  private Pais sede;

  public Grupo(String nome, Pais sede) {
    setNome(nome);
    setSede(sede);
    this.presidente = null;
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

  public Funcionario getPresidente() {
    return this.presidente;
  }

  public void setPresidente(Funcionario presidente) {
    this.presidente = presidente;
  }

  public String getNomePresidente() {
    if (this.presidente == null) {
      return "Grupo sem presidente definido";
    }
    return this.presidente.getNome();
  }

  public Pais getSede() {
    return this.sede;
  }

  public void setSede(Pais sede) {
    if (sede == null) {
      throw new IllegalArgumentException("Erro: Sede não pode ser nula");
    }
    this.sede = sede;
  }

  public String getNomeSede() {
    return this.sede.getNome();
  }

//numero 1
  public String getEscolaridadePresidente() {
    if (this.presidente == null) {
      return "Grupo sem presidente definido";
    }
    return this.presidente.getNomeEscolaridade();
  }

}