package ListaExerciciosHerancaPolimorfismo.Ex8;

public class Bicicleta extends Veiculo {
    public Bicicleta(String marca, String modelo, double precoBase){
        super(marca, modelo, precoBase);
    }

    public float getFatorFixo(){
        return 1.05f;
    }
}
