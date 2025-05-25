package ListaExerciciosHerancaPolimorfismo.Ex6;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String numeroConta, String titular, double saldoInicial){
        super(numeroConta,titular,saldoInicial);
    }

    public double getTaxaJuros(){
        return 0.005;
    }

    public void depositar(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Erro: Argumento valor deve ser positivo");
        }
        setSaldo(getSaldo() + valor);
    }

    public void calcularJuros(){
        setSaldo(getSaldo() + (getSaldo() * getTaxaJuros()));
    }
}
