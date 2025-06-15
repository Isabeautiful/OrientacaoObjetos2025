package ExercicioRelampagoSurpresa934;

public class Departamento {
  private String nome;
  private Funcionario chefia;
  private Empresa empresa; //Obrigatorio?

  public Departamento(String nome) {
    setNome(nome);
    this.chefia = null;
    this.empresa = null;
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

  public Funcionario getChefia() {
    return this.chefia;
  }

  public void setChefia(Funcionario chefia) {
    this.chefia = chefia;
  }

  public String getNomeChefia() {
    if (this.chefia == null) {
      return "Departamento Sem chefia";
    }
    return this.chefia.getNome();
  }

  public Empresa getEmpresa() {
    return this.empresa;
  }

  public void setEmpresa(Empresa empresa) {
    this.empresa = empresa;
  }

  public String getNomeEmpresa() {
    if (this.empresa == null) {
      return "Departamento sem empresa definida";
    }
    return this.empresa.getNome();
  }

  public String getNomeGrupo() {
    if (this.empresa == null) {
      return "Departamento empresa definida";
    }
    return this.empresa.getNomeGrupo();
  }

  public String getNomeSede(){
    if (this.empresa == null) {
      return "Departamento sem empresa definida";
    }
    return this.empresa.getNomeSede();
  }

  public String getNomeDiretor() {
    if (this.empresa == null) {
      return "Departamento sem empresa definida";
    }
    return this.empresa.getNomeDiretor();
  }

  public String getNomePresidente() {
    if (this.empresa == null) {
      return "Departamento sem empresa definida";
    }
    return this.empresa.getNomePresidente();
  }

  //numero 4
  public String getNomeEscolaridadeChefia() {
    if (this.chefia == null) {
      return "Departamento sem chefia";
    }
    return this.chefia.getNomeEscolaridade();
  }
}