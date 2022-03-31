package model.entities;

import java.util.Date;

public class CervejaSemAlcool extends Cerveja{

    public CervejaSemAlcool(int codigo, String nome, Date dataProducao, Date dataValidade, int quantidade) {
        super(codigo, nome, dataProducao, dataValidade, quantidade);
        this.setPreco(3.20);
    }

}
