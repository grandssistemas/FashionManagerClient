package br.com.grands.fashionmanagerclient.modelo.venda;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by rafael on 10/03/17.
 */
public class Venda {
    @ApiModelProperty(value = "Id da venda no MobiAge, pode ser utilizado para busca de venda por id", position = 1)
    public Long id;
    @ApiModelProperty(value = "Numero do pdv que foi realizado o faturamento.", position = 2)
    public Long numpdv;
    @ApiModelProperty(value = "Status da venda, quando possuir nota informa o status fornecido pela receita.", position = 3)
    public String status;
    @ApiModelProperty(value = "Valor bruto da venda, sem o desconto.", position = 4)
    public BigDecimal valorbruto;
    @ApiModelProperty(value = "Valor de desconto da venda.", position = 5)
    public BigDecimal valordesconto;
    @ApiModelProperty(value = "Valor de acrecimo da venda.", position = 6)
    public BigDecimal valoracrecimo;

    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd/MM/yyyy HH:mm")
    @ApiModelProperty(value = "Data/hora da venda.", position = 7)
    public Date datavenda;
    @ApiModelProperty(value = "Documento do cliente, cnpj caso seja juridica e cpf caso seja fisica.", position = 8)
    public String doccliente;
    @ApiModelProperty(value = "Identificador do operador passado no campo id quando cadastrado, caso esse operador não foi cadastrado por integrção será informado o identificador no sistema.", position = 9)
    public String codoperador;
    @ApiModelProperty(value = "Tipo do cliente: 'FISICA' ou 'JURIDICA'.", position = 10)
    public String tipocliente;
    @ApiModelProperty(value = "Tipo de emissão da nota emitida (SEFAZ).", position = 11)
    public Integer tpemis;
    @ApiModelProperty(value = "Lista de itens de venda.", position = 12)
    public List<ItemVenda> itens;
    @ApiModelProperty(value = "Lista de pagamentos.", position = 13)
    public List<ValorPagamento> pagamentos;
    @ApiModelProperty(value = "Numero da venda, caso tenha nota emitida para esse venda irá o numero de emissão dela.", position = 14)
    public String numvenda;
    @ApiModelProperty(value = "Numero da chave da (NFe/NFCe) emitida a partir da venda.", position = 14)
    public String chavedoc;
}
