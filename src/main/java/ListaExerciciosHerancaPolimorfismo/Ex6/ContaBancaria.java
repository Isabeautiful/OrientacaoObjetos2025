package ListaExerciciosHerancaPolimorfismo.Ex6;

public abstract class ContaBancaria {
    private String numeroConta;
    private float saldo;
    private String titular;

    public ContaBancaria(String numeroConta, String titular, float saldoInicial){
        setNumeroConta(numeroConta);
        setTitular(titular);
        setSaldo(saldoInicial);
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        if(numeroConta.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: Argumento numeroConta nao pode ser uma string vazia");
        }
        this.numeroConta = numeroConta;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        if(titular.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: Argumento titular nao pode ser uma string vazia");
        }
        this.titular = titular;
    }

    public void sacar(float valor) {
        if(valor <= 0){
            throw new IllegalArgumentException("Erro: Argumento valor deve ser positivo");
        }
        if(valor > getSaldo()){
            throw new IllegalArgumentException("Erro: Saldo insuficiente para saque");
        }
        setSaldo(getSaldo() - valor);
    }

    public abstract void depositar(float valor);
    public abstract void calcularJuros();
}
