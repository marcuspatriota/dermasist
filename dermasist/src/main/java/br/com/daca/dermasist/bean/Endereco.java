package br.com.daca.dermasist.bean;

/**
 * @author Elisângela
 */
public class Endereco {
    
    private String rua;
    private String cidade;
    private String bairro;
    private String cep;

    public Endereco(String endereco, String cidade, String bairro, String cep) {
        this.rua = endereco;
        this.cidade = cidade;
        this.bairro = bairro;
        this.cep = cep;
    }

    public String getEndereco() {
        return rua;
    }

    public void setEndereco(String endereco) {
        this.rua = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
    
}
