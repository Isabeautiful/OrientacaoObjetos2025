package ExercicioRelampagoSurpresa934;

public Funcionario {
  private Escolaridade escolaridade;
  private String nome;
  private Filial coordenacao;

  public Funcionario(String nome) {
    setNome(nome);
    this.escolaridade = null;
  }

  public Escolaridade getEscolaridade() {
    return this.escolaridade;
  }

  public void setEscolaridade(Escolaridade escolaridade) {
    this.escolaridade = escolaridade;
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

  public String getNomeEscolaridade() {
    if (this.escolaridade == null) {
      return "Erro: Funcionario sem escolaridade definida";
    }
    return this.escolaridade.getNome();
  }

  public Filial getFilial() {
    return this.coordenacao;
  }

  public void setFilial(Filial filial) {
    this.coordenacao = filial;
  }

  public String getNomeFilial() {
    if (this.coordenacao == null) {
      return "Erro: Funcionario sem filial definida";
    }
    return this.coordenacao.getNome();
  }

  public String getNomeCidade() {
    if (this.coordenacao == null) {
      return "Erro: Funcionario sem filial definida";
    }
    return this.coordenacao.getNomeCidade();
  }

  public String getNomeEstado() {
    if (this.coordenacao == null) {
      return "Erro: Funcionario sem filial definida";
    }
    return this.coordenacao.getNomeEstado();
  }

  public String getNomePais() {
    if (this.coordenacao == null) {
      return "Erro: Funcionario sem filial definida";
    }
    return this.coordenacao.getNomePais();
  }
  
}