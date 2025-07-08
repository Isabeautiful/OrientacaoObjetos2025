package ExercicioAN01;

public class ImovelLote extends Imoveis{
    public ImovelLote(float metroQuadrado, Contribuinte contribuinte){
        super(metroQuadrado, contribuinte);
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
