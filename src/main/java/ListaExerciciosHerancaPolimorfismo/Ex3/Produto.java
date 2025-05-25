package ListaExerciciosHerancaPolimorfismo.Ex3;

public abstract class Produto {
    private String nome;
    private float precoBase;

    public Produto(String nome, float precoBase){
        setNome(nome);
        setPrecoBase(precoBase);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: Argumento nome nao pode ser uma string vazia");
        }
        this.nome = nome;
    }

    public float getPrecoBase() {
        return this.precoBase;
    }

    public void setPrecoBase(float precoBase) {
        if(precoBase <= 0){
            throw new IllegalArgumentException("Erro: Argumento Preco Base deve ser positivo");
        }
        this.precoBase = precoBase;
    }

    public abstract float getDescontoPorcentagem();

    public double calcularPreco(){
        return getPrecoBase() - (this.getDescontoPorcentagem() * getPrecoBase());
    }


}
