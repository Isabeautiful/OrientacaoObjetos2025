package ExercicioAN07;

import java.util.ArrayList;

public class Cliente {
    private int codigo;
    private String nome;
    private ArrayList<Emprestimo> emprestimos;

    public Cliente(int codigo, String nome) {
        setCodigo(codigo);
        setNome(nome);
        this.emprestimos = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo < 0) {
            throw new IllegalArgumentException("Erro: Código inválido");
        }
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: Nome inválido, string vazia");
        }
        this.nome = nome;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void addEmprestimo(Emprestimo emprestimo) {
        if (emprestimo == null) {
            throw new IllegalArgumentException("Erro: Empréstimo não pode ser nulo");
        }
        this.emprestimos.add(emprestimo);
    }

    public void removerEmprestimo(Emprestimo emprestimo) {
        if (emprestimo == null) {
            throw new IllegalArgumentException("Erro: Empréstimo não pode ser nulo.");
        }
        if (!emprestimos.contains(emprestimo)) {
            throw new IllegalArgumentException("Erro: Empréstimo não encontrado na lista.");
        }
        emprestimos.remove(emprestimo);
    }

    public float calcularTotalEmprestimos() {
        float total = 0;
        for (Emprestimo emprestimo : emprestimos) {
            total += emprestimo.calcularValor();
        }
        return total;
    }

    public String listarEmprestimos() {
        StringBuilder sb = new StringBuilder();
        for (Emprestimo emprestimo : emprestimos) {
            sb.append(emprestimo.getDescricao()).append(", ");
        }
        return sb.toString();
    }

    public int getNumeroEmprestimos() {
        return emprestimos.size();
    }

    public boolean buscarEmprestimo(Emprestimo emprestimo) {
        return emprestimos.contains(emprestimo);
    }

}
