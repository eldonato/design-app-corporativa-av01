package model.entities;

import java.util.Date;

public class CervejaTrigo extends Cerveja{

    public CervejaTrigo(int codigo, String nome, Date dataProducao, Date dataValidade, int quantidade) {
        super(codigo, nome, dataProducao, dataValidade, quantidade);
        this.setPreco(5.20);
    }

}