package ExercicioAN01;

import java.util.ArrayList;

public class Contribuinte {
    private String codigo;
    private String nome;
    private ArrayList<Imovel> imoveis;

    //TODO: casos de teste

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
        if(codigo.trim().isEmpty()){
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
        //TODO: se ele for o mesmo imovel, não adicionar
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

    //Busca de imoveis por cliente
    public ArrayList<String> listarImoveis() {
        ArrayList<String> descricoes = new ArrayList<>();
        for (Imovel imovel : imoveis) {
            descricoes.add(imovel.getDescricao());
        }
        return descricoes;
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
    //TODO: consulta com os valores de cada imovel?
}
