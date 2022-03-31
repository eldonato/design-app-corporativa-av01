package model.entities;

import java.util.Date;

public class CervejaPilsen extends Cerveja{

    public CervejaPilsen(int codigo, String nome, Date dataProducao, Date dataValidade, int quantidade) {
        super(codigo, nome, dataProducao, dataValidade, quantidade);
        this.setPreco(5.89);
    }

}
