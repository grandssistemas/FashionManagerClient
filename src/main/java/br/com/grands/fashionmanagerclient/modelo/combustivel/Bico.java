package br.com.grands.fashionmanagerclient.modelo.combustivel;

import io.swagger.annotations.ApiModelProperty;

public class Bico {

    @ApiModelProperty(value = "Id do bico no software que está realizando a integração", required = true, position = 1)
    private Long id;

    @ApiModelProperty(value = "Id da bomba que o bico está relacionado no software que está realizando a integração", required = true, position = 2)
    private Long idBomba;

    @ApiModelProperty(value = "Id do tanque que o bico está relacionado no software que está realizando a integração", required = true, position = 3)
    private Long idTanque;

    @ApiModelProperty(value = "Id do produto que o bico está relacionado no software que está realizando a integração. " +
            "São aceito somente produtos que estejam relacionados ao tanque informado.", required = true, position = 4)
    private Long idProduto;

    @ApiModelProperty(value = "Número do bico", required = true, position = 5)
    private Long numero;

    public Bico() {
    }

    public Bico(Long id, Long idBomba, Long idTanque, Long idProduto, Long numero) {
        this.id = id;
        this.idBomba = idBomba;
        this.idTanque = idTanque;
        this.idProduto = idProduto;
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdBomba() {
        return idBomba;
    }

    public void setIdBomba(Long idBomba) {
        this.idBomba = idBomba;
    }

    public Long getIdTanque() {
        return idTanque;
    }

    public void setIdTanque(Long idTanque) {
        this.idTanque = idTanque;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }
}
