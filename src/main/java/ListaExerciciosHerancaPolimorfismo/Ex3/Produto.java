package ListaExerciciosHerancaPolimorfismo.Ex3;

public abstract class Produto {
    private String nome;
    private double precoBase;

    public Produto(String nome, double precoBase){
        setNome(nome);
        setPrecoBase(precoBase);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome.trim().equals("")){
            throw new IllegalArgumentException("Erro: Argumento nome nao pode ser uma string vazia");
        }
        this.nome = nome;
    }

    public double getPrecoBase() {
        return this.precoBase;
    }

    public void setPrecoBase(double precoBase) {
        if(precoBase <= 0){
            throw new IllegalArgumentException("Erro: Argumento Preco Base deve ser positivo");
        }
        this.precoBase = precoBase;
    }

    public abstract double calcularPreco();

}
