package br.com.grands.fashionmanagerclient.modelo.produto;


import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by gelatti on 17/10/16.
 */

public class Produto {
    @ApiModelProperty(value = "Id do produto do software que esta usando integração", position = 1)
    public Long id;
    @ApiModelProperty(value = "Nome do produto", position = 2, required = true)
    public String nome;
    @ApiModelProperty(value = "Atributo que indica se o produto está ativo ou não. O valor padrão do campo é TRUE", position = 11)
    public Boolean status = Boolean.TRUE;
    @ApiModelProperty(value = "Id do tipo de produto. O tipo de produto deve estar cadastrado no momento do cadastro de produto.", position = 12, required = true)
    public Long tipoProdutoId;
    @ApiModelProperty(value = "Quantidade em estoque do produto. O valor padrão do campo é 0", position = 13)
    public BigDecimal estoque = BigDecimal.ZERO;
    @ApiModelProperty(value = "Atributo que indica se o produto pode ser movimentado fracionado. O valor padrão do campo é FALSE", position = 14)
    public Boolean fracionado = Boolean.FALSE;
    @ApiModelProperty(value = "Atributo que armazena o peso líquido do produto.", position = 15, required = true)
    public BigDecimal pesoLiquido;
    @ApiModelProperty(value = "Atributo que armazena o peso bruto do produto.", position = 16, required = true)
    public BigDecimal pesoBruto;
    @ApiModelProperty(value = "Atributo que armazena o custo do produto.", position = 17, required = true)
    public BigDecimal custo;
    @ApiModelProperty(value = "Atributo que armazena o valor de venda do produto.", position = 18, required = true)
    public BigDecimal valorVenda;
    @ApiModelProperty(value = "Atributo que armazena o SKU do produto. Esse atributo deve ser único por organização. " +
            "Caso não for informado, será gerada uma string aletória de 8 digitos.", position = 19)
    public String sku;
    @ApiModelProperty(value = "Atributo que armazena os dados fiscais do produto.", position = 20)
    public Fiscal fiscal;
    @ApiModelProperty(value = "Atributo que informa as variações de grade do produto.", position = 21)
    public List<ItemGrade> grade;
    @ApiModelProperty(value = "Atributo que armazena os códigos de barras do produto. " +
            "Caso não seja informado nenhum, será gerado um código de barras pelo sistema.", position = 22)
    public List<CodigoBarras> codigos;


    public Produto(){

    }

    public Produto(Produto produto){
        this.id = produto.id;
        this.nome = produto.nome;
        this.status = produto.status;
        this.tipoProdutoId = produto.tipoProdutoId;
        this.estoque = produto.estoque;
        this.fracionado = produto.fracionado;
        this.pesoLiquido = produto.pesoLiquido;
        this.pesoBruto = produto.pesoBruto;
        this.custo = produto.custo;
        this.valorVenda = produto.valorVenda;
        this.sku = produto.sku;
        this.fiscal = produto.fiscal;
        this.grade = produto.grade;
        this.codigos = produto.codigos;
    }
}
