package codegym.hai.exercise_blog.service;

import codegym.hai.exercise_blog.model.Blog;

import java.util.List;
import java.util.Optional;

public interface BlogService {
    List<Blog> findAll();

    void save(Blog blog);

    void delete(int id);

    void update(Blog blog);

    Optional<Blog> findById(Integer id);

    List<Blog> searchByName(String name);

}
