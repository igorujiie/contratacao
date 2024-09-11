package contratacao.service;

import contratacao.domain.enums.TipoDeOperacao;
import contratacao.domain.model.Cliente;
import contratacao.domain.model.Moeda;
import contratacao.domain.model.OperacaoCambio;

public class OperacaoDeCambioService {
    private TaxaService taxaService = new TaxaService();

    public double comprarMoeda(Cliente cliente, Moeda moedaOrigem, Moeda moedaDestino, double valor) {
        if (valor <= 100) {
            throw new IllegalArgumentException("O valor tem que ser maior que 100.");
        }

        double taxa = taxaService.buscarTaxa(moedaOrigem, moedaDestino);
        double valorEmReais = valor * taxa;

        OperacaoCambio operacao = new OperacaoCambio(cliente, moedaOrigem, moedaDestino, valor, TipoDeOperacao.COMPRA);
        operacao.validar();
        atualizarSaldo(cliente, valorEmReais, TipoDeOperacao.COMPRA);

        return valorEmReais;
    }

    public double venderMoeda(Cliente cliente, Moeda moedaOrigem, Moeda moedaDestino, double valor) {
        if (valor <= 100) {
            throw new IllegalArgumentException("O valor tem que ser maior que 100.");
        }

        double taxa = taxaService.buscarTaxa(moedaOrigem, moedaDestino);
        double valorEmReais = valor * taxa;

        OperacaoCambio operacao = new OperacaoCambio(cliente, moedaOrigem, moedaDestino, valor, TipoDeOperacao.VENDA);
        operacao.validar();
        atualizarSaldo(cliente, valorEmReais, TipoDeOperacao.VENDA);

        return valorEmReais;
    }

    private void atualizarSaldo(Cliente cliente, double valor, TipoDeOperacao tipoDeOperacao) {
        double saldoAtual = cliente.getConta().getSaldo();
        if (tipoDeOperacao == TipoDeOperacao.COMPRA) {
            cliente.getConta().setSaldo(saldoAtual - valor);
        } else if (tipoDeOperacao == TipoDeOperacao.VENDA) {
            cliente.getConta().setSaldo(saldoAtual + valor);
        }
    }
}