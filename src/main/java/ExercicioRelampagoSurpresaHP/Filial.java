package ExercicioRelampagoSurpresaHP;

public class Filial{
    private String nome;
    private Cidade cidade;
    private Empresa empresa;

    public Filial(String nome, Cidade cidade) {
        setNome(nome);
        setCidade(cidade);
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

    public String getNomeGrupo() {
        if (this.empresa == null) {
            return "Filial sem empresa definida";
        }
        return this.empresa.getNomeGrupo();
    }

    public String getNomeSede() {
        if (this.empresa == null) {
            return "Filial sem empresa definida";
        }
        return this.empresa.getNomeSede();
    }

    //numero 5
    public String getNomeDiretorEmpresa() {
        if (this.empresa == null) {
            return "Filial sem empresa definida";
        }
        return this.empresa.getNomeDiretor();
    }
}