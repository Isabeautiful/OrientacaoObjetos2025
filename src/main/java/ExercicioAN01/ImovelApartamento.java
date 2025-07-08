package ExercicioAN01;

public class ImovelApartamento extends Imoveis {
    int numAndares;
    public ImovelApartamento(float metroQuadrado, Contribuinte contribuinte, int numAndares){
        super(metroQuadrado, contribuinte);
        setNumAndares(numAndares);
        setValorImovel(getValorImovel());
    }

    public int getNumAndares() {
        return this.numAndares;
    }

    public void setNumAndares(int numAndares) {
        if(numAndares < 0){
            throw new IllegalArgumentException("Erro: argumento numAndares não pode ser negativo");
        }
        this.numAndares = numAndares;
    }

    @Override
    public float getValorImovel() {
        float v = (40.0f * getMetroQuadrado());
        v -= (((float) 10 / 100) * this.numAndares);
        return v;
    }

    @Override
    public String getDescricao(){
        return "Apartamento - " + getMetroQuadrado() + " m², Andar: " + getNumAndares() + " - Valor: R$ " + getValorImovel();
    }
}
