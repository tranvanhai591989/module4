package codegym.hai.exercise_blog.service;

import codegym.hai.exercise_blog.model.Blog;
import codegym.hai.exercise_blog.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TypeService {
    List<Type> findAll();

}
