package borrowbook.borrow_books.restController;

import java.util.List;

import borrowbook.borrow_books.model.Member;
import borrowbook.borrow_books.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/rest/member")
public class MemberRestController {

    @Autowired
    private MemberService memberService;

    @GetMapping(value = {"/", "/list"})
    public List<Member> all() {
        return memberService.getAll();
    }

}