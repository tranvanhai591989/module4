package codegym.hai.exercise_blog.service;

import codegym.hai.exercise_blog.model.Blog;
import codegym.hai.exercise_blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void delete(int id) {
        blogRepository.deleteById(id);
    }

    @Override
    public void update( Blog blog) {
        blogRepository.save(blog);

    }

    @Override
    public Blog findById(Integer id) {
        return blogRepository.findById2(id);
    }

    @Override
    public List<Blog> searchByName(String name) {
        return blogRepository.searchByName(name);
    }
}
