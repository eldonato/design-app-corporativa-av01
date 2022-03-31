package model.strategies;

import model.entities.CartaoCredito;

import java.util.Scanner;

public class PagamentoCartaoCredito implements PagamentoStrategy {

    Scanner scan = new Scanner(System.in);
    private CartaoCredito cartao;



    @Override
    public void receberDetalhesPagamento() {
        System.out.println("Insira o número do cartão de crédito: ");
        String numero = scan.nextLine();
        System.out.println("Insira a data de validade do cartão de crédito: ");
        String data = scan.nextLine();
        System.out.println("Insira o cvv do cartão de crédito: ");
        String cvv = scan.nextLine();

        cartao = new CartaoCredito(numero, data, cvv);
    }

    @Override
    public boolean pagar(double valorPagamento) {
        if (cartao == null) return false;

        System.out.println("Quantidade de parcelas: \n1 = "+valorPagamento+
                "\n2 = "+(valorPagamento/2)+
                "\n3 = "+ (valorPagamento/3));
        double parcela = scan.nextDouble();
        double valorParcelado = valorPagamento/parcela;

        System.out.println("Pagando "+ valorPagamento);
        System.out.println("Em "+parcela+" parcelas de: "+valorParcelado);
        cartao.setQuantia(cartao.getQuantia() - valorPagamento);

        return true;
    }


}
