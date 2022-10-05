package ru.pp1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.pp1.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
