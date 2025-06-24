package Avaliacao1;

public class Compra extends Transacao{
    private int precoUnitario;
    private Fornecedor fornecedor;

    public Compra(String dataCompra, Produto produto, Fornecedor fornecedor, int quantidadeComprada, int precoUnitario){
        super(dataCompra, produto, quantidadeComprada);
        setFornecedor(fornecedor);
        setPrecoUnitario(precoUnitario);
    }

    public int getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(int precoUnitario) {
        if(precoUnitario < 0){
            throw new IllegalArgumentException("Preço negativo");
        }
        this.precoUnitario = precoUnitario;
    }

    public Fornecedor getFornecedor() {
        return this.fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        if(fornecedor == null){
            throw new IllegalArgumentException("Fornecedor invalido");
        }
        this.fornecedor = fornecedor;
    }

    //Numero 2
    public Boolean comprar(Produto produto, int quantidade){
        boolean verifica = produto.verificarEstoqueExcedente(quantidade);
        if(verifica){
            String mensagem = "Não comprou, quantidade invalida";
            return false;
        }
        else{
            produto.creditarEstoque(quantidade);
            String mensagem = "Valor da Compra: " + produto.getPrecoUnitario() * quantidade;
            if(produto.verificarEstoqueExcedente(quantidade)){
                mensagem += "Estoque cheio";
            }
            return true;
        }
    }

    public String getNomeFornecedor(){
        return fornecedor.getNome();
    }
}
