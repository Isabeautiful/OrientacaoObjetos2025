package ExercicioAN05;

public class ManutencaoImpressora extends Manutencao {
    private float valorPecas;

    public ManutencaoImpressora(int numero, float maoObra, float valorPecas){
        super(numero, maoObra);
        setValorPecas(valorPecas);
    }

    public float getValorPecas() {
        return valorPecas;
    }

    public void setValorPecas(float valorPecas) {
        if (valorPecas < 0) {
            throw new IllegalArgumentException("Erro: valor das peças inválido");
        }
        this.valorPecas = valorPecas;
    }

    @Override
    public float getValorTotal() {
        return getValorMaoObra() + valorPecas;
    }

    @Override
    public String getDescricao() {
        return "Manutenção Impressora - Nº " + getNumero() + " - Valor: R$ " + getValorTotal();
    }
}
