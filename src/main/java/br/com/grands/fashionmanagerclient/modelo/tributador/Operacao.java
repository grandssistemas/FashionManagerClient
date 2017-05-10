package br.com.grands.fashionmanagerclient.modelo.tributador;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by gelatti on 03/11/16.
 */
public class Operacao {

    @ApiModelProperty(value = "Id da operação do software que esta usando integração", position = 1)
    public Long idintegracao;
    @ApiModelProperty(value = "Nome da operação", position = 2, required = true)
    public String nome;
}
