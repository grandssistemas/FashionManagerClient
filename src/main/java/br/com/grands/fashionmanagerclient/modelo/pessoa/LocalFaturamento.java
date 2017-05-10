package br.com.grands.fashionmanagerclient.modelo.pessoa;

import io.swagger.annotations.ApiModelProperty;


public class LocalFaturamento {

    @ApiModelProperty(value = "Id da local de faturamento no software que esta usando a integração", position = 1, required = true)
    public Long idintegracao;
    @ApiModelProperty(value = "Nome do local de faturamento", position = 2, required = true)
    public String nome;
    @ApiModelProperty(value = "Documento associado ao local de faturamento. Exemplo: Inscrição rural", position = 3)
    public String documento;
    @ApiModelProperty(value = "Endereço do local de faturamento", position = 4, required = true)
    public Endereco endereco;

    
}
