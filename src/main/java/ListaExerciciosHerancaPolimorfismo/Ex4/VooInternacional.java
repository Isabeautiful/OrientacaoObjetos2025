package ListaExerciciosHerancaPolimorfismo.Ex4;

public class VooInternacional extends Voo {
    private int fatorPreco;
    private float taxaConversaoMoeda;

    public VooInternacional(String origem, float distancia, String destino, String dataVoo, int fatorPreco){
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

    public float getTaxaConversaoMoeda() {
        return this.taxaConversaoMoeda;
    }

    public void setTaxaConversaoMoeda(float taxaConversaoMoeda) {
        if(taxaConversaoMoeda <= 0){
            throw new IllegalArgumentException("Erro: Argumento TaxaConversaoMoeda deve ser positivo");
        }
        this.taxaConversaoMoeda = taxaConversaoMoeda;
    }

    public float calcularPreco(){
        return getDistancia() * getFatorPreco();
    }

    //TODO: casos de teste
}
