package ExercicioAN02;

import java.util.ArrayList;

public class Cliente {
    private String codigo;
    private String nome;
    private ArrayList<ContasBancaria> contasBancarias;

    public Cliente(String codigo, String nome){
        setCodigo(codigo);
        setNome(nome);
        this.contasBancarias = new ArrayList<ContasBancaria>();
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        if(codigo.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: Codigo invalido, string vazia");
        }
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: Nome invalido, string vazia");
        }
        this.nome = nome;
    }

    public ArrayList<ContasBancaria> getContasBancarias(){
        return contasBancarias;
    }

    public void adicionarContaBancaria(ContasBancaria contasBancaria){
        if(contasBancaria == null){
            throw new IllegalArgumentException("Erro: conta bancaria nao pode ser nula");
        }
        this.contasBancarias.add(contasBancaria);
    }

    public void removerContaBancaria(ContasBancaria contasBancaria){
        if(contasBancaria == null){
            throw  new IllegalArgumentException("Erro: Conta bancaria nao pode ser nula");
        }
        if(!this.contasBancarias.contains(contasBancaria)){
            throw new IllegalArgumentException("Erro: Conta bancaria nao encontrada na lista");
        }
        this.contasBancarias.remove(contasBancaria);
    }

    public String listarContas(){
        StringBuilder listagemContas = new StringBuilder();
        for (ContasBancaria contasBancaria: contasBancarias){
            listagemContas.append(contasBancaria.getDescricao()).append(", ");
        }
        return listagemContas.toString();
    }

    public int getNumeroContas(){
        return contasBancarias.size();
    }

    public boolean buscarConta(ContasBancaria contasBancaria){
        for(ContasBancaria c : contasBancarias){
            if(c == contasBancaria){
                return true;
            }
        }
        return false;
    }

    public float calcularSaldoTotal() {
        float total = 0;
        for (ContasBancaria conta : contasBancarias) {
            total += conta.getSaldo();
        }
        return total;
    }
}
