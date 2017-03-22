package br.com.grands.fashionmanagerclient.modelo.combustivel;


import io.swagger.annotations.ApiModelProperty;

public class Bomba {

    @ApiModelProperty(value = "Id da bomba no software que está realizando a integração", required = true, position = 1)
    private Long id;

    @ApiModelProperty(value = "Nome da bomba de combustivel", required = true, position = 2)
    private String nome;

    @ApiModelProperty(value = "Número da bomba de combustível", required = true, position = 3)
    private String numero;


    public Bomba() {
    }

    public Bomba(Long id, String nome, String numero) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
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
}
