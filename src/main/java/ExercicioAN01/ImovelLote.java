package ExercicioAN01;

public class ImovelLote extends Imovel {
    public ImovelLote(float metroQuadrado){
        super(metroQuadrado);
        setValorImovel(getValorImovel());
    }

    @Override
    public float getValorImovel() {
        return 30.0f * getMetroQuadrado();
    }

    @Override
    public String getDescricao(){
        return "Lote - " + getMetroQuadrado() + " m² - Valor: R$ " + getValorImovel();
    }
}
