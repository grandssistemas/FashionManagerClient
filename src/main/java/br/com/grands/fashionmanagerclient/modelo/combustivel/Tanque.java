package br.com.grands.fashionmanagerclient.modelo.combustivel;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class Tanque {

    @ApiModelProperty(value = "Id do tanque no software que está realizando a integração", required = true, position = 1)
    public Long idintegracao;
    @ApiModelProperty(value = "Nome do tanque", required = true, position = 2)
    public String nome;
    @ApiModelProperty(value = "Número do tanque. Este número deve ser único por organização", required = true, position = 3)
    public String numero;

    @ApiModelProperty(value = "Lista de combustíveis presentes no tanque." +
            " Este campo deve conter os Ids dos produtos do tipo combustivel no sistema que está realizando a integração. " +
            " Esta lista deve conter pelo menos um elemento e são aceitos somente produtos que tenham o bloco de dados de combustivel " +
            "(Código ANP, percentual de gás natural e CODIF) preenchido", required = true, position = 4)
    public List<Long> combustiveis;

    public Tanque() {
    }

    public Tanque(Long idintegracao, String nome, String numero, List<Long> combustiveis) {
        this.idintegracao = idintegracao;
        this.nome = nome;
        this.numero = numero;
        this.combustiveis = combustiveis;
    }
}
