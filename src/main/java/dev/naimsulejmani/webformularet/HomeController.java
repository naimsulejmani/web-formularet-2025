package dev.naimsulejmani.webformularet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping
    public String index() {
        return "index";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user) {
        System.out.println(user);
        return "redirect:/";
    }

    @GetMapping("/register")
    public String register1(@RequestParam String name) {
        return "index";
    }
}
