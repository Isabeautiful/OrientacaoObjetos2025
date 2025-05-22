package ListaExerciciosHerancaPolimorfismo.Ex4;

public class VooDomestico extends Voo {
    private int fatorPreco;

    public VooDomestico(String origem, float distancia, String destino, String dataVoo, int fatorPreco){
        super(origem, distancia, destino, dataVoo);
        setFatorPreco(fatorPreco);
    }

    public int getFatorPreco() {
        return this.fatorPreco;
    }

    public void setFatorPreco(int fatorPreco) {
        if(fatorPreco <= 0){
            throw new IllegalArgumentException("Erro: Argumento FatorPreco deve ser positivo");
        }
        this.fatorPreco = fatorPreco;
    }

    public float calcularPreco(){
        return getDistancia() * getFatorPreco();
    }

    //TODO: casos de teste
}
