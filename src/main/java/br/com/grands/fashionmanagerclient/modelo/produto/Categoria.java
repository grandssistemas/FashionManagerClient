package br.com.grands.fashionmanagerclient.modelo.produto;


import io.swagger.annotations.ApiModelProperty;

/**
 * Created by gelatti on 17/10/16.
 */
public class Categoria {

    @ApiModelProperty(value = "ID da categoria do software que esta usando integração", position = 1)
    private Long id;
    @ApiModelProperty(value = "Nome da categoria", position = 2)
    private String nome;
    @ApiModelProperty(value = "Tipo de produto que esta categoria possui", position = 3)
    private TipoProduto tipoProduto;

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

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
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
