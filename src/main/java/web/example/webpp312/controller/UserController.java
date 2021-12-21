package web.example.webpp312.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.example.webpp312.dao.UserDAO;
import web.example.webpp312.model.User;
import web.example.webpp312.services.UserService;


@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping()
    public String showUser(Model model) {

        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("user", user);
        return "_user";
    }
}
