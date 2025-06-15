package ExercicioRelampagoSurpresa934;

public class Funcionario {
  private Escolaridade escolaridade;
  private String nome;
  private Filial coordenacao;
  private Departamento alocacao;

  public Funcionario(String nome) {
    setNome(nome);
    this.escolaridade = null;
    this.coordenacao = null;
    this.alocacao = null;
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
      return "Funcionario sem escolaridade definida";
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
      return "Funcionario sem filial definida";
    }
    return this.coordenacao.getNome();
  }

  public String getNomeCidadeFilial() {
    if (this.coordenacao == null) {
      return "Funcionario sem filial definida";
    }
    return this.coordenacao.getNomeCidade();
  }

  public String getNomeEstadoFilial() {
    if (this.coordenacao == null) {
      return "Funcionario sem filial definida";
    }
    return this.coordenacao.getNomeEstado();
  }

  public String getNomePaisFilial() {
    if (this.coordenacao == null) {
      return "Funcionario sem filial definida";
    }
    return this.coordenacao.getNomePais();
  }

  public Departamento getDepartamento() {
    return this.alocacao;
  }

  public void setDepartamento(Departamento alocacao) {
    this.alocacao = alocacao;
  }

  public String getNomeDepartamento() {
    if (this.alocacao == null) {
      return "Funcionario nao alocado a nenhum departamento";
    }
    return this.alocacao.getNome();
  }

}