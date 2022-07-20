package codegym.hai.exercise_blog.service;

import codegym.hai.exercise_blog.model.Blog;

import java.util.List;

public interface BlogService {
    List<Blog> findAll();

    void save(Blog blog);

    void delete(int id);

    void update(Blog blog);

    Blog findById(Integer id);

    List<Blog> searchByName(String name);

}
