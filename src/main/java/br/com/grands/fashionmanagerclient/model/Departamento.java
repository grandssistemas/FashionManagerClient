package br.com.grands.fashionmanagerclient.model;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by gelatti on 17/10/16.
 */
public class Departamento {

    @ApiModelProperty(value = "Id do departamento", position = 1)
    private Long id;
    @ApiModelProperty(value = "Nome do departamento", position = 2)
    private String nome;
    @ApiModelProperty(value = "Categoria que este departamento possui", position = 3)
    private Categoria categoria;

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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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
