package br.com.grands.fashionmanagerclient.modelo.produto;

import br.com.grands.fashionmanagerclient.modelo.foto.Foto;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.List;


public class ItemGrade {
    @ApiModelProperty(value = "Array de strings que indicam a variação do produto. Cada posição do array deve ser um valor da característica informada " +
            "na posição respectiva no tipo de produto. Por exemplo, se o tipo do produto tiver a variação [cor, tamanho], cada variação do produto deve ser " +
            " no padrão [corCadastrada, tamanhoCadastrado], onde o valor corCadastrada é um valor da característica cor e tamanhoCadastrado é um valor da característica tamanho", required = true)
    public String[] variacao;
    @ApiModelProperty(value = "Valor do estoque inicial do produto, caso não for informado, será utilizado o valor do produto pai.", position = 1)
    public BigDecimal estoque;
    @ApiModelProperty(value = "Nome do item de variação. Caso não seja informado, será montado utilizando o nome do produto pai e as variações informadas.", position = 2)
    public String nomevariacao;
    @ApiModelProperty(value = "Valor do pesoLiquido do produto, caso não for informado, será utilizado o valor do produto pai.", position = 3)
    public BigDecimal pesoliquido;
    @ApiModelProperty(value = "Valor do pesoBruto do produto, caso não for informado, será utilizado o valor do produto pai.", position = 4)
    public BigDecimal pesobruto;
    @ApiModelProperty(value = "Valor do SKU da variação. Esse valor deve ser único por organização. " +
            "Caso não seja informado, será gerado a partir do SKU do produto pai e a variação informada.", position = 5)
    public String sku;
    @ApiModelProperty(value = "Lista de códigos de barras deste produto. Caso não seja informado nenhum, será gerado um código pelo sistema.", position = 6)
    public List<CodigoBarras> codigosbarras;
    @ApiModelProperty(value = "Lista com as fotos do item de variação. Caso não seja informado nenhuma, serão utilizadas as fotos do produto.", position = 7)
    public List<Foto> fotos;


}
