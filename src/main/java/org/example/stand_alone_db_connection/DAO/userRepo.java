package org.example.stand_alone_db_connection.DAO;

import org.example.stand_alone_db_connection.Entities.User;
import org.springframework.data.repository.CrudRepository;

public interface userRepo extends CrudRepository<User,Integer> {
}
