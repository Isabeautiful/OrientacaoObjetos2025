package ExercicioAssociacaoNProfessor;

import java.util.ArrayList;

public class Departamento {

    private int alocacaoMaxima;
    private ArrayList<Funcionario> funcionarios;

    public Departamento(int alocacaoMaxima) {
        this.funcionarios = new ArrayList<Funcionario>();
        this.alocacaoMaxima = alocacaoMaxima;
    }

    public int getAlocacaoMaxima() {
        return alocacaoMaxima;
    }

    public void setAlocacaoMaxima(int alocacaoMaxima) {
        this.alocacaoMaxima = alocacaoMaxima;
    }

    public ArrayList getFuncionarios() {
        return this.funcionarios;
    }

    public void setFuncionarios(ArrayList funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void alocar(Funcionario funcionario) {
        if (this.getNumeroFuncionarios() >= this.alocacaoMaxima) {
            throw new IllegalArgumentException("Excedeu numero maximo funcionarios");
        }
        this.funcionarios.add(funcionario);
    }

    public int getNumeroFuncionarios() {
        return this.funcionarios.size();
    }

    public float calcularFolhaPagamento() {
        float totalFolha = 0;
        for (Funcionario funcionario : this.funcionarios) {
            totalFolha += funcionario.calcularSalario();
        }
        return totalFolha;
    }

    public boolean verificarFuncionario(Funcionario funcionario) {
        return this.funcionarios.contains(funcionario);
    }

    public boolean verificarFuncionarioPeloNome(String nome) {
        boolean achou = false;
        for (Funcionario funcionario : this.funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                achou = true;
            }
        }
        return achou;
    }

    public void desalocar(Funcionario funcionario) {
        this.funcionarios.remove(funcionario);
    }

    public ArrayList<String> obterNomesFuncionarios() {
        ArrayList<String> lista = new ArrayList<String>();
        for (Funcionario funcionario : this.funcionarios) {
            lista.add(funcionario.getNome());
        }
        return lista;
    }
}
