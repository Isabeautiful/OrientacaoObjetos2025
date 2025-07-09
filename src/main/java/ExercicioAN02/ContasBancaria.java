package ExercicioAN02;

public abstract class ContasBancaria {
    float saldo;
    private int numeroConta;

    public ContasBancaria( float saldo, int numeroConta){
        setSaldo(saldo);
        setNumeroConta(numeroConta); //tem como gerar esse numero?
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        if(numeroConta < 0 ){
            throw new IllegalArgumentException("Erro: Argumento numeroConta nao pode ser negativo");
        }
        this.numeroConta = numeroConta;
    }

    public abstract String getDescricao();
}
