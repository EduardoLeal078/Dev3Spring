package leal_eduardo.projetomanga.repository;

import leal_eduardo.projetomanga.model.HQEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HQRepository extends CrudRepository<HQEntity, Long> {
}
