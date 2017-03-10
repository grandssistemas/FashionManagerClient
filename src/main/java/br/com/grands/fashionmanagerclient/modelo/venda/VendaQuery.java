package br.com.grands.fashionmanagerclient.modelo.venda;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * Created by rafael on 10/03/17.
 */
public class VendaQuery {

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @ApiModelProperty(value = "Data de inicio do periodo.", position = 1)
    private Date inicioPeriodo;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @ApiModelProperty(value = "Data de fim do periodo.", position = 1)
    private Date fimPeriodo;
    @ApiModelProperty(value = "Indica o status da venda que será retornado (SALVA|FINALIZADA|CANCELADA).", position = 1)
    private List<String> status;
    @ApiModelProperty(value = "Indica se quer vendas com ou sem emissão fiscal, caso passe nulo.", position = 1)
    private Boolean comEmissao;

}
