package br.com.grands.fashionmanagerclient.modelo.pessoa;

import io.swagger.annotations.ApiModelProperty;


public class Endereco {

    @ApiModelProperty(value = "CEP do endereço", position = 1, required = true)
    public String cep;
    @ApiModelProperty(value = "Tipo do Logradouro do endereço (Rua, Avenida, Praça ...)", position = 2, required = true)
    public String tipoLogradouro;
    @ApiModelProperty(value = "Logradouro do endereço", position = 3, required = true)
    public String logradouro;
    @ApiModelProperty(value = "Número do endereço", position = 4, required = true)
    public String numero;
    @ApiModelProperty(value = "Complemento do endereço", position = 5)
    public String complemento;
    @ApiModelProperty(value = "Bairro do endereço", position = 6, required = true)
    public String bairro;
    @ApiModelProperty(value = "Cidade do endereço", position = 7, required = true)
    public String cidade;
    @ApiModelProperty(value = "Estado do endereço", position = 8,required = true)
    public String estado;
    @ApiModelProperty(value = "País do endereço", position = 9, required = true)
    public String pais;
    @ApiModelProperty(value = "Código do IBGE da cidade do endereço", position = 10)
    public String codigoIBGE;
}
