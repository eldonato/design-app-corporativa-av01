package model.entities;

public class CartaoCredito {

    private double quantia;
    private final String numero;
    private final String data;
    private final String cvv;

    public CartaoCredito(String numero, String data, String cvv){
        this.quantia = 1000.0;
        this.numero = numero;
        this.cvv = cvv;
        this.data = data;
    }

    public void setQuantia(double quantia){
        this.quantia = quantia;
    }

    public double getQuantia(){
        return quantia;
    }

}
