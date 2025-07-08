package ExercicioAN03;

import java.util.ArrayList;

public class Hospede {

    private int codigo;
    private String nome;
    private ArrayList<Reserva> reservas;

    public Hospede(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.reservas = new ArrayList<Reserva>();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void adicionarReserva(Reserva reserva) {
        this.reservas.add(reserva);
    }

    public void removerReserva(Reserva reserva) {
        this.reservas.remove(reserva);
    }

    public ArrayList<String> listarReservas() {
        ArrayList<String> lista = new ArrayList<>();
        for (Reserva reserva : reservas) {
            //lista.add(reserva.getDescricao());
        }
        return lista;
    }

    public ArrayList<Float> listarValoresReservas() {
        ArrayList<Float> valores = new ArrayList<>();
        for (Reserva reserva : reservas) {
            //valores.add(reserva.calcularValor());
        }
        return valores;
    }
}
