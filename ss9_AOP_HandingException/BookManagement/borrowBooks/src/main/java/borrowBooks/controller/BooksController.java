package borrowBooks.controller;

import borrowBooks.model.Books;
import borrowBooks.model.Renter;
import borrowBooks.service.BooksService;
import borrowBooks.service.RenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/book")
public class BooksController {
    @Autowired
    private BooksService booksService;
    @Autowired
    private RenterService renterService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("bookList", booksService.findAll());
        return "book/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("book", new Books());
        return "book/create";
    }

    @PostMapping("/save")
    public String addBook(Books books) {
        booksService.save(books);
        return "redirect:/book";
    }

    @GetMapping("/{id}/plus")
    public String negative(@PathVariable("id") int id,Model model) {
        model.addAttribute("book",booksService.findById(id));
        return "/book/plus";
    }

    @GetMapping("/{id}/negative")
    public String plus(@PathVariable("id") int id,Model model) {
        model.addAttribute("book",booksService.findById(id));
        return "/book/negative";
    }

    @PostMapping("/negative")
    public String userNegative(@RequestParam("id")String code,Model model){
        Renter renter = renterService.findByCode(code);
        if (renter==null){
            return "error";
        }else {
            Books books = renter.getBook();
            books.setAmount(books.getAmount()+1);
            renterService.delete(renter);
            return "redirect:/book";
        }
    }


}
