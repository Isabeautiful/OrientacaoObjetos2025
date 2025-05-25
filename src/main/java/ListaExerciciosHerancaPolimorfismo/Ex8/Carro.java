package ListaExerciciosHerancaPolimorfismo.Ex8;

public class Carro extends Veiculo {
    public Carro(String marca, String modelo, double precoBase){
        super(marca, modelo, precoBase);
    }

    public float getFatorFixo(){
        return 1.25f;
    }
}
