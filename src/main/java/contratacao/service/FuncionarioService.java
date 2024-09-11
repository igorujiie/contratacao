package contratacao.service;

import contratacao.domain.model.Cliente;
import contratacao.domain.model.Funcionario;
import contratacao.repository.FuncionarioRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FuncionarioService  implements FuncionarioRepository {
    private List<Funcionario> funcionarios = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    @Override
    public void cadastrar(Funcionario funcionario) {

    }

    @Override
    public void remover(Funcionario funcionario) {

    }

    @Override
    public void atualizar(Funcionario funcionario) {

    }

    @Override
    public void listar() {

    }

    @Override
    public void buscar(String cpf) {

    }

    @Override
    public List findAll() {
        return List.of();
    }

    public Funcionario prrencherCadastroFuncionario() {
        Funcionario funcionario = new Funcionario("", "");
        System.out.println("Digite o nome do funcionario: ");
        funcionario.setNome(sc.nextLine());
        System.out.println("Digite o cargo do funcionario: ");
        funcionario.setCargo(sc.nextLine());
        return funcionario;
    }
}
