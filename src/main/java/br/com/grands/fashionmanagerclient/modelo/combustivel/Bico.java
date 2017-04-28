package br.com.grands.fashionmanagerclient.modelo.combustivel;

import io.swagger.annotations.ApiModelProperty;

public class Bico {

    @ApiModelProperty(value = "Id do bico no software que está realizando a integração", required = true, position = 1)
    public Long id;

    @ApiModelProperty(value = "Id da bomba que o bico está relacionado no software que está realizando a integração", required = true, position = 2)
    public Long idBomba;

    @ApiModelProperty(value = "Id do tanque que o bico está relacionado no software que está realizando a integração", required = true, position = 3)
    public Long idTanque;

    @ApiModelProperty(value = "Id do produto que o bico está relacionado no software que está realizando a integração. " +
            "São aceito somente produtos que estejam relacionados ao tanque informado.", required = true, position = 4)
    public Long idProduto;

    @ApiModelProperty(value = "Número do bico. Este número deve ser único por organização", required = true, position = 5)
    public Long numero;

    public Bico() {
    }

    public Bico(Long id, Long idBomba, Long idTanque, Long idProduto, Long numero) {
        this.id = id;
        this.idBomba = idBomba;
        this.idTanque = idTanque;
        this.idProduto = idProduto;
        this.numero = numero;
    }
}
