package br.com.grands.fashionmanagerclient.modelo.produto;


import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by gelatti on 17/10/16.
 */

public class Produto {
    @ApiModelProperty(value = "Id do produto do software que esta usando integração", position = 1)
    public Long idintegracao;
    @ApiModelProperty(value = "Nome do produto", position = 2, required = true)
    public String nome;
    @ApiModelProperty(value = "Nome abreviado do produto, para ser usado em etiquetas", position = 3)
    public String nomeabreviado;
    @ApiModelProperty(value = "Atributo que indica se o produto está ativo ou não. O valor padrão do campo é TRUE", position = 4)
    public Boolean status = Boolean.TRUE;
    @ApiModelProperty(value = "Id do tipo de produto. O tipo de produto deve estar cadastrado no momento do cadastro de produto.", position = 5, required = true)
    public Long idtipoproduto;
    @ApiModelProperty(value = "Quantidade em estoque do produto. O valor padrão do campo é 0", position = 6)
    public BigDecimal estoque = BigDecimal.ZERO;
    @ApiModelProperty(value = "Atributo que indica se o produto pode ser movimentado fracionado. O valor padrão do campo é FALSE", position = 7)
    public Boolean fracionado = Boolean.FALSE;
    @ApiModelProperty(value = "Atributo que armazena o peso líquido do produto.", position = 8, required = true)
    public BigDecimal pesoliquido;
    @ApiModelProperty(value = "Atributo que armazena o peso bruto do produto.", position = 9, required = true)
    public BigDecimal pesobruto;
    @ApiModelProperty(value = "Atributo que armazena o custo do produto.", position = 10, required = true)
    public BigDecimal custo;
    @ApiModelProperty(value = "Atributo que armazena o valor de venda do produto.", position = 11, required = true)
    public BigDecimal valorvenda;
    @ApiModelProperty(value = "Atributo que armazena o SKU do produto. Esse atributo deve ser único por organização. " +
            "Caso não for informado, será gerada uma string aletória de 8 digitos.", position = 12)
    public String skubase;
    @ApiModelProperty(value = "String representando a data de cadastro do produto, no formato 'YYYY-MM-DD'", position = 13)
    public String datacadastro;
    @ApiModelProperty(value="Observações sobre o produto. Esse campo pode conter no máximo 5000 caracteres.", position = 14)
    public String observacoes;
    @ApiModelProperty(value="Id da marca.A marca deve estar cadastrada no momento do cadastro de produto.", position = 15)
    public Long idmarca;
    @ApiModelProperty(value = "Atributo que armazena os dados fiscais do produto.", position = 16)
    public Fiscal fiscal;

    public List<String> classificacao;
    @ApiModelProperty(value = "Atributo que informa as variações do produto.", position = 17)
    public List<ItemGrade> variacoes;
    @ApiModelProperty(value = "Atributo que armazena os códigos de barras do produto. " +
            "Esse atributo é utilizado para cadastrar os códigos de barras quando o produto não possui variações. " +
            "Caso não seja informado nenhum, será gerado um código de barras pelo sistema.", position = 18)
    public List<CodigoBarras> codigos;

    @ApiModelProperty(value = "Conjunto de fotos do produto.", position = 19)
    public List<Foto> fotos;



    public Produto(){

    }

    public Produto(Produto produto){
        this.idintegracao = produto.idintegracao;
        this.nome = produto.nome;
        this.nomeabreviado = produto.nomeabreviado;
        this.status = produto.status;
        this.idtipoproduto = produto.idtipoproduto;
        this.estoque = produto.estoque;
        this.fracionado = produto.fracionado;
        this.pesoliquido = produto.pesoliquido;
        this.pesobruto = produto.pesobruto;
        this.custo = produto.custo;
        this.valorvenda = produto.valorvenda;
        this.skubase = produto.skubase;
        this.datacadastro = produto.datacadastro;
        this.observacoes = produto.observacoes;
        this.idmarca = produto.idmarca;
        this.fiscal = produto.fiscal;
        this.variacoes = produto.variacoes;
        this.codigos = produto.codigos;
        this.classificacao = produto.classificacao;
    }
}
