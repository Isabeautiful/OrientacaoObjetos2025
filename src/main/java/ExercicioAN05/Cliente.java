package ExercicioAN05;

import java.util.ArrayList;

public class Cliente {
    private String codigo;
    private String nome;
    private ArrayList<Manutencao> manutencoes;

    public Cliente(String codigo, String nome){
        setCodigo(codigo);
        setNome(nome);
        this.manutencoes = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: Código inválido");
        }
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Erro: Nome inválido");
        }
        this.nome = nome;
    }

    public void adicionarManutencao(Manutencao manutencao){
        if(manutencao == null){
            throw new IllegalArgumentException("Erro: manutenção nula");
        }
        this.manutencoes.add(manutencao);
    }

    public void removerManutencao(Manutencao manutencao){
        if(manutencao == null || !manutencoes.contains(manutencao)){
            throw new IllegalArgumentException("Erro: manutenção inválida");
        }
        manutencoes.remove(manutencao);
    }

    public float calcularTotalManutencoes(){
        float total = 0;
        for (Manutencao m : manutencoes) {
            total += m.getValorTotal();
        }
        return total;
    }

    public String listarManutencoes(){
        StringBuilder sb = new StringBuilder();
        for (Manutencao m : manutencoes) {
            sb.append(m.getDescricao()).append(", ");
        }
        return sb.toString();
    }

    public int getNumeroManutencoes(){
        return manutencoes.size();
    }

    public boolean buscarManutencao(Manutencao m){
        return manutencoes.contains(m);
    }
}
