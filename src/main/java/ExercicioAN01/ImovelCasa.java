package ExercicioAN01;

public class ImovelCasa extends Imovel {
    private float metragemConstrucao;

    public ImovelCasa(float metroQuadrado, float metragemConstrucao){
        super(metroQuadrado);
        setValorImovel(getValorImovel());
        setMetragemConstrucao(metragemConstrucao);
    }

    public float getMetragemConstrucao() {
        return metragemConstrucao;
    }

    public void setMetragemConstrucao(float metragemConstrucao) {
        if(metragemConstrucao < 0){
            throw new IllegalArgumentException("Erro: metragem construcao nao pode ser negativo");
        }
        this.metragemConstrucao = metragemConstrucao;
    }

    @Override
    public float getValorImovel() {
        return (30.0f * getMetroQuadrado()) + (50.0f * getMetragemConstrucao());
    }

    @Override
    public String getDescricao(){
        return "Casa - Terreno: " + getMetroQuadrado() + " m², Construção: " + metragemConstrucao + " m² - Valor: R$ " + getValorImovel();
    }

}
