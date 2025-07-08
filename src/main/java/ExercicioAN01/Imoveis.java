package ExercicioAN01;

public abstract class Imoveis {
    private float metroQuadrado;
    private float valorImovel;
    private Contribuinte contribuinte;

    public Imoveis(float metroQuadrado, Contribuinte contribuinte){
        setMetroQuadrado(metroQuadrado);
        setContribuinte(contribuinte);
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

    public Contribuinte getContribuinte() {
        return this.contribuinte;
    }

    public void setContribuinte(Contribuinte contribuinte) {
        this.contribuinte = contribuinte;
    }

    public abstract String getDescricao();
}
