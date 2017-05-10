package br.com.grands.fashionmanagerclient.modelo.combustivel;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

public class Abastecimento {

    @ApiModelProperty(value = "Id do abastecimento no sistema que está realizando a integração", required = true, position = 1)
    public Long idintegracao;
    @ApiModelProperty(value = "Número do bico em que o abastecimento foi realizado", required = true, position = 2)
    public Long numerobico;

    @ApiModelProperty(value = "Data em que foi realizado o abastecimento, no formato DD/MM/YYYY", required = true, position = 3)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    public Date dataabastecimento;

    @ApiModelProperty(value = "Horário em que foi realizado o abastecimento, no formato HH:MM:SS", required = true, position = 4)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss",  locale = "pt-BR", timezone = "America/Sao_Paulo")
    public Date horaabastecimento;

    @ApiModelProperty(value = "Total do encerrante antes do abastecimento", required = true, position = 5)
    public BigDecimal encerrante;

    @ApiModelProperty(value = "Quantidade que foi abastecida.", required = true, position = 6)
    public BigDecimal quantidade;

    @ApiModelProperty(value = "Id da pessoa responsável pelo abastecimento. São aceitas somente pessoas que tenham o papel de funcionário.", required = true, position = 7)
    public Long frentista;

    public Abastecimento() {
    }

    public Abastecimento(Long idintegracao, Long numerobico, Date dataabastecimento, Date horaabastecimento, BigDecimal encerrante, BigDecimal quantidade, Long frentista) {
        this.idintegracao = idintegracao;
        this.numerobico = numerobico;
        this.dataabastecimento = dataabastecimento;
        this.horaabastecimento = horaabastecimento;
        this.encerrante = encerrante;
        this.quantidade = quantidade;
        this.frentista = frentista;
    }
}
