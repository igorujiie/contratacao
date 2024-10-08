package contratacao.domain.model;

import contratacao.domain.enums.StatusOperacao;
import contratacao.domain.enums.TipoDeOperacao;

public class  OperacaoCambio {
    private Cliente cliente;
    private Moeda moedaOrigem;
    private Moeda moedaDestino;
    private double valor;
    private StatusOperacao status;
    private TipoDeOperacao tipoDeOperacao;

    public OperacaoCambio(Cliente cliente, Moeda moedaOrigem, Moeda moedaDestino, double valor, TipoDeOperacao tipoDeOperacao) {
        this.cliente = cliente;
        this.moedaOrigem = moedaOrigem;
        this.moedaDestino = moedaDestino;
        this.valor = valor;
        this.status = StatusOperacao.PENDENTE;
        this.tipoDeOperacao = tipoDeOperacao;
    }

    public void validar() {
        if (valor <= 100) {
            throw new IllegalArgumentException("O valor tem que ser maior que 100.");
        }
    }

    public void cancelarOperacao() {
        if (status == StatusOperacao.PENDENTE) {
            status = StatusOperacao.CANCELADA;
        }
    }

    public StatusOperacao getStatus() {
        return status;
    }

    public void setStatus(StatusOperacao status) {
        this.status = status;
    }

    public TipoDeOperacao getTipoDeOperacao() {

        return tipoDeOperacao;
    }

    public void setTipoDeOperacao(TipoDeOperacao tipoDeOperacao) {

        this.tipoDeOperacao = tipoDeOperacao;
    }
}

