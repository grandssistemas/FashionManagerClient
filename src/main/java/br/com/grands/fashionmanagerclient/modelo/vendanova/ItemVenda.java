package br.com.grands.fashionmanagerclient.modelo.vendanova;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public class ItemVenda {

    @ApiModelProperty(value = "Código de barras do produto relacionado à este item da venda", required = true)
    public String codigobarras;

    @ApiModelProperty(value = "Quantidade do item a ser vendido. O padrão desse valor é a quantidade de baixa do código de barras do item")
    public BigDecimal quantidade;

    @ApiModelProperty(value = "Valor unitário que o item foi vendido. O valor padrão desse campo é o valor de venda do código de barras do item")
    public BigDecimal valorunitario;
    @ApiModelProperty("Valor do desconto dado no item. O valor padrão desse campo é zero")
    public BigDecimal valordesconto = BigDecimal.ZERO;
    @ApiModelProperty(value = "Valor liquido pelo qual o item foi vendido. Esse campo deve ser igual ao valor unitário menos o valor do desconto. " +
            "O valor padrão desse campo é o valor de venda do código de barras do item")
    public BigDecimal valortotal;

    public ItemVenda() {
    }

    public ItemVenda(String codigobarras) {
        this.codigobarras = codigobarras;
    }

    public ItemVenda(String codigobarras, BigDecimal quantidade, BigDecimal valorunitario, BigDecimal valordesconto, BigDecimal valortotal) {
        this.codigobarras = codigobarras;
        this.quantidade = quantidade;
        this.valorunitario = valorunitario;
        this.valordesconto = valordesconto;
        this.valortotal = valortotal;
    }
}
