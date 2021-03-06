package br.com.grands.fashionmanagerclient.modelo.produto;


import io.swagger.annotations.ApiModelProperty;

/**
 * Created by gelatti on 17/10/16.
 */
public class GrupoFiscalProduto {

    @ApiModelProperty(value = "Id do grupo fiscal do produto do software que esta usando integração", position = 1)
    public Long idintegracao;
    @ApiModelProperty(value = "Nome do grupo fiscal de produto", position = 2, required = true)
    public String nome;

    public GrupoFiscalProduto(){

    }

    public GrupoFiscalProduto(Long idintegracao, String nome) {
        this.idintegracao = idintegracao;
        this.nome = nome;
    }
}
