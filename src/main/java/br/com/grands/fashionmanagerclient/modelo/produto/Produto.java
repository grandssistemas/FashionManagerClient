package br.com.grands.fashionmanagerclient.modelo.produto;


import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * Created by gelatti on 17/10/16.
 */

public class Produto {

    @ApiModelProperty(value = "Id do produto do software que esta usando integração", position = 1)
    private Long id;
    @ApiModelProperty(value = "Nome do produto", position = 2)
    private String nome;
    @ApiModelProperty(value = "Preço do produto", position = 3)
    private BigDecimal preco;
    @ApiModelProperty(value = "Código de barras do produto", position = 4)
    private String barras;
    @ApiModelProperty(value = "Código NCM do produto", position = 5)
    private String ncm;
    @ApiModelProperty(value = "Código CEST do produto", position = 6)
    private String cest;
    @ApiModelProperty(value = "Grupo Fiscal do produto", position = 7)
    private GrupoFiscalProduto grupoFiscalProduto;
    @ApiModelProperty(value = "Valor de IPI do produto", position = 8)
    private BigDecimal vlIpi;
    @ApiModelProperty(value = "Código de IPI do produto", position = 9)
    private String tipoIpi;
    @ApiModelProperty(value = "Código de ORIGEM do produto", position = 10)
    private String origem;
    @ApiModelProperty(value = "Status de ativo do produto TRUE ou FALSE", position = 11)
    private Boolean status;
    @ApiModelProperty(value = "Departamento do produto", position = 12)
    private Departamento departamento;
    @ApiModelProperty(value = "Quantidade em estoque do produto", position = 13)
    private BigDecimal estoque;
    @ApiModelProperty(value = "Código da agencia nacional do petroleo para caso o produto for combustível", position = 14)
    private String codigoANP;
    @ApiModelProperty(value = "Percentual de gás natural no produto para combustiveis", position = 15)
    private BigDecimal percentualGasNatural;
    @ApiModelProperty(value = "Código do CODIF para combustiveis", position = 16)
    private String codif;

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

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getBarras() {
        return barras;
    }

    public void setBarras(String barras) {
        this.barras = barras;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public String getCest() {
        return cest;
    }

    public void setCest(String cest) {
        this.cest = cest;
    }

    public GrupoFiscalProduto getGrupoFiscalProduto() {
        return grupoFiscalProduto;
    }

    public void setGrupoFiscalProduto(GrupoFiscalProduto grupoFiscalProduto) {
        this.grupoFiscalProduto = grupoFiscalProduto;
    }

    public BigDecimal getVlIpi() {
        return vlIpi;
    }

    public void setVlIpi(BigDecimal vlIpi) {
        this.vlIpi = vlIpi;
    }

    public String getTipoIpi() {
        return tipoIpi;
    }

    public void setTipoIpi(String tipoIpi) {
        this.tipoIpi = tipoIpi;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public BigDecimal getEstoque() {
        return estoque;
    }

    public void setEstoque(BigDecimal estoque) {
        this.estoque = estoque;
    }

    public String getCodigoANP() {
        return codigoANP;
    }

    public void setCodigoANP(String codigoANP) {
        this.codigoANP = codigoANP;
    }

    public BigDecimal getPercentualGasNatural() {
        return percentualGasNatural;
    }

    public void setPercentualGasNatural(BigDecimal percentualGasNatural) {
        this.percentualGasNatural = percentualGasNatural;
    }

    public String getCodif() {
        return codif;
    }

    public void setCodif(String codif) {
        this.codif = codif;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
