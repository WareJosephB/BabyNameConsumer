package syn.ana.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import syn.ana.persistence.domain.BabyName;

@Repository
public interface BabyNameRepository extends MongoRepository<BabyName, Long> {

}