package ExercicioAN02;

public class ContaPoupanca extends ContasBancaria {
    //Informar saldo disponivel
    public ContaPoupanca(float saldo, int numeroConta){
        super(saldo, numeroConta);
    }

    public String getDescricao(){
        return "Conta Poupanca - " + getSaldo();
    }
}
