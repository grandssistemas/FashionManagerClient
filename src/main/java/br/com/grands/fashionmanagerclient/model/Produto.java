package br.com.grands.fashionmanagerclient.model;


import java.math.BigDecimal;

/**
 * Created by gelatti on 17/10/16.
 */

public class Produto {

    private Long id;
    private String nome;
    private BigDecimal preco;
    private String barras;
    private String ncm;
    private String cest;
    private GrupoFiscalProduto grupoFiscalProduto;
    private BigDecimal vlIpi;
    private String tipoIpi;
    private String origem;
    private Boolean status;
    private Departamento departamento;
    private BigDecimal estoque;
    private Combustivel combustivel;

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

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
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
