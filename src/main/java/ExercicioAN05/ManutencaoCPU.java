package ExercicioAN05;

public class ManutencaoCPU extends Manutencao {
    private float valorPecas;

    public ManutencaoCPU(int numero, float maoObra, float valorPecas){
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
        return "Manutenção CPU - Nº " + getNumero() + " - Valor: R$ " + getValorTotal();
    }
}
