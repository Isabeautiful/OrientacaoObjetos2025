package Avaliacao1;

public class Venda extends Transacao{
    private Cliente cliente;

    public Venda(String dataVenda, Cliente cliente, Produto produto, int quantidadeVendida){
        super(dataVenda, produto, quantidadeVendida);
        setCliente(cliente);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        if(cliente == null){
            throw new IllegalArgumentException("Cliente invalido");
        }
        this.cliente = cliente;
    }


    //Numero 3
    public Boolean vender(Produto produto, int quantidade){
        boolean verifica = produto.verificarEstoqueInsuficiente(quantidade);
        if(verifica){
            String mensagem = "Não vendeu, quantidade invalida";
            return false;
        }
        else{
            produto.debilitarEstoque(quantidade);
            String mensagem = "Vendeu: " + produto.getPrecoUnitario() * quantidade;
            if(produto.verificarEstoqueBaixo()){
                mensagem += " Estoque baixo";
            }
            return true;
        }
    }

    public String getNomeCliente(){
        return cliente.getNome();
    }
}
