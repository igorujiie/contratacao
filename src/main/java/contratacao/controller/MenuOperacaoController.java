package contratacao.controller;

import contratacao.domain.model.Moeda;
import contratacao.service.ClienteService;
import contratacao.service.MoedaService;
import contratacao.service.TaxaService;
import contratacao.view.MenuOperacao;
import contratacao.view.TelaBoasVindas;

import java.util.Scanner;

public class MenuOperacaoController {

    static Scanner sc = new Scanner(System.in);
    static TelaBoasVindas telaBoasVindas = new TelaBoasVindas();
    static MenuOperacao menuOperacao = new MenuOperacao();
    static ClienteController clienteController = new ClienteController();
    static FuncionarioController funcionarioController = new FuncionarioController();
    static MoedaService moedaService = new MoedaService();
    static ClienteService clienteService = new ClienteService();
    static TaxaService taxaService = new TaxaService();
    static OperacaoDeCambioController operacaoDeCambioController = new OperacaoDeCambioController();

    public static void main(String[] args) {
        telaBoasVindas.exibirTelaInicial();
        menuOperacao.exibirMenuOperacao();
        int opcao = menuOperacao.lerOpcao();

        while (opcao != 7) {
            switch (opcao) {
                case 1:
                    System.out.println("Gerenciamento de cliente");
                    clienteController.iniciar();
                    break;
                case 2:
                    System.out.println("Gerenciamento de Funcionario");
                    funcionarioController.iniciar();
                    break;
                case 3:
                    System.out.println("Gerenciamento de Moeda");
                    break;
                case 4:
                    System.out.println("Listar cotações");
                    break;
                case 5:
                    System.out.println("Comprar Moeda");
                    operacaoDeCambioController.comprarMoeda();
                    break;
                case 6:
                    System.out.println("Vender Moeda");
                    operacaoDeCambioController.venderMoeda();
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            menuOperacao.exibirMenuOperacao();
            opcao = menuOperacao.lerOpcao();
        }
    }
}