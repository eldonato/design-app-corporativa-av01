package model.entities;

public class Cupom {

    private String codigoCupom;
    private double valorCupom;

    public Cupom(String codigoCupom, double valorCupom){
        this.codigoCupom = codigoCupom;
        this.valorCupom = valorCupom;
    }

    public String getCodigoCupom() {
        return codigoCupom;
    }

    public void setCodigoCupom(String codigoCupom) {
        this.codigoCupom = codigoCupom;
    }

    public double getValorCupom(){
        return valorCupom;
    }

    public void setValorCupom(double valorCupom){
        this.valorCupom = valorCupom;
    }
}
