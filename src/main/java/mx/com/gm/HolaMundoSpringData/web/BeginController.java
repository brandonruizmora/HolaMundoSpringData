package mx.com.gm.HolaMundoSpringData.web;

import lombok.var;
import mx.com.gm.HolaMundoSpringData.dao.IPersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BeginController {

    @Autowired
    IPersonDao iPersonDao;

    @GetMapping("/")
    public String start(Model model) {

        var people = iPersonDao.findAll();

        model.addAttribute("people", people);
        return "index";
    }
}
