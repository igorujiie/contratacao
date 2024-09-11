// Classe ClienteController
package contratacao.controller;

import contratacao.domain.model.Cliente;
import contratacao.service.ClienteService;
import contratacao.view.ClienteView;

import java.util.Scanner;

public class ClienteController {
    Scanner sc = new Scanner(System.in);
    ClienteService clienteService = new ClienteService();
    ClienteView clienteView = new ClienteView();
    Cliente cliente;

    public void iniciar() {
        clienteView.menuCliente();
        int opcao = lerOpcao();

        while (opcao != 6) {
            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    listarClientes();
                    break;
                case 3:
                    System.out.println("Buscar Cliente");
                    break;
                case 4:
                    System.out.println("Atualizar Cliente");
                    break;
                case 5:
                    System.out.println("Deletar Cliente");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            mostrarMenuCliente();
            opcao = lerOpcao();
        }
    }

    public void mostrarMenuCliente() {
        clienteView.menuCliente();
    }

    public int lerOpcao() {
        return sc.nextInt();
    }

    public void cadastrarCliente() {
        Cliente novoCliente = clienteService.prrencherCadastroCliente();
        clienteService.cadastrarCliente(novoCliente);
    }

    public void listarClientes() {
        clienteService.findAll().forEach(System.out::println);
    }
}