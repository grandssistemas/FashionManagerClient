package br.com.grands.fashionmanagerclient.modelo.tributador;

import br.com.grands.fashionmanagerclient.modelo.pessoa.GrupoFiscalPessoa;
import br.com.grands.fashionmanagerclient.modelo.produto.GrupoFiscalProduto;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by gelatti on 03/11/16.
 */
public class Tributador {

    @ApiModelProperty(value = "Id da tributação do software que esta usando integração", position = 1)
    private Long id;
    @ApiModelProperty(value = "Lista de operações que estão ligadas a tributação", position = 2, required = true)
    private List<Operacao> operacao;
    @ApiModelProperty(value = "Lista de siglas de estados de origem para tributação", position = 3, required = true)
    private List<String> origem;
    @ApiModelProperty(value = "Lista de siglas de estados de destino para tributação", position = 4, required = true)
    private List<String> destino;
    @ApiModelProperty(value = "Lista de grupos fiscais de pessoa para tributação", position = 5, required = true)
    private List<GrupoFiscalPessoa> grupoFiscalPessoa;
    @ApiModelProperty(value = "Lista de grupos fiscais de produto para tributação", position = 6, required = true)
    private List<GrupoFiscalProduto> grupoFiscalProduto;
    @ApiModelProperty(value = "Grupo de tributação de ICMS para a tributação", position = 7)
    private Icms icms;
    @ApiModelProperty(value = "Grupo de tributação de PIS para a tributação", position = 8)
    private Pis pis;
    @ApiModelProperty(value = "Grupo de tributação de COFINS para a tributação", position = 9)
    private Cofins cofins;
    @ApiModelProperty(value = "Grupo de tributação de IPI para a tributação", position = 10)
    private Ipi ipi;
    @ApiModelProperty(value = "Nome da tributação", position = 11, required = true)
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Operacao> getOperacao() {
        return operacao;
    }

    public void setOperacao(List<Operacao> operacao) {
        this.operacao = operacao;
    }

    public List<String> getOrigem() {
        return origem;
    }

    public void setOrigem(List<String> origem) {
        this.origem = origem;
    }

    public List<String> getDestino() {
        return destino;
    }

    public void setDestino(List<String> destino) {
        this.destino = destino;
    }

    public List<GrupoFiscalPessoa> getGrupoFiscalPessoa() {
        return grupoFiscalPessoa;
    }

    public void setGrupoFiscalPessoa(List<GrupoFiscalPessoa> grupoFiscalPessoa) {
        this.grupoFiscalPessoa = grupoFiscalPessoa;
    }

    public List<GrupoFiscalProduto> getGrupoFiscalProduto() {
        return grupoFiscalProduto;
    }

    public void setGrupoFiscalProduto(List<GrupoFiscalProduto> grupoFiscalProduto) {
        this.grupoFiscalProduto = grupoFiscalProduto;
    }

    public Icms getIcms() {
        return icms;
    }

    public void setIcms(Icms icms) {
        this.icms = icms;
    }

    public Pis getPis() {
        return pis;
    }

    public void setPis(Pis pis) {
        this.pis = pis;
    }

    public Cofins getCofins() {
        return cofins;
    }

    public void setCofins(Cofins cofins) {
        this.cofins = cofins;
    }

    public Ipi getIpi() {
        return ipi;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIpi(Ipi ipi) {
        this.ipi = ipi;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
