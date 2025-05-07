package Exercicios_Lista_02;

public class ContaBancaria {
    private String titular;
    private String numero_conta;
    private float saldo;

    public ContaBancaria(String titular, String numero_conta, float saldo){
        setSaldo(saldo);
        setNumero_conta(numero_conta);
        setTitular(titular);
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero_conta() {
        return this.numero_conta;
    }

    public void setNumero_conta(String numero_conta) {
        this.numero_conta = numero_conta;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    void depositar(float valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Erro: Nao pode depositar valor negativo ou nulo");
        }
        setSaldo(this.saldo + valor);
    }

    void sacar(float valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Erro: Nao pode sacar valor negativo ou nulo");
        }
        if(valor > this.saldo){
            throw new IllegalArgumentException("Erro: Nao pode sacar mais do que o valor do saldo");
        }
        setSaldo(this.saldo - valor);
    }
}
