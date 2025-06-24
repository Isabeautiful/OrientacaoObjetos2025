package Avaliacao1;

public class Cliente extends Pessoa {
    private String cpf;

    public Cliente(String nome, String cpf){
        super(nome);
        setCpf(cpf);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.trim().isEmpty()){
            throw new IllegalArgumentException("Cpf vazio");
        }
        this.cpf = cpf;
    }
}
