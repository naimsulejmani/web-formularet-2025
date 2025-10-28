package dev.naimsulejmani.webformularet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/news")
public class NewsController {

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("news", new News());
        return "news/register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute News news) {
        System.out.println(news);
        return "redirect:/news/register";
    }
}
