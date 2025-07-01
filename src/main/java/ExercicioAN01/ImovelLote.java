package ExercicioAN01;

public class ImovelLote extends Imoveis{
    //Valor do imovel: 30,00 por metro quadrado
    public ImovelLote(float metroQuadrado, Contribuinte contribuinte){
        super(metroQuadrado, contribuinte);
        setValorImovel(getValorImovel());
    }

    @Override
    public float getValorImovel() {
        return 30.0f * getMetroQuadrado();
    }
}
