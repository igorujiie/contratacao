package contratacao.repository;

import contratacao.domain.model.Cliente;

import java.util.List;

public interface ClienteRepository<T> {
    void cadastrarCliente(T t);
    void cadastrarCliente(Cliente cliente);
    void atualizarCliente(T t);
    void deletarCliente(T t);
    List<T> findAll();

}
