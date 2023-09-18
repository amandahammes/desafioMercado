package Main;

public class Main {
    public static void main(String[] args) {
        CaixaDoAtacado caixa = new CaixaDoAtacado();
        caixa.computaCompra();
        System.out.println(caixa.valorTotal);
    }
}