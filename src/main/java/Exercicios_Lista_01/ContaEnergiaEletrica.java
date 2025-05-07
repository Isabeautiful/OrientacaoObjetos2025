package Exercicios_Lista_01;

public class ContaEnergiaEletrica {
    private float numConsumoKW;
    private double valorPorKW;
    private double valorConta;

    public ContaEnergiaEletrica() {
        this.numConsumoKW = 0;
        this.valorPorKW = 0.12; //valor a ser pago por KW é fixo da conta de energia
        this.valorConta = 0; //valor a ser pago pelo usuario, calculado na função calculaValorASerPago
    }

    //gets e sets
    public float getNumConsumoKW() {
        return numConsumoKW;
    }

    public void setNumConsumoKW(float numConsumoKW) {
        if (numConsumoKW < 0){
            throw new IllegalArgumentException("Erro: Numero de Quilowatts consumidos não pode ser negativo");
        }
        this.numConsumoKW = numConsumoKW;
    }

    public double getValorConta(){
        return this.valorConta;
    }

    //calcula o valor a ser pago pelo usuário
    public void calculaValorASerPago() {
        this.valorConta = this.numConsumoKW * valorPorKW;
        this.valorConta += valorConta * 0.18;
    }
}
