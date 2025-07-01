package ExercicioAN02;

import java.util.ArrayList;

public class Cliente {
    private String codigo;
    private String nome;
    private ArrayList<ContasBancaria> contasBancarias;

    //TODO: ArrayList get set? consultas?
    //TODO: Consultas de contas por cliente e consulta com os saldos de cada conta

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
}
