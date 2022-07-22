package codegym.hai.exercise_blog.service;

import codegym.hai.exercise_blog.model.Blog;
import codegym.hai.exercise_blog.model.Type;
import codegym.hai.exercise_blog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public void update(Blog blog) {
        blogRepository.update(blog.getContent(), blog.getType().getIdType(), blog.getCommit(), blog.getId());

    }

    @Override
    public Optional<Blog> findById(Integer id) {
        return blogRepository.findById(id);
    }

    @Override
    public Page<Blog> searchByName(String name,Pageable pageable) {
        return blogRepository.searchByName("%" + name + "%",pageable);
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }
}
