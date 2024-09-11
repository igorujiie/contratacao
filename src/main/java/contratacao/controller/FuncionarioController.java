package contratacao.controller;

import contratacao.domain.model.Cliente;
import contratacao.domain.model.Funcionario;
import contratacao.service.ClienteService;
import contratacao.service.FuncionarioService;
import contratacao.view.ClienteView;
import contratacao.view.FuncionarioView;

import java.util.Scanner;

public class FuncionarioController {
    Scanner sc = new Scanner(System.in);
    FuncionarioService funcionarioService = new FuncionarioService();
    FuncionarioView funcionarioView = new FuncionarioView();
    Funcionario funcionario;

    public void iniciar() {
        FuncionarioView.menuCliente();
        int opcao = lerOpcao();

        while (opcao != 6) {
            switch (opcao) {
                case 1:
                    break;
                case 2:

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
        funcionarioView.menuCliente();
    }

    public int lerOpcao() {
        return sc.nextInt();
    }

//    public void cadastrarFuncionario() {
//        Funcionario novoFuncionario = funcionarioService.prrencherCadastroFuncionario();
//        funcionarioService.cadastrar(novoFuncionario);
//    }

}
