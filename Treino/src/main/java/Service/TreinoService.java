package Service;



import Model.TreinoModel;
import Repository.TreinoInterface;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreinoService {

    private final TreinoInterface repository;

    public TreinoService(TreinoInterface repository) {
        this.repository = repository;
    }

    public List<TreinoModel> listarTodos() {
        return repository.findAll();
    }

    public TreinoModel buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public TreinoModel salvar(TreinoModel treino) {
        return repository.save(treino);
    }

    public TreinoModel atualizar(Long id, TreinoModel treino) {
        treino.setId(id);
        return repository.save(treino);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
