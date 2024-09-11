package contratacao.repository;

import contratacao.domain.model.Funcionario;

import java.util.List;

public interface FuncionarioRepository<T> {
    void cadastrar(Funcionario funcionario);
    void remover(Funcionario funcionario);
    void atualizar(Funcionario funcionario);
    void listar();
    void buscar(String cpf);
    List<T> findAll();

}
