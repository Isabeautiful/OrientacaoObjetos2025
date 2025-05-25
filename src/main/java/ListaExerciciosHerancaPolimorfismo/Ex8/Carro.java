package ListaExerciciosHerancaPolimorfismo.Ex8;

public class Carro extends Veiculo {
    public Carro(String marca, String modelo, double precoBase){
        super(marca, modelo, precoBase);
    }

    public double getFatorFixo(){
        return 1.25;
    }
}
