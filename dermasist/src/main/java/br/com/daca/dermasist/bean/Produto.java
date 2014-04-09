package br.com.daca.dermasist.bean;

import java.util.Date;

public class Produto {
    
    private String nome;
    private float valor;
    private Date dataDaCompra;
    private Date dataDeVencimento;
    private String finalidade;

    public Produto(String nome, float valor, Date dataDaCompra, Date dataDeVencimento, String finalidade) {
        this.nome = nome;
        this.valor = valor;
        this.dataDaCompra = dataDaCompra;
        this.dataDeVencimento = dataDeVencimento;
        this.finalidade = finalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getDataDaCompra() {
        return dataDaCompra;
    }

    public void setDataDaCompra(Date dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }

    public Date getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(Date dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public String getFinalidade() {
        return finalidade;
    }

    public void setFinalidade(String finalidade) {
        this.finalidade = finalidade;
    }
    
}
