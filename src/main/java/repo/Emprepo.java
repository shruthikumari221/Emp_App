package repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Emprepo<Employee> extends MongoRepository<Employee,String> {
}