package borrowbook.borrow_books.restController;

import java.util.List;

import borrowbook.borrow_books.model.Category;
import borrowbook.borrow_books.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/rest/category")
public class CategoryRestController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(value = {"/", "/list"})
    public List<Category> all() {
        return categoryService.getAll();
    }

}