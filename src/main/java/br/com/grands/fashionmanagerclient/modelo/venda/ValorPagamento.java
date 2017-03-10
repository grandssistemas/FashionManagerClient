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

    public String gettPag() {
        return tPag;
    }

    public void settPag(String tPag) {
        this.tPag = tPag;
    }

    public String getNumCheque() {
        return numCheque;
    }

    public void setNumCheque(String numCheque) {
        this.numCheque = numCheque;
    }

    public String getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(String valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getNumBanco() {
        return numBanco;
    }

    public void setNumBanco(String numBanco) {
        this.numBanco = numBanco;
    }

    public String getDocCliente() {
        return docCliente;
    }

    public void setDocCliente(String docCliente) {
        this.docCliente = docCliente;
    }

    public String getAgenciaCheque() {
        return agenciaCheque;
    }

    public void setAgenciaCheque(String agenciaCheque) {
        this.agenciaCheque = agenciaCheque;
    }

    public String getContaCheque() {
        return contaCheque;
    }

    public void setContaCheque(String contaCheque) {
        this.contaCheque = contaCheque;
    }
}
