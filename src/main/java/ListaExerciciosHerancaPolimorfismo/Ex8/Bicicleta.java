package ListaExerciciosHerancaPolimorfismo.Ex8;

public class Bicicleta extends Veiculo {
    public Bicicleta(String marca, String modelo, double precoBase){
        super(marca, modelo, precoBase);
    }

    public double getFatorFixo(){
        return 1.05;
    }
}
