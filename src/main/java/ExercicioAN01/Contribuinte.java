package ExercicioAN01;

import java.util.ArrayList;

public class Contribuinte {
    private String codigo;
    private String nome;
    private ArrayList<Imoveis> imoveis;

    //TODO: consulta de imoveis por contribuinte
    //TODO: consulta com os valores de cada imovel

    public Contribuinte(String codigo, String nome){
        setCodigo(codigo);
        setNome(nome);
        this.imoveis = new ArrayList<Imoveis>();
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

    public ArrayList<Imoveis> getImoveis(){
        return imoveis;
    }

    public void adicionarImovel(Imoveis imovel){
        this.imoveis.add(imovel);
    }

    public void removerImovel(Imoveis imovel){
        this.imoveis.remove(imovel);
    }

    public float calcularTotalIPTU(){
        float total = 0;
        for(Imoveis imovel: imoveis){
            total += imovel.getValorImovel();
        }
        return total;
    }

    public void listarImoveis(){
        for(Imoveis imovel: imoveis){
            imovel.getDescricao();
        }
    }
}
