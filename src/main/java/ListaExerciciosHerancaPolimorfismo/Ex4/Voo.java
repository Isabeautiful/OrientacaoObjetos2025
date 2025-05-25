package ListaExerciciosHerancaPolimorfismo.Ex4;

public abstract class Voo {
    private String origem;
    private float distancia;
    private String destino;
    private String dataVoo;

    public Voo(String origem, float distancia, String destino, String dataVoo){
        setOrigem(origem);
        setDestino(destino);
        setDataVoo(dataVoo);
        setDistancia(distancia);
    }

    public String getOrigem() {
        return this.origem;
    }

    public void setOrigem(String origem) {
        if(origem.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: Argumento Origem nao pode ser uma string vazia");
        }
        this.origem = origem;
    }

    public float getDistancia() {
        return this.distancia;
    }

    public void setDistancia(float distancia) {
        if(distancia <= 0){
            throw new IllegalArgumentException("Erro: Argumento distancia deve ser positivo");
        }
        this.distancia = distancia;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String destino) {
        if(destino.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: Argumento destino nao pode ser uma string vazia");
        }
        this.destino = destino;
    }

    public String getDataVoo() {
        return this.dataVoo;
    }

    public void setDataVoo(String dataVoo) {
        if(dataVoo.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: Argumento dataVoo nao pode ser uma string vazia");
        }
        this.dataVoo = dataVoo;
    }

    public abstract float calcularPreco();
}
