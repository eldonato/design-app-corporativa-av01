package model.strategies;

import model.entities.Cupom;

import java.util.Scanner;

public class PagamentoCupom implements PagamentoStrategy{

    Scanner scan = new Scanner(System.in);
    Cupom cupom;

    @Override
    public void receberDetalhesPagamento() {
        System.out.println("Insira o código do cupom: ");
        String codigo = scan.nextLine();
        System.out.println("Insira o valor do cupom: ");
        Double valor = scan.nextDouble();
        cupom = new Cupom(codigo, valor);

    }

    @Override
    public boolean pagar(double valorPagamento) {
        if (cupom == null) return false;

        System.out.println("Pagando utilizando o cupom "+cupom.getCodigoCupom());

        if(valorPagamento > cupom.getValorCupom()) {
            System.out.println("Valor do cupom insuficiente");
            return false;
        }

        System.out.println("Cupons são para um único uso");
        cupom.setValorCupom(0);
        return true;
    }


}
