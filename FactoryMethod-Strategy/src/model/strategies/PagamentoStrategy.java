package model.strategies;

public interface PagamentoStrategy {
    void receberDetalhesPagamento();
    boolean pagar(double valorPagamento);
}
