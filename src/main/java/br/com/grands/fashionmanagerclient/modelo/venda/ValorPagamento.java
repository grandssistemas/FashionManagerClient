package br.com.grands.fashionmanagerclient.modelo.venda;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by rafael on 10/03/17.
 */
public class ValorPagamento {

    @ApiModelProperty(value = "Forma de pagamento (SEFAZ).", position = 1)
    public String tPag;
    @ApiModelProperty(value = "Numero do cheque.", position = 2)
    public String numCheque;
    @ApiModelProperty(value = "Valor do pagamento.", position = 3)
    public BigDecimal valorPagamento;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy")
    @ApiModelProperty(value = "Data de vencimento.", position = 4)
    public Date dataVencimento;

    @ApiModelProperty(value = "Numero do banco.", position = 5)
    public String numBanco;
    @ApiModelProperty(value = "Documento do cliente, CPF para pessoa fisica e CNPJ para pessoa juridica.", position = 6)
    public String docCliente;
    @ApiModelProperty(value = "Agência do cheque.", position = 7)
    public String agenciaCheque;
    @ApiModelProperty(value = "Conta do cheque.", position = 8)
    public String contaCheque;
}
