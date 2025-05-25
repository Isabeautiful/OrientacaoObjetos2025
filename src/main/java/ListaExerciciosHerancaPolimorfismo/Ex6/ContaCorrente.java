package ListaExerciciosHerancaPolimorfismo.Ex6;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String numeroConta, String titular, float saldoInicial){
        super(numeroConta,titular,saldoInicial);
    }

    public float getTaxaManutencaoDeposito(){
        return 0.50f;
    }

    public float getTaxaManutencaoMensal(){
        return 15.00f;
    }

    public void depositar(float valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Erro: Argumento valor deve ser positivo");
        }
        setSaldo(getSaldo() + (valor - getTaxaManutencaoDeposito()));
    }

    public void calcularJuros(){
        setSaldo(getSaldo() - getTaxaManutencaoMensal());
    }

}
