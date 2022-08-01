package codegym.hai.exercise_blog.repository;

import codegym.hai.exercise_blog.model.Blog;
import codegym.hai.exercise_blog.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface TypeRepository  extends JpaRepository<Type, Integer> {
}
