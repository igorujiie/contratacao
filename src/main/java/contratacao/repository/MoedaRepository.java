package contratacao.repository;

import contratacao.domain.model.Moeda;

import java.util.List;

public interface MoedaRepository {
    void cadastrarMoeda(Moeda moeda);
    void atualizarMoeda(Moeda moeda);
    void deletarMoeda(Moeda moeda);
    List<Moeda> findAll();
}
