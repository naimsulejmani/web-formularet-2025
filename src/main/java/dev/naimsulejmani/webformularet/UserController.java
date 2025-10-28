package dev.naimsulejmani.webformularet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    //http://localhost:9090/users/register
    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new User());
        return "users/register";
    }
    @PostMapping("/register")
    public String register(@ModelAttribute User user) {
        System.out.println(user);
        return "redirect:/";
    }
}
