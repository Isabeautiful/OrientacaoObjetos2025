package ExercicioAN03;

import java.util.ArrayList;

public class Hospede {
    private String codigo;
    private String nome;
    private ArrayList<Reserva> reservas;

    public Hospede(String codigo, String nome){
        setCodigo(codigo);
        setNome(nome);
        this.reservas = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if(codigo.trim().isEmpty()){
            throw new IllegalArgumentException("Erro");
        }
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("Erro");
        }
        this.nome = nome;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void adicionarReserva(Reserva reserva){
        if(reserva == null){
            throw new IllegalArgumentException("Erro");
        }
        this.reservas.add(reserva);
    }

    public String listarReservas(){
        StringBuilder sb = new StringBuilder();
        for(Reserva reserva: reservas){
            sb.append(reserva.getDescricao()).append(", ");
        }
        return sb.toString();
    }
}
