package ExercicioRelampagoSurpresaHP;

public class Estado{
    private String nome;
    private Pais pais;

    public Estado(String nome, Pais pais) {
        setNome(nome);
        setPais(pais);
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

    public Pais getPais() {
        return this.pais;
    }

    public void setPais(Pais pais) {
        if (pais == null) {
            throw new IllegalArgumentException("Erro: País não pode ser nulo");
        }
        this.pais = pais;
    }

    public String getNomePais() {
        return this.pais.getNome();
    }
}