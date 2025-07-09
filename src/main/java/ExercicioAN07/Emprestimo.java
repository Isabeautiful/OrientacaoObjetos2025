package ExercicioAN07;

import java.util.ArrayList;
import java.util.Date;

public class Emprestimo {
    private Date data;
    private String nomeFilme;
    private ArrayList<Fita> fitas;

    public Emprestimo(Date data, String nomeFilme) {
        setData(data);
        setNomeFilme(nomeFilme);
        this.fitas = new ArrayList<>();
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        if (data == null) {
            throw new IllegalArgumentException("Erro: Data não pode ser nula.");
        }
        this.data = data;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        if (nomeFilme == null || nomeFilme.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: Nome do filme não pode ser vazio.");
        }
        this.nomeFilme = nomeFilme;
    }

    public ArrayList<Fita> getFitas() {
        return fitas;
    }

    public void adicionarFita(Fita fita) {
        if (fita == null) {
            throw new IllegalArgumentException("Erro: Fita não pode ser nula.");
        }
        this.fitas.add(fita);
    }

    public void removerFita(Fita fita) {
        if (fita == null) {
            throw new IllegalArgumentException("Erro: Fita não pode ser nula.");
        }
        if (!fitas.contains(fita)) {
            throw new IllegalArgumentException("Erro: Fita não encontrada na lista.");
        }
        this.fitas.remove(fita);
    }

    public boolean buscarFita(Fita fita) {
        return fitas.contains(fita);
    }

    public int getNumeroFitas() {
        return fitas.size();
    }

    public float calcularValor() {
        float total = 0;
        for (Fita fita : fitas) {
            total += fita.calcularValor();
        }
        return total;
    }

    public String listarFitas() {
        StringBuilder sb = new StringBuilder();
        for (Fita fita : fitas) {
            sb.append("Tipo: ").append(fita.getClass().getSimpleName())
                    .append(", Dias: ").append(fita.getNumDias())
                    .append(", Valor: R$ ").append(fita.calcularValor()).append(" | ");
        }
        return sb.toString();
    }

    public String getDescricao() {
        return "Empréstimo de '" + nomeFilme + "' em " + data +
                " com " + getNumeroFitas() + " fita(s), Valor Total: R$ " + calcularValor();
    }
}
