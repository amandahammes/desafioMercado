package Main;

public class MetodoPagamento {
    private String formaPagamento;
    private float valorTotal;
    private int pagamento;
    private float pagamentoFinal;

    public void calculaDesconto (int pagamento){
        switch (pagamento){
            case 1: //debito, sem descontos
                pagamentoFinal = (float) (valorTotal);
                System.out.println(pagamentoFinal);
                break;
            case 2: //dinheiro - 5% de desconto
                pagamentoFinal = (float) (valorTotal - (valorTotal * 0.05));
                System.out.println(pagamentoFinal);
                break;
            case 3: //credito - 3% de acréscimo
                pagamentoFinal = (float) (valorTotal + (valorTotal * 0.03));
                System.out.println(pagamentoFinal);
                break;
            default:
                System.out.println("Opção de pagamento inválida. Digite novamente.");
                //chamar método para opção dos números aqui.
        }
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getPagamento() {
        return pagamento;
    }

    public void setPagamento(int pagamento) {
        this.pagamento = pagamento;
    }

    public float getPagamentoFinal() {
        return pagamentoFinal;
    }

    public void setPagamentoFinal(float pagamentoFinal) {
        this.pagamentoFinal = pagamentoFinal;
    }
}
