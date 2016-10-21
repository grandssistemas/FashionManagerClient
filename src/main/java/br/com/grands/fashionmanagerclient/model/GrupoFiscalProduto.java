package br.com.grands.fashionmanagerclient.model;


import io.swagger.annotations.ApiModelProperty;

/**
 * Created by gelatti on 17/10/16.
 */
public class GrupoFiscalProduto {

    @ApiModelProperty(value = "Id do grupo fiscal do produto", position = 1)
    private Long id;
    @ApiModelProperty(value = "Nome do grupo fiscal de produto", position = 2)
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
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
