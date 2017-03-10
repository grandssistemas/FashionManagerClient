package br.com.grands.fashionmanagerclient.modelo.venda;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * Created by rafael on 10/03/17.
 */
public class ValorPagamento {

    @ApiModelProperty(value = "Forma de pagamento (SEFAZ).", position = 1)
    private String tPag;
    @ApiModelProperty(value = "Numero do cheque.", position = 2)
    private String numCheque;
    @ApiModelProperty(value = "Valor do pagamento.", position = 3)
    private String valorPagamento;
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    @ApiModelProperty(value = "Data de vencimento.", position = 4)
    private Date dataVencimento;

    @ApiModelProperty(value = "Numero do banco.", position = 5)
    private String numBanco;
    @ApiModelProperty(value = "Documento do cliente, CPF para pessoa fisica e CNPJ para pessoa juridica.", position = 6)
    private String docCliente;
    @ApiModelProperty(value = "Agência do cheque.", position = 7)
    private String agenciaCheque;
    @ApiModelProperty(value = "Conta do cheque.", position = 8)
    private String contaCheque;

}
