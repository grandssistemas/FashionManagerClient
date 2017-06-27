package br.com.grands.fashionmanagerclient.modelo.vendanova;


import br.com.grands.fashionmanagerclient.modelo.vendanova.enums.TipoPagamento;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public class Pagamento {

    @ApiModelProperty(value = "Id do pagamento no software que está realizando a integração", required = true)
    public Long idintegracao;

    @ApiModelProperty(value = "Número do pagamento no software que está realizando a integração", required = true)
    public Integer numero;

    @ApiModelProperty(value = "Id do tipo de pagamento utilizado para este pagamento. A forma de pagamento deve estar cadastrada anteriormente no MobiAge", required = true)
    public Long idformapagamento;

    @ApiModelProperty(value = "Valor do pagamento", required = true)
    public BigDecimal valor;

    @ApiModelProperty(value = "Flag que indica se o pagamento já foi realizado. O valor padrão desse campo é falso.")
    public Boolean pago = Boolean.FALSE;

    @ApiModelProperty(value = "Campo que indica se o pagamento é uma parcela ou uma entrada", required = true)
    public TipoPagamento tipo;


    public Pagamento() {
    }

    public Pagamento(Long idintegracao, Integer numero, Long idformapagamento, BigDecimal valor, TipoPagamento tipo) {
        this.idintegracao = idintegracao;
        this.numero = numero;
        this.idformapagamento = idformapagamento;
        this.valor = valor;
        this.tipo = tipo;
    }

    public Pagamento(Long idintegracao, Integer numero, Long idformapagamento, BigDecimal valor, Boolean pago, TipoPagamento tipo) {
        this.idintegracao = idintegracao;
        this.numero = numero;
        this.idformapagamento = idformapagamento;
        this.valor = valor;
        this.pago = pago;
        this.tipo = tipo;
    }
}
