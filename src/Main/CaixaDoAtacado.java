package Main;

public class CaixaDoAtacado {
    private float valorTotal;
    private int pagamento;
    private float pagamentoFinal;


    public float computaCompra (){


        return valorTotal;
    }

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

    public void descontoPorUnidade (int quantidade){
        if (quantidade < 5){ //Até 5 unidades: valor total
            valorTotal = valorTotal;
        } else if (quantidade >=15 && quantidade < 25) { // De 5 a 15 unidades: 10% de desconto
            valorTotal = (float) (valorTotal - (valorTotal * 0.1));
        } else if (quantidade >=5 && quantidade < 15) { // De 15 a 25 unidades: 20% de desconto
            valorTotal = (float) (valorTotal - (valorTotal * 0.2));
        } else if (quantidade > 25) { // Acima de 25 unidades: 25% de desconto
            valorTotal = (float) (valorTotal - (valorTotal * 0.25));
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
