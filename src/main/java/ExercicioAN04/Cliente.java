package ExercicioAN04;

import java.util.ArrayList;

public class Cliente {
    private String codigo;
    private String nome;
    private ArrayList<Frete> fretes;

    public Cliente(String codigo, String nome){
        setCodigo(codigo);
        setNome(nome);
        this.fretes = new ArrayList<Frete>();
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        if(codigo.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: Código inválido, string vazia");
        }
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: Nome inválido, string vazia");
        }
        this.nome = nome;
    }

    public void adicionarFrete(Frete frete){
        if(frete == null){
            throw new IllegalArgumentException("Erro: Frete não pode ser nulo");
        }
        this.fretes.add(frete);
    }

    public void removerFrete(Frete frete){
        if(frete == null){
            throw new IllegalArgumentException("Erro: Frete não pode ser nulo");
        }
        if(!this.fretes.contains(frete)){
            throw new IllegalArgumentException("Erro: Frete não encontrado");
        }
        this.fretes.remove(frete);
    }

    public float calcularTotalFretes(){
        float total = 0;
        for(Frete frete : fretes){
            total += frete.getValorFrete();
        }
        return total;
    }

    public String listarFretes(){
        StringBuilder descricoes = new StringBuilder();
        for(Frete frete : fretes){
            descricoes.append(frete.getDescricao()).append(", ");
        }
        return descricoes.toString();
    }

    public int getNumeroFretes(){
        return fretes.size();
    }

    public boolean buscarFrete(Frete frete){
        for(Frete f : fretes){
            if(f == frete){
                return true;
            }
        }
        return false;
    }
}
