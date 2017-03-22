package br.com.grands.fashionmanagerclient.modelo.combustivel;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.Date;

public class Abastecimento {

    @ApiModelProperty(value = "Id do abastecimento no sistema que está realizando a integração", required = true, position = 1)
    private Long id;
    @ApiModelProperty(value = "Número do bico em que o abastecimento foi realizado", required = true, position = 2)
    private Long numeroBico;

    @ApiModelProperty(value = "Data em que foi realizado o abastecimento, no formato DD/MM/YYYY", required = true, position = 3)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
    private Date dataAbastecimento;

    @ApiModelProperty(value = "Horário em que foi realizado o abastecimento, no formato HH:MM:SS", required = true, position = 4)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm:ss",  locale = "pt-BR", timezone = "America/Sao_Paulo")
    private Date horaAbastecimento;

    @ApiModelProperty(value = "Total do encerrante antes do abastecimento", required = true, position = 5)
    private BigDecimal encerrante;

    @ApiModelProperty(value = "Quantidade que foi abastecida.", required = true, position = 6)
    private BigDecimal quantidade;

    @ApiModelProperty(value = "Id da pessoa responsável pelo abastecimento. São aceitas somente pessoas que tenham o papel de funcionário.", required = true, position = 7)
    private Long frentista;

    public Abastecimento() {
    }

    public Abastecimento(Long id, Long numeroBico, Date dataAbastecimento, Date horaAbastecimento, BigDecimal encerrante, BigDecimal quantidade, Long frentista) {
        this.id = id;
        this.numeroBico = numeroBico;
        this.dataAbastecimento = dataAbastecimento;
        this.horaAbastecimento = horaAbastecimento;
        this.encerrante = encerrante;
        this.quantidade = quantidade;
        this.frentista = frentista;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumeroBico() {
        return numeroBico;
    }

    public void setNumeroBico(Long numeroBico) {
        this.numeroBico = numeroBico;
    }

    public Date getDataAbastecimento() {
        return dataAbastecimento;
    }

    public void setDataAbastecimento(Date dataAbastecimento) {
        this.dataAbastecimento = dataAbastecimento;
    }

    public Date getHoraAbastecimento() {
        return horaAbastecimento;
    }

    public void setHoraAbastecimento(Date horaAbastecimento) {
        this.horaAbastecimento = horaAbastecimento;
    }

    public BigDecimal getEncerrante() {
        return encerrante;
    }

    public void setEncerrante(BigDecimal encerrante) {
        this.encerrante = encerrante;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public Long getFrentista() {
        return frentista;
    }

    public void setFrentista(Long frentista) {
        this.frentista = frentista;
    }
}
