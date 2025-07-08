package ExercicioAN07;

import java.util.Date;

public class Emprestimo {
    private Date data;
    private String nomeFilme;
    private Fita fita;

    public Emprestimo(Date data, String nomeFilme, Fita fita) {
        this.data = data;
        this.nomeFilme = nomeFilme;
        this.fita = fita;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        if (nomeFilme.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: Nome do filme não pode ser vazio");
        }
        this.nomeFilme = nomeFilme;
    }

    public Fita getFita() {
        return fita;
    }

    public void setFita(Fita fita) {
        if (fita == null) {
            throw new IllegalArgumentException("Erro: Tipo de fita não pode ser nulo");
        }
        this.fita = fita;
    }

    public float calcularValor() {
        return fita.calcularValor();
    }
}
