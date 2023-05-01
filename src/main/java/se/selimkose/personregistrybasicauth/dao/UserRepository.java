package se.selimkose.personregistrybasicauth.dao;

import org.springframework.data.repository.CrudRepository;
import se.selimkose.personregistrybasicauth.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
}
