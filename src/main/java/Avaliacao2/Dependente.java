package Avaliacao2;

public class Dependente extends Pessoa {
    private String dataNascimento;
    public Dependente(String nome) {
        super(nome);
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        if(dataNascimento.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: String dataNascimento invalida");
        }
        this.dataNascimento = dataNascimento;
    }
}
