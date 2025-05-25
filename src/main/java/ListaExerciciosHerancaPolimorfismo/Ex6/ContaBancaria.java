package ListaExerciciosHerancaPolimorfismo.Ex6;

public abstract class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private String titular;

    public ContaBancaria(String numeroConta, String titular, double saldoInicial){
        setNumeroConta(numeroConta);
        setTitular(titular);
        setSaldo(saldo);
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        if(numeroConta.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: Argumento numeroConta nao pode ser negativo");
        }
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo < 0){
            throw new IllegalArgumentException("Erro: Argumento saldo nao pode ser negativo");
        }
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

    public void sacar(double valor) {
        if(valor <= 0){
            throw new IllegalArgumentException("Erro: Argumento valor deve ser positivo");
        }
        if(valor > getSaldo()){ ///TODO: Pode ter saldo negativo?
            throw new IllegalArgumentException("Erro: Saldo insuficiente para saque");
        }
        setSaldo(getSaldo() - valor);
    }

    public abstract void depositar(double valor);
    public abstract void calcularJuros();
}
