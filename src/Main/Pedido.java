package Main;

import Utils.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    public int[][] pedido;
    public String metodoPagamento;
    public int n, c=2, i, j;
    private ArrayList<Produto> listaDeItens = new ArrayList();
    public int[][] produto = new int[getN()][2];
    public int quantidade;
    public double valorQuantidade = 0;
    public double valorPedidoProduto = 0;
    private double valorTotalDoPedido = 0.0;
    Produto cafe = new Produto(01, "Café - 1 kg", 53.00);
    Produto sabao = new Produto(02, "Sabão em Pó", 36.00);
    Produto leite = new Produto(03, "Caixa de Leite", 82.00);
    Produto refrigerante = new Produto(04, "Refrigerante", 8.50);
    public String mensagem = """
            Digite seu pedido seguindo o exemplo abaixo:
            credito
            1,2
            2,1
                            
            Sendo o primeiro número o ID do item e o segundo a quantidade do item.
            """;

    Scanner scan = new Scanner(System.in);

    public void realizarPedido() {
        System.out.println("Digite o número de itens que fará parte do seu pedido: ");
        setN(Input.inputInt());

        System.out.println(mensagem);
        metodoPagamento = Input.inputString();
        produto = new int[n][c];
        for (i = 0; i < n; i++) {
            for (j = 0; j < c; j++) {
                produto[i][j] = scan.nextInt();
            }
        }
    }

//    public void separarPedidoProduto() {
//        int linhas = getN();
//        for (i = 0; i < linhas; i++) {
//            produto[i] = pedido[i][];
//        }
//    }

    public int mostrarMetodoPagamento(){
        if(metodoPagamento.equals("debito")){
            return 1;
        } else if (metodoPagamento.equals("credito")) {
            return 3;
        } else if (metodoPagamento.equals("dinheiro")) {
            return 2;
        } else {
            return 0;
        }
    }
    public void calcularPedido(){
        //separarPedidoProduto();
        for (int i = 0; i < getN(); i++){
            quantidade = produto[i][1];
            switch (produto[i][0]){
                case 1:
                    calcularDescontoPorUnidade(quantidade);
                    valorTotalDoPedido =+ ((produto[i][1] * (cafe.getPreco())) * valorQuantidade);
                    break;
                case 2:
                    calcularDescontoPorUnidade(quantidade);
                    valorTotalDoPedido =+ ((produto[i][1] * (sabao.getPreco())) * valorQuantidade);
                    break;
                case 3:
                    calcularDescontoPorUnidade(quantidade);
                    valorTotalDoPedido =+ ((produto[i][1] * (leite.getPreco())) * valorQuantidade);
                    break;
                case 4:
                    calcularDescontoPorUnidade(quantidade);
                    valorTotalDoPedido =+ ((produto[i][1] * (refrigerante.getPreco())) * valorQuantidade);
                    break;
                default:
                    System.out.println("Produto não encontrado");
                    break;
            }
        }
    }

    public double calcularDescontoPorUnidade (int quantidade){
        if (quantidade < 5){
            valorQuantidade = 1;
        } else if (quantidade >=15 && quantidade < 25) {
            valorQuantidade = 0.9;
        } else if (quantidade >=5 && quantidade < 15) {
            valorQuantidade = 0.8;
        } else if (quantidade > 25) {
           valorQuantidade = 0.75;
        }
        return valorQuantidade;
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
