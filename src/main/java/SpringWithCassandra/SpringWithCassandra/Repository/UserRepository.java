package SpringWithCassandra.SpringWithCassandra.Repository;

import SpringWithCassandra.SpringWithCassandra.Model.User;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UserRepository extends CassandraRepository<User , Integer> {
}
