package ExercicioAN01;

public class ImovelApartamento extends Imovel {
    int numAndares;
    public ImovelApartamento(float metroQuadrado, int numAndares){
        super(metroQuadrado);
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
        float valorBase = 40.0f * getMetroQuadrado();
        float desconto = valorBase * (0.10f * getNumAndares());
        return valorBase - desconto;
    }

    @Override
    public String getDescricao(){
        return "Apartamento - " + getMetroQuadrado() + " m², Andar: " + getNumAndares() + " - Valor: R$ " + getValorImovel();
    }
}
