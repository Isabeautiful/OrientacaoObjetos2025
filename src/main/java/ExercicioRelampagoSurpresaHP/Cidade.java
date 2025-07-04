package ExercicioRelampagoSurpresaHP;

public class Cidade{
    private String nome;
    private Estado estado;

    public Cidade(String nome, Estado estado) {
        setNome(nome);
        setEstado(estado);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: Nome não pode ser vazio");
        }
        this.nome = nome;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        if (estado == null) {
            throw new IllegalArgumentException("Erro: Estado não pode ser nulo");
        }
        this.estado = estado;
    }

    public String getNomeEstado() {
        return this.estado.getNome();
    }

    public String getNomePais() {
        return this.estado.getNomePais();
    }

}