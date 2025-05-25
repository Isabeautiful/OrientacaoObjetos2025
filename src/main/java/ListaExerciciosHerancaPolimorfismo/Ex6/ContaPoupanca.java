package ListaExerciciosHerancaPolimorfismo.Ex6;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String numeroConta, String titular, float saldoInicial){
        super(numeroConta,titular,saldoInicial);
    }

    public float getTaxaJuros(){
        return 0.5f;
    }

    public void depositar(float valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Erro: Argumento valor deve ser positivo");
        }
        setSaldo(getSaldo() + valor);
    }

    public void calcularJuros(){
        setSaldo(getSaldo() + (getSaldo() * getTaxaJuros()));
    }
}
