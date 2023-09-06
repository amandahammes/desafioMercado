package Main;

import Utils.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    public int pedido[][];
    public String metodoPagamento;
    public int n, c=2, i, j;
    private ArrayList<Menu> listaDeItens = new ArrayList();
    private double valorTotalDoPedido = 0.0;
    public String mensagem = """
            Digite seu pedido seguindo o exemplo abaixo:
            credito
            1,2
            2,1
                            
            Sendo o primeiro número o ID do item e o segundo a quantidade do item.
            """;

    Scanner scan = new Scanner(System.in);
    public void realizarPedido() {
        System.out.println("Digite o método de pagamento: débito, crétido ou dinheiro: ");
        metodoPagamento = Input.inputString();

        System.out.println("Digite o número de itens que fará parte do seu pedido: ");
        setN(Input.inputInt());

        System.out.println(mensagem);
        pedido = new int[n][c];
        for (i = 0; i < n; i++) {
            for (j = 0; j < c; j++) {
                pedido[i][j] = scan.nextInt();
            }
        }
    }

    public void separarPedido() {

    }

    public void mostrarPedido() {
        for (i = 0; i < getN(); i++) {
            for (j = 0; j < c; j++) {
                System.out.println(pedido[i][j]);
            }
        }
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public double getValorTotalDoPedido() {
        return valorTotalDoPedido;
    }

    public void setValorTotalDoPedido(double valorTotalDoPedido) {
        this.valorTotalDoPedido = valorTotalDoPedido;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
