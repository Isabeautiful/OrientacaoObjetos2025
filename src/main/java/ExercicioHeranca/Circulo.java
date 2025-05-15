package ExercicioHeranca;

public class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo(double raio){
        setRaio(raio);
        setArea();
        setPerimetro();
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if(raio <= 0){
            throw new IllegalArgumentException("Erro: raio (double) deve ser positivo");
        }
        this.raio = raio;
    }

    public double calcularArea(){
        return (Math.PI * (this.raio * this.raio));
    }

    public double calcularPerimetro() {
        return (Math.PI * (2 * this.raio));
    }
}
