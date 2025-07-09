package ExercicioAN05;

public abstract class Manutencao {
    private int numero;
    private float valorMaoObra;

    public Manutencao(int numero, float valorMaoObra){
        setNumero(numero);
        setValorMaoObra(valorMaoObra);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("Erro: número inválido");
        }
        this.numero = numero;
    }

    public float getValorMaoObra() {
        return valorMaoObra;
    }

    public void setValorMaoObra(float valorMaoObra) {
        if (valorMaoObra < 0) {
            throw new IllegalArgumentException("Erro: valor da mão-de-obra inválido");
        }
        this.valorMaoObra = valorMaoObra;
    }

    public abstract float getValorTotal();
    public abstract String getDescricao();
}
