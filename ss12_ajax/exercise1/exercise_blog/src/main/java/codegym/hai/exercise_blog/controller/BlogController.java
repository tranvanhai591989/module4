package codegym.hai.exercise_blog.controller;

import antlr.collections.List;
import codegym.hai.exercise_blog.model.Blog;
import codegym.hai.exercise_blog.model.Type;
import codegym.hai.exercise_blog.service.BlogService;
import codegym.hai.exercise_blog.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")
@CrossOrigin
public class BlogController {
    @Autowired
    private BlogService blogService;

    @Autowired
    private TypeService typeService;

    @GetMapping
    public ResponseEntity<Page<Blog>> getBlogList(Pageable pageable) {
        Page<Blog> blogList = blogService.findAll(pageable);
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity addBlog(@RequestBody Blog blog) {
        blogService.save(blog);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<Blog> updateBlog(@PathVariable int id, @RequestBody Blog blog) {
        Blog currenBlog = blogService.findById(id);
        if (currenBlog == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        currenBlog.setCommitDay(blog.getCommitDay());
        currenBlog.setContent(blog.getContent());
        currenBlog.setType(blog.getType());
        blogService.save(currenBlog);
        return new ResponseEntity<>(currenBlog, HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Blog> deleteBlog(@PathVariable int id, @RequestBody Blog blog) {
        Blog deleteBlog = blogService.findById(id);
        if (deleteBlog == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        blogService.delete(id);
        return new ResponseEntity<>(deleteBlog, HttpStatus.OK);
    }

    @GetMapping("/type")
    public ResponseEntity<List<Type>> typeList() {
        List<Type> typeList = typeService.findAll();
        if (typeList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(typeList, HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<Page<Blog>> getBlogList(@RequestParam String name, Pageable pageable) {
        Page<Blog> blogList = blogService.searchByName(name, pageable);
        if (blogList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(blogList, HttpStatus.OK);
    }
}
