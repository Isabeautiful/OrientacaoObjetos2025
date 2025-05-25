package ListaExerciciosHerancaPolimorfismo.Ex8;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private double precoBase;

    public Veiculo(String marca, String modelo, double precoBase){
        setMarca(marca);
        setModelo(modelo);
        setPrecoBase(precoBase);
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        if(marca.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: Argumento marca nao pode ser uma string vazia");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        if(modelo.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: Argumento modelo nao pode ser uma string vazia");
        }
        this.modelo = modelo;
    }

    public double getPrecoBase() {
        return this.precoBase;
    }

    public void setPrecoBase(double precoBase) {
        if(precoBase <= 0){
            throw new IllegalArgumentException("Erro: Argumento PrecoBase deve ser positivo");
        }
        this.precoBase = precoBase;
    }

    public abstract double getFator();

    public double calcularCusto(){
        return getPrecoBase() * getFator();
    }

}
