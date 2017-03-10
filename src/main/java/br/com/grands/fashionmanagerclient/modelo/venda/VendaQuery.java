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


    public Date getInicioPeriodo() {
        return inicioPeriodo;
    }

    public void setInicioPeriodo(Date inicioPeriodo) {
        this.inicioPeriodo = inicioPeriodo;
    }

    public Date getFimPeriodo() {
        return fimPeriodo;
    }

    public void setFimPeriodo(Date fimPeriodo) {
        this.fimPeriodo = fimPeriodo;
    }

    public List<String> getStatus() {
        return status;
    }

    public void setStatus(List<String> status) {
        this.status = status;
    }

    public Boolean getComEmissao() {
        return comEmissao;
    }

    public void setComEmissao(Boolean comEmissao) {
        this.comEmissao = comEmissao;
    }
}
