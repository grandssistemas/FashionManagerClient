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
    public Long idintegracao;
    @ApiModelProperty(value = "Lista de operações que estão ligadas a tributação", position = 2, required = true)
    public List<Operacao> operacao;
    @ApiModelProperty(value = "Lista de siglas de estados de origem para tributação", position = 3, required = true)
    public List<String> origem;
    @ApiModelProperty(value = "Lista de siglas de estados de destino para tributação", position = 4, required = true)
    public List<String> destino;
    @ApiModelProperty(value = "Lista de grupos fiscais de pessoa para tributação", position = 5, required = true)
    public List<GrupoFiscalPessoa> grupofiscalpessoa;
    @ApiModelProperty(value = "Lista de grupos fiscais de produto para tributação", position = 6, required = true)
    public List<GrupoFiscalProduto> grupofiscalproduto;
    @ApiModelProperty(value = "Grupo de tributação de ICMS para a tributação", position = 7)
    public Icms icms;
    @ApiModelProperty(value = "Grupo de tributação de PIS para a tributação", position = 8)
    public Pis pis;
    @ApiModelProperty(value = "Grupo de tributação de COFINS para a tributação", position = 9)
    public Cofins cofins;
    @ApiModelProperty(value = "Grupo de tributação de IPI para a tributação", position = 10)
    public Ipi ipi;
    @ApiModelProperty(value = "Nome da tributação", position = 11, required = true)
    public String nome;
}
