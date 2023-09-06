package Main;

public class CaixaDoAtacado extends MetodoPagamento {

    public float computaCompra (){


        return getValorTotal();
    }
    public void descontoPorUnidade (int quantidade){
        if (quantidade < 5){ //Até 5 unidades: valor total
            setPagamentoFinal(getValorTotal());
        } else if (quantidade >=15 && quantidade < 25) { // De 5 a 15 unidades: 10% de desconto
            setPagamentoFinal((float) (getValorTotal() - (getValorTotal() * 0.1)));
        } else if (quantidade >=5 && quantidade < 15) { // De 15 a 25 unidades: 20% de desconto
            setPagamentoFinal((float) (getValorTotal() - (getValorTotal() * 0.2)));
        } else if (quantidade > 25) { // Acima de 25 unidades: 25% de desconto
            setPagamentoFinal((float) (getValorTotal() - (getValorTotal() * 0.25)));
        }
    }
}
