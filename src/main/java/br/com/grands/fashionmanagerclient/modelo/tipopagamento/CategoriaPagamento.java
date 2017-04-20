package br.com.grands.fashionmanagerclient.modelo.tipopagamento;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class CategoriaPagamento {

    @ApiModelProperty(value = "ID da categoria de pagamento do software que esta usando a integração",position = 1, required = true)
    public Long id;
    @ApiModelProperty(value = "Nome da categoria de pagamento", position = 2, required = true)
    public String nome;
    @ApiModelProperty(value = "Lista dos tipos de pagamento da categoria", position = 3, required = true)
    public List<TipoPagamento> tipoPagamento;

    public CategoriaPagamento() {
    }

    public CategoriaPagamento(Long id, String nome, List<TipoPagamento> tipoPagamento) {
        this.id = id;
        this.nome = nome;
        this.tipoPagamento = tipoPagamento;
    }
}
