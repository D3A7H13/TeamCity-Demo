package softuni.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MathController {

    @GetMapping("/add/{firstOperand}/{secondOperand}")
    public String add(@PathVariable Long firstOperand, @PathVariable Long secondOperand, Model model) {
        model.addAttribute("result", firstOperand + secondOperand);

        return "layout";
    }

    @GetMapping("/")
    public String home() {
        return "layout";
    }
}
