package ExercicioAN05;

public class ManutencaoMonitor extends Manutencao {

    public ManutencaoMonitor(int numero, float maoObra){
        super(numero, maoObra);
    }

    @Override
    public float getValorTotal() {
        return getValorMaoObra();
    }

    @Override
    public String getDescricao() {
        return "Manutenção Monitor - Nº " + getNumero() + " - Valor: R$ " + getValorTotal();
    }
}
