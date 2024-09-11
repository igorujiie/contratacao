package contratacao.repository;

import contratacao.domain.model.Taxa;

import java.util.ArrayList;

public interface TaxaRepository {
    void cadastrarTaxa();
    void atualizarTaxa();
    void deletarTaxa();
    ArrayList<Taxa> findAll();
    void buscarTaxa();
}
