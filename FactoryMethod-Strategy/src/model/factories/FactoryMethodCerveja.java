package model.factories;

import model.entities.*;

import java.util.Date;
import java.util.Random;
import java.util.Calendar;

public class FactoryMethodCerveja {

    Random random = new Random();
    int limite = 1000;

    public FactoryMethodCerveja() {}

    public Cerveja getCerveja(int opcao, int quantidade) {
        Calendar cal = Calendar.getInstance();
        Date dataProducao = cal.getTime();
        cal.add(Calendar.YEAR, 1);
        Date dataValidade = cal.getTime();
        int codigo;

        switch (opcao) {
            case 1:
                codigo = 1000 + random.nextInt(limite);
                return new CervejaPilsen(codigo, "Cerveja Pilsen", dataProducao, dataValidade, quantidade);
            case 2:
                codigo = 2000 + random.nextInt(limite);
                return new CervejaSemAlcool(codigo, "Cerveja sem Alcool", dataProducao, dataValidade, quantidade);
            case 3:
                codigo = 3000 + random.nextInt(limite);
                return new CervejaTrigo(codigo, "Cerveja de Trigo", dataProducao, dataValidade, quantidade);
            default:
                return null;
        }
    }
}
