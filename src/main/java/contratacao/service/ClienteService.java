// Classe ClienteService
package contratacao.service;

import contratacao.domain.model.Cliente;
import contratacao.domain.model.Conta;
import contratacao.repository.ClienteRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteService implements ClienteRepository<Cliente> {
    private List<Cliente> clientes = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public ClienteService() {
        inicializarClientes();
    }

    private void inicializarClientes() {
        Conta conta1 = new Conta("12345", "001", "Banco A", 1000.0);
        Conta conta2 = new Conta("67890", "002", "Banco B", 2000.0);
        Conta conta3 = new Conta("54321", "003", "Banco C", 3000.0);

        Cliente cliente1 = new Cliente("Cliente 1", "11111111111", "cliente1@example.com", "111111111");
        cliente1.setConta(conta1);
        Cliente cliente2 = new Cliente("Cliente 2", "22222222222", "cliente2@example.com", "222222222");
        cliente2.setConta(conta2);
        Cliente cliente3 = new Cliente("Cliente 3", "33333333333", "cliente3@example.com", "333333333");
        cliente3.setConta(conta3);

        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
    }

    public Cliente prrencherCadastroCliente() {
        Cliente cliente = new Cliente("", "", "", "");
        System.out.println("Digite o nome do cliente: ");
        cliente.setNome(sc.nextLine());
        System.out.println("Digite o cpf do cliente: ");
        cliente.setCpf(sc.nextLine());
        System.out.println("Digite o email do cliente: ");
        cliente.setEmail(sc.nextLine());
        System.out.println("Digite o telefone do cliente: ");
        cliente.setTelefone(sc.nextLine());
        return cliente;
    }

    @Override
    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public void atualizarCliente(Cliente cliente) {
    }

    @Override
    public void deletarCliente(Cliente cliente) {
    }

    @Override
    public List<Cliente> findAll() {
        return new ArrayList<>(clientes);
    }
}