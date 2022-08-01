package codegym.hai.exercise_blog.service;

import codegym.hai.exercise_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface BlogService {
    List<Blog> findAll();

    void save(Blog blog);

    void delete(int id);

    void update(Blog blog);

    Optional<Blog> findById(Integer id);

    Page<Blog> searchByName(String name,Pageable pageable);
    Page<Blog> findAll(Pageable pageable);
}
