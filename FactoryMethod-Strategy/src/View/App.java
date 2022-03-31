package View;

import model.entities.Cerveja;
import model.factories.FactoryMethodCerveja;
import model.strategies.PagamentoCartaoCredito;
import model.strategies.PagamentoCupom;
import model.strategies.PagamentoStrategy;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        FactoryMethodCerveja fabrica = new FactoryMethodCerveja();
        PagamentoStrategy strategy;
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem vindo a cervejaria do Júlio!");
        System.out.println("Cerveja Pilsen - [1]\nCerveja sem Álcool - [2]"+
                "\nCerveja Trigo - [3]");
        System.out.println("Insira a opção de cerveja a ser adquirida:");
        int opcao = scan.nextInt();
        System.out.println("Insira a quantidade de cerveja a ser adquirida:");
        int quantidade = scan.nextInt();



        Cerveja pedido = fabrica.getCerveja(opcao, quantidade);

        System.out.println("Selecione o método de pagamento "+
                " \n[1] Cartão de Crédito"+
                " \n[2] Cupom");
        int opcaoPagamento = scan.nextInt();

        if(opcaoPagamento == 1){
            strategy = new PagamentoCartaoCredito();
        }else{
            strategy = new PagamentoCupom();
        }

        strategy.receberDetalhesPagamento();
        if (!strategy.pagar(pedido.precoFinal())) {
            System.out.println("Ops. Houve algo de errado com o pedido, por favor faça-o novamente.");
        };
        System.out.println("\n\nSua cerveja está pronta:");
        System.out.println(pedido);



        scan.close();

    }

}
