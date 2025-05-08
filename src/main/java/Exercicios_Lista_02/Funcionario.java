package Exercicios_Lista_02;

import java.util.Objects;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private String departamento;

    //construtor
    public Funcionario(String nome, String cargo, double salario, String departamento){
        setNome(nome);
        setCargo(cargo);
        setSalario(salario);
        setDepartamento(departamento);
    }

    //gets e sets
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        if(salario <= 0){
            throw new IllegalArgumentException("Erro: Argumento salario (double) deve ser positivo");
        }
        this.salario = salario;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        if(Objects.equals(departamento, "")){
            throw new IllegalArgumentException("Erro: Argumento departamento (String) não pode ser vazio");
        }
        this.departamento = departamento;
    }

    //Funções do exercicio 06
    public void receberAumento(double percentual){
        if(percentual <= 0){
            throw new IllegalArgumentException("Erro: Argumento percentual (double) deve ser positivo");
        }
        double aumento = this.salario * (percentual/100);
        setSalario(getSalario() + aumento);
    }

    public void mudarDepartamento(String departamento){
        setDepartamento(departamento);
    }

    public String exibirDados(){
        return this.nome + " " + this.cargo + " " + this.salario + " " + this.departamento;
    }
}
