package ExercicioAN02;

public class ContasBancaria {
    private Cliente cliente;
    float saldo;
    private int numeroConta;

    public ContasBancaria(Cliente cliente, float saldo, int numeroConta){
        setCliente(cliente);
        setSaldo(saldo);
        setNumeroConta(numeroConta); //tem como gerar esse numero?
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        if(cliente == null){
            throw new IllegalArgumentException("Erro: Argumento cliente não pode ser nulo");
        }
        this.cliente = cliente;
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
}
