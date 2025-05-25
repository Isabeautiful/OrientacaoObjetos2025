package ListaExerciciosHerancaPolimorfismo.Ex6;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String numeroConta, String titular, double saldoInicial){
        super(numeroConta,titular,saldoInicial);
    }

    public double getTaxaManutencaoDeposito(){
        return 0.50;
    }

    public double getTaxaManutencaoMensal(){
        return 15.00;
    }

    public void depositar(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Erro: Argumento valor deve ser positivo");
        }
        setSaldo(getSaldo() + (valor - getTaxaManutencaoDeposito()));
    }

    public void calcularJuros(){
        setSaldo(getSaldo() - getTaxaManutencaoMensal());
    }

}
