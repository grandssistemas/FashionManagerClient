package br.com.grands.fashionmanagerclient.modelo.combustivel;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class Tanque {

    @ApiModelProperty(value = "Id do tanque no software que está realizando a integração", required = true, position = 1)
    private Long id;

    @ApiModelProperty(value = "Nome do tanque", required = true, position = 2)
    private String nome;
    @ApiModelProperty(value = "Número do tanque. Este número deve ser único por organização", required = true, position = 3)
    private String numero;

    @ApiModelProperty(value = "Lista de combustíveis presentes no tanque." +
            " Este campo deve conter os Ids dos produtos do tipo combustivel no sistema que está realizando a integração. " +
            " Esta lista deve conter pelo menos um elemento e são aceitos somente produtos que tenham o bloco de dados de combustivel " +
            "(Código ANP, percentual de gás natural e CODIF) preenchido", required = true, position = 4)
    private List<Long> combustiveis;

    public Tanque() {
    }

    public Tanque(Long id, String nome, String numero, List<Long> combustiveis) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
        this.combustiveis = combustiveis;
    }

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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public List<Long> getCombustiveis() {
        return combustiveis;
    }

    public void setCombustiveis(List<Long> combustiveis) {
        this.combustiveis = combustiveis;
    }
}
