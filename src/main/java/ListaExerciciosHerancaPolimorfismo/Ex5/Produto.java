package ListaExerciciosHerancaPolimorfismo.Ex5;

public abstract class Produto {
    private String nome;
    private float precoUnitario;
    private int quantidadeEstoque;

    public Produto(String nome, float precoUnitario, int quantidadeEstoque){
        setNome(nome);
        setPrecoUnitario(precoUnitario);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("Erro: Argumento Nome nao pode ser uma string vazia");
        }
        this.nome = nome;
    }

    public float getPrecoUnitario() {
        return this.precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        if(precoUnitario <= 0){
            throw new IllegalArgumentException("Erro: Argumento Preço Unitario deve ser positivo");
        }
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEstoque() {
        return this.quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if(quantidadeEstoque <0){
            throw new IllegalArgumentException("Erro: Argumento QuantidadeEstoque deve ser positivo ou nulo");
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void removerEstoque(int quantidade){
        if(quantidade <=0 ){
            throw new IllegalArgumentException("Erro: Argumento quantidade deve ser positiva");
        }
        if(quantidade > this.quantidadeEstoque){
            throw new IllegalArgumentException("Erro: Quantidade em estoque insuficiente");
        }
        setQuantidadeEstoque(getQuantidadeEstoque() - quantidade);
    }

    public void Comprar(){
        removerEstoque(getQuantidadeComprada());
    }
    public abstract int getQuantidadeComprada();
    public abstract float calcularPreco();
}
