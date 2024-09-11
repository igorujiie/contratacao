// Classe TaxaService
package contratacao.service;

import contratacao.domain.model.Moeda;
import contratacao.domain.model.Taxa;
import contratacao.repository.TaxaRepository;

import java.util.ArrayList;
import java.util.List;

public class TaxaService implements TaxaRepository {
    private List<Taxa> taxas = new ArrayList<>();

    public TaxaService() {
        inicializarTaxas();
    }

    private void inicializarTaxas() {
        Moeda usd = new Moeda("USD", "Dólar Americano");
        Moeda eur = new Moeda("EUR", "Euro");
        Moeda brl = new Moeda("BRL", "Real Brasileiro");

        taxas.add(new Taxa(usd, brl, 5.75));
        taxas.add(new Taxa(eur, brl, 6.0));
        taxas.add(new Taxa(brl, usd, 5.9));
    }

    @Override
    public void cadastrarTaxa() {
    }

    @Override
    public void atualizarTaxa() {
    }

    @Override
    public void deletarTaxa() {
    }

    @Override
    public ArrayList<Taxa> findAll() {
        return new ArrayList<>(taxas);
    }

    @Override
    public void buscarTaxa() {
    }

    public double buscarTaxa(Moeda moedaOrigem, Moeda moedaDestino) {
        for (Taxa taxa : taxas) {
            if (taxa.getMoedaOrigem().getCodigo().equals(moedaOrigem.getCodigo()) &&
                taxa.getMoedaDestino().getCodigo().equals(moedaDestino.getCodigo())) {
                return taxa.getTaxa();
            }
        }
        throw new IllegalArgumentException("Taxa de câmbio não encontrada para as moedas fornecidas: " +
                                           moedaOrigem.getCodigo() + " para " + moedaDestino.getCodigo());
    }
}