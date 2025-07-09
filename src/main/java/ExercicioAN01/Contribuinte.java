package ExercicioAN01;

import java.util.ArrayList;

public class Contribuinte {
    private String codigo;
    private String nome;
    private ArrayList<Imovel> imoveis;

    public Contribuinte(String codigo, String nome){
        setCodigo(codigo);
        setNome(nome);
        this.imoveis = new ArrayList<Imovel>();
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

    public ArrayList<Imovel> getImoveis(){
        return imoveis;
    }

    public void adicionarImovel(Imovel imovel){
        if(imovel == null) {
            throw new IllegalArgumentException("Erro: Imóvel não pode ser nulo");
        }
        this.imoveis.add(imovel);
    }

    public void removerImovel(Imovel imovel){
        if(imovel == null) {
            throw new IllegalArgumentException("Erro: Imóvel não pode ser nulo");
        }
        if (!this.imoveis.contains(imovel)) {
            throw new IllegalArgumentException("Erro: Imóvel não encontrado na lista");
        }
        this.imoveis.remove(imovel);
    }

    public float calcularTotalIPTU(){
        float total = 0;
        for(Imovel imovel: imoveis){
            total += imovel.getValorImovel();
        }
        return total;
    }

   public String listarImoveis() {
        StringBuilder descricoes = new StringBuilder();
        for (Imovel imovel : imoveis) {
            descricoes.append(imovel.getDescricao()).append(", ");
        }
        return descricoes.toString();
    }

    public int getNumeroImoveis() {
        return imoveis.size();
    }

    public boolean buscarImovel(Imovel imovel){
        for(Imovel i: imoveis){
            if(i == imovel){
                return  true;
            }
        }
        return false;
    }
}
