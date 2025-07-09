package ExercicioAN02;

public class ContaCorrenteNormal extends ContasBancaria {
    public ContaCorrenteNormal(Cliente cliente, float saldo, int numeroConta){
        super(saldo, numeroConta);
    }

    public String getDescricao(){
        return "Conta Corrente Normal - " + getSaldo();
    }
}
