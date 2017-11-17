package ohtu.controller;

import ohtu.domain.Vinkki;
import ohtu.domain.VinkkiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class VinkkiController {

    @Autowired
    private VinkkiRepository vinkkiRepository;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("vinkit", vinkkiRepository.findAll());
        return "index";
    }

    @GetMapping("/kirjoittajat")
    public String naytaKirjoittajat(Model model) {
        model.addAttribute("vinkit", vinkkiRepository.findAll());
        return "kirjoittajat";
    }
    
    @PostMapping("/kirjoittajat")
    public String lisaaVinkki(@RequestParam String kirjoittaja){
        Vinkki uusiVinkki = new Vinkki();
        uusiVinkki.setKirjoittaja(kirjoittaja);
        vinkkiRepository.save(uusiVinkki);
        return "redirect:/kirjoittajat";
    }
}