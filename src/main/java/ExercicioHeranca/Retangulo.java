package ExercicioHeranca;

public class Retangulo extends FormaGeometrica {

    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        setLargura(largura);
        setAltura(altura);
        setArea();
        setPerimetro();
    }

    public double getLargura() {
        return this.largura;
    }

    public void setLargura(double largura) {
        if(largura <= 0){
            throw new IllegalArgumentException("Erro: largura (double) deve ser positiva");
        }
        this.largura = largura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        if(altura <= 0){
            throw new IllegalArgumentException("Erro: altura (double) deve ser positiva");
        }
        this.altura = altura;
    }

    public double calcularArea(){
        return (this.largura * this.altura);
    }

    public double calcularPerimetro() {
        return this.largura * 2 + this.altura * 2;
    }
}
