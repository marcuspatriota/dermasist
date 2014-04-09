package br.com.daca.dermasist.bean;

/**
 * @author Elisângela
 */
public class Paciente {
    
    private Pessoa pessoa;
    private String nomeDaMae;
    private String tipoSanguineo;
    private String cor;
    private String telefone;
    private String contatoEmergencia;
    private String convenio;
    private String cartaoSus;
    private int peso;
    private float altura;

    public Paciente() {
    }

    public Paciente(Pessoa pessoa, String nomeDaMae, String tipoSanguineo, String cor, String telefone, String contatoEmergencia, String convenio, String cartaoSus, int peso, float altura) {
        this.pessoa = pessoa;
        this.nomeDaMae = nomeDaMae;
        this.tipoSanguineo = tipoSanguineo;
        this.cor = cor;
        this.telefone = telefone;
        this.contatoEmergencia = contatoEmergencia;
        this.convenio = convenio;
        this.cartaoSus = cartaoSus;
        this.peso = peso;
        this.altura = altura;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}
