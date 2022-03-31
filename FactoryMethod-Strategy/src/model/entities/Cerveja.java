package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;


public abstract class Cerveja {

    private int codigo;
    private String nome;
    private double preco;
    private Date dataProducao;
    private Date dataValidade;
    private int quantidade;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Cerveja(int codigo, String nome, Date dataProducao, Date dataValidade, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataProducao = dataProducao;
        this.dataValidade = dataValidade;
        this.quantidade = quantidade;
    }

    public double precoFinal(){
        return preco * quantidade;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double d) {
        this.preco = d;
    }

    public Date getDataProducao() {
        return dataProducao;
    }

    public void setDataProducao(Date dataProducao) {
        this.dataProducao = dataProducao;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String toString() {
        return nome + "\nPreço: R$" + preco +
                "\nQuantidade: "+ quantidade +
                "\nPreco final:"+precoFinal()+
                "\nCódigo: "+ codigo +
                "\nData de Produção: "+sdf.format(dataProducao)+
                "\nData de Validade: " + sdf.format(dataValidade);
    }


}
