package ohtu.controller;

import ohtu.domain.VinkkiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VinkkiController {

    @Autowired
    private VinkkiRepository vinkkiRepository;

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "index";
    }

    @GetMapping("/other")
    @ResponseBody
    public String other() {
        return "Hei Maailma!";
    }
}