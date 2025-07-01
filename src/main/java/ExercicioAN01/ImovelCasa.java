package ExercicioAN01;

public class ImovelCasa extends Imoveis{
    //Valor do imovel: 30,00 por metro quadrado + 50,00 por metro quadrado da construção
    public ImovelCasa(float metroQuadrado, Contribuinte contribuinte){
        super(metroQuadrado,contribuinte);
        setValorImovel(getValorImovel());
    }

    @Override
    public float getValorImovel() {
        return 30.0f * getMetroQuadrado() + 50.0f * getMetroQuadrado();
    }
}
