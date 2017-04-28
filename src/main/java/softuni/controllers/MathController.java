package softuni.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MathController {

    @GetMapping("/{firstOperand}/add/{secondOperand}")
    public String add(@PathVariable Long firstOperand, @PathVariable Long secondOperand, Model model) {
        model.addAttribute("result", firstOperand + secondOperand);

        return "layout";
    }

    @GetMapping("/")
    public String home() {
        return "layout";
    }

    @GetMapping("/{first}/mul/{second}")
    public String mul(@PathVariable Long first, @PathVariable Long second, Model model) {
        model.addAttribute("result", first * second);

        return "layout";
    }

    @GetMapping("/{first}/div/{second}")
    public String div(@PathVariable Long first, @PathVariable Long second, Model model){
        model.addAttribute("result", first / second);

        return "layout";
    }
}
