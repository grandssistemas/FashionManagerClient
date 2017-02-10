package br.com.grands.fashionmanagerclient.modelo.tipopagamento;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class CategoriaPagamento {

    @ApiModelProperty(value = "ID da categoria de pagamento do software que esta usando a integração",position = 1, required = true)
    private Long id;
    @ApiModelProperty(value = "Nome da categoria de pagamento", position = 2, required = true)
    private String nome;
    @ApiModelProperty(value = "Lista dos tipos de pagamento da categoria", position = 3, required = true)
    private List<TipoPagamento> tipoPagamento;

    public CategoriaPagamento() {
    }

    public CategoriaPagamento(Long id, String nome, List<TipoPagamento> tipoPagamento) {
        this.id = id;
        this.nome = nome;
        this.tipoPagamento = tipoPagamento;
    }

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

    public List<TipoPagamento> getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(List<TipoPagamento> tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
