package br.com.grands.fashionmanagerclient.modelo.venda;

import br.com.grands.fashionmanagerclient.modelo.venda.enums.TipoStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by rafael on 10/03/17.
 */
public class VendaQuery {

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    @ApiModelProperty(value = "Data de inicio do periodo.", position = 1)
    private Date inicioPeriodo;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @ApiModelProperty(value = "Data de fim do periodo.", position = 1)
    private Date fimPeriodo;
    @ApiModelProperty(value = "Indica o status da venda que será retornado (SALVA|FINALIZADA|CANCELADA).", position = 1)
    private List<TipoStatus> status;
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
        if (this.fimPeriodo != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fimPeriodo);
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            calendar.set(year, month, day, 23, 59, 59);
            this.fimPeriodo = calendar.getTime();
        }
    }

    public List<TipoStatus> getStatus() {
        return status;
    }

    public void setStatus(List<TipoStatus> status) {
        this.status = status;
    }

    public Boolean getComEmissao() {
        return comEmissao;
    }

    public void setComEmissao(Boolean comEmissao) {
        this.comEmissao = comEmissao;
    }
}
