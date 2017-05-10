package br.com.grands.fashionmanagerclient.modelo.tipopagamento;

import io.swagger.annotations.ApiModelProperty;

public class TipoPagamento {

    @ApiModelProperty(value = "Id do tipo de pagamento do software que esta usando a integração", position = 1, required = true)
    public Long idintegracao;
    @ApiModelProperty(value="Nome do tipo de pagamento", position = 2, required = true)
    public String nome;
    @ApiModelProperty("Código do tipo de pagamento segundo a Sefaz. Valores válidos:<br/> " +
            "01 - Dinheiro; <br/>" +
            "02 - Cheque; <br/>" +
            "03 - Cartão de Crédito; <br/>" +
            "04 - Cartão de Débito; <br/>" +
            "05 - Crédito Loja; <br/>" +
            "10 - Vale Alimentação; <br/>" +
            "11 - Vale Refeição; <br/>" +
            "12 - Vale Presente; <br/>" +
            "13 - Vale Combustível; <br/>" +
            "99 - Outros")
    public Integer codigosefaz;

    public TipoPagamento(){

    }

    public TipoPagamento(Long idintegracao, String nome, Integer codigosefaz) {
        this.idintegracao = idintegracao;
        this.nome = nome;
        this.codigosefaz = codigosefaz;
    }
}
