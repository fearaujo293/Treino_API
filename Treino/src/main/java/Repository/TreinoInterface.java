package Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.TreinoModel;

public interface TreinoInterface extends JpaRepository<TreinoModel, Long> {
}