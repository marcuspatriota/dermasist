package br.com.daca.dermasist.bean;

/**
 * @author Elisângela
 */
public class Paciente {
    
    private Pessoa pessoa;
    private Endereco endereco;
    private String nomeDaMae;
    private char tipoSanguineo;
    private String cor;
    private String contatoEmergencia;
    private String convenio;
    private String cartaoSus;
    

    public Paciente(Pessoa pessoa, Endereco endereco, String nomeDaMae, char tipoSanguineo, String cor, String contatoEmergencia, String convenio, String cartaoSus) {
        this.pessoa = pessoa;
        this.endereco = endereco;
        this.nomeDaMae = nomeDaMae;
        this.tipoSanguineo = tipoSanguineo;
        this.cor = cor;
        this.contatoEmergencia = contatoEmergencia;
        this.convenio = convenio;
        this.cartaoSus = cartaoSus;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public char getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(char tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getContatoEmergencia() {
        return contatoEmergencia;
    }

    public void setContatoEmergencia(String contatoEmergencia) {
        this.contatoEmergencia = contatoEmergencia;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getCartaoSus() {
        return cartaoSus;
    }

    public void setCartaoSus(String cartaoSus) {
        this.cartaoSus = cartaoSus;
    }
}
