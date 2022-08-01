package borrowBooks.controller;

import borrowBooks.model.Book;
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
        model.addAttribute("book", new Book());
        return "book/create";
    }

    @PostMapping("/save")
    public String addBook(Book book) {
        booksService.save(book);
        return "redirect:/book";
    }

    @GetMapping("/{id}/plus")
    public String bookNegative(@PathVariable("id") int id,Model model) {
        model.addAttribute("book",booksService.findById(id));
        return "/book/plus";
    }

    @GetMapping("/{id}/negative")
    public String bookPlus(@PathVariable("id") int id,Model model) {
        model.addAttribute("book",booksService.findById(id));
        return "/book/plus";
    }

    @PostMapping("/negative")
    public String userNegative(@RequestParam("id")String code,Model model){
        Renter renter = renterService.findByCode(code);
        if (renter==null){
            return "book/error";
        }else {
            Book book = renter.getBook();
            book.setAmount(book.getAmount()+1);
            renterService.delete(renter);
            return "redirect:/book";
        }
    }
}
