package mx.com.gm.HolaMundoSpringData.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BeginController {

    @GetMapping("/")
    public String start() {
        return "index";
    }
}
