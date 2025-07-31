package Avaliacao2;

import java.util.ArrayList;

public class Funcionario extends Pessoa {
    private Cargo cargo;
    private Departamento departamento;
    private ArrayList<Dependente> dependentes;
    private ArrayList<Ocorrencia> ocorrencias;

    public Funcionario(String nome) {
        super(nome);
        this.dependentes = new ArrayList<Dependente>();
        this.ocorrencias = new ArrayList<Ocorrencia>();
    }

    public Cargo getCargo() {
        return this.cargo;
    }

    public void setCargo(Cargo cargo) {
        if(cargo == null){
            throw new IllegalArgumentException("Erro: cargo invalido");
        }
        this.cargo = cargo;
    }

    public Departamento getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Dependente> getDependentes() {
        return this.dependentes;
    }

    public ArrayList<Ocorrencia> getOcorrencias() {
        return this.ocorrencias;
    }

    //Numero 3
    public String getNomeDepartamento(){
        if(departamento == null){
            return "Funcionario sem departamento";
        }
        return departamento.getNome();
    }

    public void adicionarDependente(Dependente dependente){
        if(this.dependentes.contains(dependente)){
            throw new IllegalArgumentException("Dependente ja encontrado na lista");
        }
        this.dependentes.add(dependente);
    }

    public int getNumeroDependentes(){
        return this.dependentes.size();
    }

    //numero 2
    public ArrayList<String> listarNomeDependentes(){
        ArrayList<String> resultado = new ArrayList<String>();
        for(Dependente dependente: this.dependentes){
            resultado.add(dependente.getNome());
        }
        return resultado;
    }

    public void adicionarOcorrencia(Ocorrencia ocorrencia){
        if(this.ocorrencias.contains(ocorrencia)){
            throw new IllegalArgumentException("Ocorrencia ja encontrado na lista");
        }
        this.ocorrencias.add(ocorrencia);
    }

    public int getNumeroOcorrencias(){
        return this.ocorrencias.size();
    }

    //numero 1
    public float calcularSalarioLiquido(int mes, int ano){
        float salarioLiquido = 0f;
        //Buscar ocorrencia
        Ocorrencia ocorrencia = new Ocorrencia();
        for(Ocorrencia o: this.ocorrencias){
            if(mes == o.getMesOcorrencia() && ano == o.getAnoOcorrencia()){
                ocorrencia = o; //encontrou a ocorrencia correta
            }
        }

        if(ocorrencia.getTipoOcorrencia()){ //Se o tipo da ocorrencia é true, é acrecimo
            salarioLiquido += ocorrencia.getValorOcorrencia();
        }
        else{//Senão, é subtração
            salarioLiquido -= ocorrencia.getValorOcorrencia();
        }

        //acrescentar 100,00 para cada dependente
        int countDependente = 0;
        for(Dependente dependente: this.dependentes){
            countDependente++;
        }
        float acrescimoDependente = countDependente*100;

        return (salarioLiquido + acrescimoDependente);

    }

    public ArrayList<Dependente> retornarDependentes(){
        return this.dependentes;
    }
}
