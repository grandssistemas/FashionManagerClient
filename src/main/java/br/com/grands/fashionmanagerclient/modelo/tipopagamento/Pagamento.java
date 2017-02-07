package br.com.grands.fashionmanagerclient.modelo.tipopagamento;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class Pagamento {

    @ApiModelProperty(value = "Nome da forma de pagamento. Valores válidos: ['ESPECIE','BANCARIO','OUTROS']",required = true)
    private String pai;

    @ApiModelProperty(value="Lista de categorias de pagamento referentes à esta forma.", required = true)
    private List<CategoriaPagamento> categoria;


    public Pagamento() {
    }

    public Pagamento(String pai, List<CategoriaPagamento> categoria) {
        this.pai = pai;
        this.categoria = categoria;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public List<CategoriaPagamento> getCategoria() {
        return categoria;
    }

    public void setCategoria(List<CategoriaPagamento> categoria) {
        this.categoria = categoria;
    }
}
