package br.com.grands.fashionmanagerclient.modelo.pessoa;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by gelatti on 03/11/16.
 */
public class GrupoFiscalPessoa {

    @ApiModelProperty(value = "Id do grupo fiscal de pessoa do software que esta usando integração", position = 1)
    public Long id;
    @ApiModelProperty(value = "Nome do grupo fiscal de pessoa", position = 2, required = true)
    public String nome;

    public GrupoFiscalPessoa(){
    }

    public GrupoFiscalPessoa(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }
}
