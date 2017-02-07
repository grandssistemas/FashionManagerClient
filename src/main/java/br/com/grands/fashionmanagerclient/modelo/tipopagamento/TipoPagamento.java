package br.com.grands.fashionmanagerclient.modelo.tipopagamento;

import io.swagger.annotations.ApiModelProperty;

public class TipoPagamento {

    @ApiModelProperty(value = "Id do tipo de pagamento do software que esta usando a integração", position = 1, required = true)
    private Long id;
    @ApiModelProperty(value="Nome do tipo de pagamento", position = 2, required = true)
    private String nome;
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
    private Integer codigoSefaz;

    public TipoPagamento(){

    }

    public TipoPagamento(Long id, String nome, Integer codigoSefaz) {
        this.id = id;
        this.nome = nome;
        this.codigoSefaz = codigoSefaz;
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

    public Integer getCodigoSefaz() {
        return codigoSefaz;
    }

    public void setCodigoSefaz(Integer codigoSefaz) {
        this.codigoSefaz = codigoSefaz;
    }
}
