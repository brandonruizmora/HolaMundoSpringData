package mx.com.gm.HolaMundoSpringData.web;

import mx.com.gm.HolaMundoSpringData.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BeginController {

    @GetMapping("/")
    public String start(Model model) {

        Person person1 = new Person();
        person1.setName("Brandon");
        person1.setLastName("Ruiz");
        person1.setEmail("bruiz@email.com");
        person1.setPhone("1234567890");

        model.addAttribute("person", person1);
        return "index";
    }
}
