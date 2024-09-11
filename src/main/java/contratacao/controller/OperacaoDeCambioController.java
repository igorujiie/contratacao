package contratacao.controller;

import contratacao.domain.model.Cliente;
import contratacao.domain.model.Moeda;
import contratacao.service.ClienteService;
import contratacao.service.MoedaService;
import contratacao.service.OperacaoDeCambioService;

import java.util.List;
import java.util.Scanner;

public class OperacaoDeCambioController {
    OperacaoDeCambioService operacaoDeCambioService = new OperacaoDeCambioService();
    MoedaService moedaService = new MoedaService();
    ClienteService clienteService = new ClienteService();
    Scanner sc = new Scanner(System.in);

    public void comprarMoeda() {
        Cliente cliente = selecionarCliente();
        Moeda moedaOrigem = selecionarMoeda("origem");
        Moeda moedaDestino = selecionarMoeda("destino");
        System.out.println("Digite o valor da operação: ");
        double valor = sc.nextDouble();
        double valorEmReais = operacaoDeCambioService.comprarMoeda(cliente, moedaOrigem, moedaDestino, valor);
        System.out.println("Valor em reais: " + valorEmReais);
    }

    public void venderMoeda() {
        Cliente cliente = selecionarCliente();
        Moeda moedaOrigem = selecionarMoeda("origem");
        Moeda moedaDestino = selecionarMoeda("destino");
        System.out.println("Digite o valor da operação: ");
        double valor = sc.nextDouble();
        double venda = operacaoDeCambioService.venderMoeda(cliente, moedaOrigem, moedaDestino, valor);
        System.out.println("Valor em reais: " + venda);
    }

    private Cliente selecionarCliente() {
        System.out.println("Selecione o cliente:");
        List<Cliente> clientes = clienteService.findAll();
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + " - " + clientes.get(i).getNome());
        }
        int opcao = sc.nextInt();
        return clientes.get(opcao - 1);
    }

    private Moeda selecionarMoeda(String tipo) {
        System.out.println("Selecione a moeda de " + tipo + ":");
        List<Moeda> moedas = moedaService.findAll();
        for (int i = 0; i < moedas.size(); i++) {
            System.out.println((i + 1) + " - " + moedas.get(i).getNome());
        }
        int opcao = sc.nextInt();
        return moedas.get(opcao - 1);
    }

    public void listarOperacoesDeCambio() {

    }

    public void buscarOperacaoDeCambio() {

    }

    public void atualizarOperacaoDeCambio() {

    }

    public void deletarOperacaoDeCambio() {

    }
}

