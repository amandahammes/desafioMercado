package Main;

public class CaixaDoAtacado {
    public double valorTotal;
    public double valorComDescontoPagamento;
    Pedido pedido = new Pedido();

    public double computaCompra(){
        pedido.realizarPedido();
        pedido.calcularPedido();
        calcularDescontoPorPagamento();
        return valorTotal;
    }

    public void calcularDescontos(){
        valorTotal = pedido.getValorTotalDoPedido();
        calcularDescontoPorPagamento();
    }


    public double calcularDescontoPorPagamento (){
        switch (pedido.mostrarMetodoPagamento()){
            case 1: //debito, sem descontos
                valorTotal = pedido.getValorTotalDoPedido();
                System.out.println(valorTotal);
                break;
            case 2: //dinheiro - 5% de desconto
                valorTotal = pedido.getValorTotalDoPedido() - (pedido.getValorTotalDoPedido() * 0.05);
                System.out.println(valorTotal);
                break;
            case 3: //credito - 3% de acréscimo
                valorTotal = pedido.getValorTotalDoPedido() - (pedido.getValorTotalDoPedido() * 0.03);
                System.out.println(valorTotal);
                break;
            case 4:
                System.out.println("Opção de pagamento inválida. Digite novamente.");
                pedido.realizarPedido();
                break;
        }
        return valorTotal;
    }

    public double getValorComDescontoPagamento() {
        return valorComDescontoPagamento;
    }

    public void setValorComDescontoPagamento(double valorComDescontoPagamento) {
        this.valorComDescontoPagamento = valorComDescontoPagamento;
    }
}
