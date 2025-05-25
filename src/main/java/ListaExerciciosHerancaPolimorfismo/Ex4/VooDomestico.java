package ListaExerciciosHerancaPolimorfismo.Ex4;

public class VooDomestico extends Voo {
    private float fatorPreco;

    public VooDomestico(String origem, float distancia, String destino, String dataVoo, float fatorPreco){
        super(origem, distancia, destino, dataVoo);
        setFatorPreco(fatorPreco);
    }

    public float getFatorPreco() {
        return this.fatorPreco;
    }

    public void setFatorPreco(float fatorPreco) {
        if(fatorPreco <= 0){
            throw new IllegalArgumentException("Erro: Argumento FatorPreco deve ser positivo");
        }
        this.fatorPreco = fatorPreco;
    }

    public float calcularPreco(){
        return getDistancia() * getFatorPreco();
    }

}
