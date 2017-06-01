package br.com.grands.fashionmanagerclient.modelo.combustivel;


import io.swagger.annotations.ApiModelProperty;

public class Bomba {

    @ApiModelProperty(value = "Id da bomba no software que está realizando a integração", required = true, position = 1)
    public Long idintegracao;

    @ApiModelProperty(value = "Nome da bomba de combustivel", required = true, position = 2)
    public String nome;

    @ApiModelProperty(value = "Número da bomba de combustível. Este número deve ser único por organização", required = true, position = 3)
    public String numero;


    public Bomba() {
    }

    public Bomba(Long idintegracao, String nome, String numero) {
        this.idintegracao = idintegracao;
        this.nome = nome;
        this.numero = numero;
    }
}
