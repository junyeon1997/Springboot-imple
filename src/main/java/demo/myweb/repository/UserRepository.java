package demo.myweb.repository;

import demo.myweb.model.Board;
import demo.myweb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
