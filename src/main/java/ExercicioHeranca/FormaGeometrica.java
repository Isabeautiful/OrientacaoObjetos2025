package ExercicioHeranca;

public abstract class FormaGeometrica {
    protected double area;
    protected double perimetro;

    public double getPerimetro() {
        return this.perimetro;
    }

    public void setPerimetro() {
        this.perimetro = calcularPerimetro();
    }

    public double getArea() {
        return this.area;
    }

    public void setArea() {
        this.area = calcularArea();
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}
