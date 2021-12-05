package learn.springframework.Spring5Application.controller;

import learn.springframework.Spring5Application.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    @Autowired
    AuthorRepository authorRepository;

    @RequestMapping("/authors")
    public String getAuthor(Model model){
        model.addAttribute("authors",authorRepository.findAll());
        return "author_list";
    }
}
