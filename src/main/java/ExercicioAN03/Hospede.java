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
        if(codigo == null || codigo.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: Código inválido, string vazia");
        }
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: Nome inválido, string vazia");
        }
        this.nome = nome;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void adicionarReserva(Reserva reserva){
        if(reserva == null){
            throw new IllegalArgumentException("Erro: Reserva não pode ser nula");
        }
        this.reservas.add(reserva);
    }

    public void removerReserva(Reserva reserva){
        if(reserva == null){
            throw new IllegalArgumentException("Erro: Reserva não pode ser nula");
        }
        if (!this.reservas.contains(reserva)) {
            throw new IllegalArgumentException("Erro: Reserva não encontrada na lista");
        }
        this.reservas.remove(reserva);
    }

    public float calcularTotalReserva(){
        float total = 0;
        for(Reserva reserva: reservas){
            total += reserva.calcularTotal();
        }
        return total;
    }

    public String listarReservas(){
        StringBuilder sb = new StringBuilder();
        for(Reserva reserva: reservas){
            sb.append(reserva.getDescricao()).append(", ");
        }
        return sb.toString();
    }

    public int getNumeroReservas() {
        return reservas.size();
    }

    public boolean buscarReserva(Reserva reserva){
        for(Reserva r: reservas){
            if(r == reserva){
                return true;
            }
        }
        return false;
    }
}
