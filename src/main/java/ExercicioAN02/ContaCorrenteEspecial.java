package ExercicioAN02;

public class ContaCorrenteEspecial extends ContasBancaria {
    //saldo + limite de credito
    private float limiteCredito;

    public ContaCorrenteEspecial(Cliente cliente, float saldo, int numeroConta, int limiteCredito){
        super(cliente, saldo, numeroConta);
        setLimiteCredito(limiteCredito);
    }

    public float getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(float limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}
