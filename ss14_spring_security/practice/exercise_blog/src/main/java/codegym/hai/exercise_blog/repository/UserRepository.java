package codegym.hai.exercise_blog.repository;

import codegym.hai.exercise_blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String userName);
}
