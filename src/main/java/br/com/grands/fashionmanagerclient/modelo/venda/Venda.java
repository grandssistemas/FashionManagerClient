package br.com.grands.fashionmanagerclient.modelo.venda;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by rafael on 10/03/17.
 */
public class Venda {
    @ApiModelProperty(value = "Numero do pdv que foi realizado o faturamento.", position = 1)
    private Long numPdv;
    @ApiModelProperty(value = "Status da venda, quando possuir nota informa o status fornecido pela receita.", position = 2)
    private String status;
    @ApiModelProperty(value = "Valor bruto da venda, sem o desconto.", position = 3)
    private BigDecimal valorBruto;
    @ApiModelProperty(value = "Valor de desconto da venda.", position = 4)
    private BigDecimal valorDesconto;
    @ApiModelProperty(value = "Valor de acrecimo da venda.", position = 5)
    private BigDecimal valorAcrecimo;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    @ApiModelProperty(value = "Data/hora da venda.", position = 6)
    private Date dataVenda;
    @ApiModelProperty(value = "Documento do cliente, cnpj caso seja juridica e cpf caso seja fisica.", position = 7)
    private String docCliente;
    @ApiModelProperty(value = "Numero da venda, caso tenha nota emitida para esse venda irá o numero de emissão dela.", position = 8)
    private String numVenda;
    @ApiModelProperty(value = "Identificador do operador passado no campo id quando cadastrado, caso esse operador não foi cadastrado por integrção será informado o identificador no sistema.", position = 9)
    private String codOperador;
    @ApiModelProperty(value = "Tipo do cliente: 'FISICA' ou 'JURIDICA'.", position = 10)
    private String tipoCliente;
    @ApiModelProperty(value = "Tipo de emissão da nota emitida (SEFAZ).", position = 11)
    private Integer tpEmis;
    @ApiModelProperty(value = "Lista de itens de venda.", position = 12)
    private List<ItemVenda> itens;
    @ApiModelProperty(value = "Lista de pagamentos.", position = 13)
    private List<ValorPagamento> pagamentos;


    public Long getNumPdv() {
        return numPdv;
    }

    public void setNumPdv(Long numPdv) {
        this.numPdv = numPdv;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(BigDecimal valorBruto) {
        this.valorBruto = valorBruto;
    }

    public BigDecimal getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(BigDecimal valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public BigDecimal getValorAcrecimo() {
        return valorAcrecimo;
    }

    public void setValorAcrecimo(BigDecimal valorAcrecimo) {
        this.valorAcrecimo = valorAcrecimo;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getDocCliente() {
        return docCliente;
    }

    public void setDocCliente(String docCliente) {
        this.docCliente = docCliente;
    }

    public String getNumVenda() {
        return numVenda;
    }

    public void setNumVenda(String numVenda) {
        this.numVenda = numVenda;
    }

    public String getCodOperador() {
        return codOperador;
    }

    public void setCodOperador(String codOperador) {
        this.codOperador = codOperador;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Integer getTpEmis() {
        return tpEmis;
    }

    public void setTpEmis(Integer tpEmis) {
        this.tpEmis = tpEmis;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    public List<ValorPagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(List<ValorPagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }
}
