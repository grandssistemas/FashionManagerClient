package br.com.grands.fashionmanagerclient.modelo.pessoa;

import io.swagger.annotations.ApiModelProperty;


public class Endereco {

    @ApiModelProperty(value = "CEP do endereço", position = 1, required = true)
    private String cep;
    @ApiModelProperty(value = "Tipo do Logradouro do endereço (Rua, Avenida, Praça ...)", position = 2, required = true)
    private String tipoLogradouro;
    @ApiModelProperty(value = "Logradouro do endereço", position = 3, required = true)
    private String logradouro;
    @ApiModelProperty(value = "Número do endereço", position = 4, required = true)
    private String numero;
    @ApiModelProperty(value = "Complemento do endereço", position = 5)
    private String complemento;
    @ApiModelProperty(value = "Bairro do endereço", position = 6, required = true)
    private String bairro;
    @ApiModelProperty(value = "Cidade do endereço", position = 7, required = true)
    private String cidade;
    @ApiModelProperty(value = "Estado do endereço", position = 8,required = true)
    private String estado;
    @ApiModelProperty(value = "País do endereço", position = 9, required = true)
    private String pais;
    @ApiModelProperty(value = "Código do IBGE da cidade do endereço", position = 10)
    private String codigoIBGE;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigoIBGE() {
        return codigoIBGE;
    }

    public void setCodigoIBGE(String codigoIBGE) {
        this.codigoIBGE = codigoIBGE;
    }
}
