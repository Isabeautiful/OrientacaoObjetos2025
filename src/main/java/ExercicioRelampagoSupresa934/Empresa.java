package ExercicioRelampagoSurpresa934;

public Empresa {
  private String nome;
  private Funcionario diretor;

  public Empresa(String nome) {
    setNome(nome);
    this.diretor = null;
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

}