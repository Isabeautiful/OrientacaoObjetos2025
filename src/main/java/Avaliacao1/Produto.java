package Avaliacao1;

public class Produto {
    private String nome;
    private  int quantidadeEstoque;
    private int precoUnitario;
    private int estoqueMinimo;
    private int estoqueMaximo;
    private Transacao historico;

    public Produto(String nome, int quantidadeEstoque, int precoUnitario, int estoqueMinimo, int estoqueMaximo){
        setNome(nome);
        setQuantidadeEstoque(quantidadeEstoque);
        setPrecoUnitario(precoUnitario);
        setEstoqueMinimo(estoqueMinimo);
        setEstoqueMaximo(estoqueMaximo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        if(quantidadeEstoque < 0){
            throw new IllegalArgumentException("quantidade estoque negativa");
        }
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(int precoUnitario) {
        if(precoUnitario < 0){
            throw new IllegalArgumentException("preço negativo");
        }
        this.precoUnitario = precoUnitario;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        if(estoqueMinimo < 0){
            throw new IllegalArgumentException("estoque minimo negativo");
        }
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(int estoqueMaximo) {
        if(estoqueMaximo < 0){
            throw new IllegalArgumentException("estoque maximo negativo");
        }
        this.estoqueMaximo = estoqueMaximo;
    }

    public Transacao getHistorico() {
        return historico;
    }

    public void setHistorico(Transacao historico) {
        this.historico = historico;
    }

    //letra a
    public void debilitarEstoque(int numero){
        //verificarEstoqueInsuficiente
        if(numero < 0){
            throw new IllegalArgumentException("Quantidade de debilitação negativa");
        }
        //talvez fazer no setEstoque
        if(getQuantidadeEstoque() < getEstoqueMinimo()){
            throw new IllegalArgumentException("Estoque menor que a quantidade minima");
        }
        setQuantidadeEstoque(getQuantidadeEstoque() - numero);
    }

    //letra b
    public void creditarEstoque(int numero){
        //verificarEstoqueExcedente

        if(numero < 0){
            throw new IllegalArgumentException("Quantidade de creditação negativa");
        }
        //talvez fazer no setEstoque
        if(getQuantidadeEstoque() > getEstoqueMaximo()){
            throw new IllegalArgumentException("Estoque maior que a quantidade maxima");
        }
        setQuantidadeEstoque(getQuantidadeEstoque() + numero);
    }

    //letra c
    public boolean verificarEstoqueBaixo(){
        return getQuantidadeEstoque() < getEstoqueMinimo();
    }

    //letra d
    public boolean verificarEstoqueInsuficiente(int quantidade){
        return quantidade > getQuantidadeEstoque();
    }

    //letra e
    public boolean verificarEstoqueExcedente(int quantidade){
        return (quantidade + getQuantidadeEstoque()) > getEstoqueMaximo();
    }

    //letra f
    public float calcularValorVenda(int quantidadeComprada){
        if(quantidadeComprada < 0){
            throw new IllegalArgumentException("Quantidade comprada negativa");
        }
        return precoUnitario * quantidadeComprada;
    }

    //letra g
    public void vender(String data, Cliente cliente, Produto produto, int quantidade){
        Venda venda = new Venda(data, cliente, produto, quantidade);
        boolean verifica = venda.vender(produto, quantidade);
        if(verifica){
            registraHistorico(data, produto, quantidade);
        }
    }

    //letra h
    public void comprar(String data, Fornecedor fornecedor, Produto produto, int quantidade, int precoUnitario){
        Compra compra = new Compra(data, produto, fornecedor, quantidade, precoUnitario);
        boolean verifica = compra.comprar(produto, quantidade);
        if(verifica){
            registraHistorico(data, produto, quantidade);
        }
    }

    //letra i
    public void registraHistorico(String data, Produto produto, int quantidade){
        Transacao transacao = new Transacao(data, produto, quantidade);
        setHistorico(transacao);
    }

    //letra j
    public String exibeHistorico(){
        return historico.getProduto() + " " + historico.getQuantidade() + " " +historico.getDataTransacao();
    }
}
