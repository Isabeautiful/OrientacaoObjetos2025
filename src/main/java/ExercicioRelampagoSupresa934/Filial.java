package ExercicioRelampagoSurpresa934;

public Filial{
  private String nome;
  private Cidade cidade;
  private Empresa empresa;

  public Filial(String nome, Cidade cidade) {
    setNome(nome);
    setCidade(cidade);
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

  public Cidade getCidade() {
    return this.cidade;
  }

  public void setCidade(Cidade cidade) {
    if (cidade == null) {
      throw new IllegalArgumentException("Erro: Cidade não pode ser nula");
    }
    this.cidade = cidade;
  }

  public String getNomeCidade() {
    return this.cidade.getNome();
  }

  public String getNomeEstado() {
    return this.cidade.getNomeEstado();
  }

  public String getNomePais() {
    return this.cidade.getNomePais();
  }

  public Empresa getEmpresa() {
    return this.empresa;
  }

  public void setEmpresa(Empresa empresa) {
    this.empresa = empresa;
  }

  public String getNomeEmpresa() {
    if (this.empresa == null) {
      return "Filial sem empresa definida";
    }
    return this.empresa.getNome();
  }
}