package ExercicioAN06;

public abstract class Vaga {
    private int numero;
    private String placaVeiculo;

    public Vaga(int numero, String placaVeiculo){
        setNumero(numero);
        setPlacaVeiculo(placaVeiculo);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0){
            throw new IllegalArgumentException("Erro: número da vaga inválido");
        }
        this.numero = numero;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        if(placaVeiculo.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: placa do veículo inválida");
        }
        this.placaVeiculo = placaVeiculo;
    }

    public abstract float getValorAluguel();
    public abstract String getDescricao();
}
