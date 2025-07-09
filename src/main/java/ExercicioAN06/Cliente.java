package ExercicioAN06;

import java.util.ArrayList;

public class Cliente {
    private String codigo;
    private String nome;
    private ArrayList<Vaga> vagas;

    public Cliente(String codigo, String nome){
        setCodigo(codigo);
        setNome(nome);
        this.vagas = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if(codigo.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: código inválido");
        }
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: nome inválido");
        }
        this.nome = nome;
    }

    public void adicionarVaga(Vaga vaga){
        if(vaga == null){
            throw new IllegalArgumentException("Erro: vaga nula");
        }
        this.vagas.add(vaga);
    }

    public void removerVaga(Vaga vaga){
        if(vaga == null || !vagas.contains(vaga)){
            throw new IllegalArgumentException("Erro: vaga inválida");
        }
        this.vagas.remove(vaga);
    }

    public float calcularTotalAluguel(){
        float total = 0;
        for(Vaga v : vagas){
            total += v.getValorAluguel();
        }
        return total;
    }

    public String listarVagas(){
        StringBuilder sb = new StringBuilder();
        for(Vaga v : vagas){
            sb.append(v.getDescricao()).append(", ");
        }
        return sb.toString();
    }

    public int getNumeroVagas(){
        return vagas.size();
    }

    public boolean buscarVaga(Vaga vaga){
        return vagas.contains(vaga);
    }
}
