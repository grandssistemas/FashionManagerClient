package br.com.grands.fashionmanagerclient.modelo.pessoa;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by gelatti on 03/11/16.
 */
public class GrupoFiscalPessoa {

    @ApiModelProperty(value = "Id do grupo fiscal de pessoa do software que esta usando integração", position = 1)
    private Long id;
    @ApiModelProperty(value = "Nome do grupo fiscal de pessoa", position = 2)
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
