package Avaliacao1;

public class Fornecedor extends Pessoa {
    private String cnpj;

    public Fornecedor(String nome, String cnpj){
        super(nome);
        setCnpj(cnpj);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        if(cnpj.trim().isEmpty()){
            throw new IllegalArgumentException("CNPJ vazio");
        }
        this.cnpj = cnpj;
    }
}
