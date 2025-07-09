package ExercicioAN08;

public abstract class Aluno {
    private String matricula;
    private String nome;
    private String endereco;

    public Aluno(String matricula, String nome, String endereco) {
        setMatricula(matricula);
        setNome(nome);
        setEndereco(endereco);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula == null || matricula.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: Matrícula inválida, string vazia");
        }
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: Nome inválido, string vazia");
        }
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco == null || endereco.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: Endereço inválido, string vazia");
        }
        this.endereco = endereco;
    }

    public abstract float calcularMensalidade();

    public abstract int getNumeroParcelas();
}
