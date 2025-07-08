package ExercicioAN01;

public abstract class Imovel {
    private float metroQuadrado;
    private float valorImovel;

    public Imovel(float metroQuadrado){
        setMetroQuadrado(metroQuadrado);
        this.valorImovel = 0; //valor será calculado
    }

    public float getMetroQuadrado() {
        return this.metroQuadrado;
    }

    public void setMetroQuadrado(float metroQuadrado) {
        if (metroQuadrado <= 0) {
            throw new IllegalArgumentException("Erro: O metro quadrado não pode ser zero ou negativo.");
        }
        this.metroQuadrado = metroQuadrado;
    }

    public abstract float getValorImovel();

    public void setValorImovel(float valorImovel){
        this.valorImovel = valorImovel;
    }

    public abstract String getDescricao();
}
