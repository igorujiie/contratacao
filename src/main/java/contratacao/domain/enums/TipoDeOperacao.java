package contratacao.domain.enums;

public enum TipoDeOperacao {
    COMPRA("C"),
    VENDA("V");

    private final String  value;

    TipoDeOperacao(String value) {
        this.value = value;
    }


}
