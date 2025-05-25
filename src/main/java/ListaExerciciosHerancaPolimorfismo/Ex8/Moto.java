package ListaExerciciosHerancaPolimorfismo.Ex8;

public class Moto extends Veiculo {
    public Moto(String marca, String modelo, double precoBase){
        super(marca, modelo, precoBase);
    }

    public float getFatorFixo(){
        return 1.15f;
    }
}
