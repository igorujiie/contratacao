// Classe MoedaService
package contratacao.service;

import contratacao.domain.model.Cliente;
import contratacao.domain.model.Conta;
import contratacao.domain.model.Moeda;
import contratacao.repository.ClienteRepository;
import contratacao.repository.MoedaRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoedaService implements MoedaRepository {
    private List<Moeda> moedas = new ArrayList<>();

    public MoedaService() {
        inicializarMoedas();
    }

    private void inicializarMoedas() {
        moedas.add(new Moeda("USD", "Dólar Americano"));
        moedas.add(new Moeda("EUR", "Euro"));
        moedas.add(new Moeda("BRL", "Real Brasileiro"));
    }

    @Override
    public void cadastrarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    @Override
    public void atualizarMoeda(Moeda moeda) {
    }

    @Override
    public void deletarMoeda(Moeda moeda) {
    }

    @Override
    public List<Moeda> findAll() {
        return new ArrayList<>(moedas);
    }
}