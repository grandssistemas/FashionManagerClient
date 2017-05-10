package br.com.grands.fashionmanagerclient.modelo.produto;

import io.swagger.annotations.ApiModelProperty;

public class Marca {

    @ApiModelProperty(value = "Id da marca no software que está realizando a integração", position = 1, required = true)
    public Long idintegracao;

    @ApiModelProperty(value = "Nome da marca", position = 2, required = true)
    public String nome;

    public Marca() {
    }

    public Marca(Long idintegracao, String nome) {
        this.idintegracao = idintegracao;
        this.nome = nome;
    }
}
