package ohtu.controller;

import ohtu.domain.Kirjoittaja;
import ohtu.domain.KirjoittajaRepository;
import ohtu.domain.Vinkki;
import ohtu.domain.VinkkiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class VinkkiController {

    @Autowired
    private VinkkiRepository vinkkiRepository;
    @Autowired
    private KirjoittajaRepository kirjoittajaRepository;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("vinkit", vinkkiRepository.findAll());
        return "index";
    }

    @PostMapping("/")
    public String kirjautuminenPOST(@RequestParam String kayttajanimi, @RequestParam String salasana){
        return "redirect:/vinkki";
    }

    @GetMapping("/vinkki")
    public String naytaVinkit(Model model) {
        model.addAttribute("vinkit", vinkkiRepository.findAll());
        return "vinkki";
    }
    
    @PostMapping("/vinkki")
    public String lisaaVinkki(@RequestParam String kirjoittaja, @RequestParam String otsikko, @RequestParam String tyyppi, @RequestParam String kommentti) {
        Vinkki uusiVinkki = new Vinkki();
        Kirjoittaja uusiKirjoittaja = kirjoittajaRepository.findByName(kirjoittaja);
        if(uusiKirjoittaja == null){
            uusiKirjoittaja = new Kirjoittaja();
            uusiKirjoittaja.setName(kirjoittaja);
            kirjoittajaRepository.saveAndFlush(uusiKirjoittaja);
        }

        uusiVinkki.setKirjoittaja(uusiKirjoittaja);
        uusiVinkki.setOtsikko(otsikko);
        uusiVinkki.setTyyppi(tyyppi);
        uusiVinkki.setKommentti(kommentti);
        vinkkiRepository.saveAndFlush(uusiVinkki);
        return "redirect:/vinkki";
    }

    // DeleteMapping?
    // HTML formit ei tue metodiaa DELETE
    @PostMapping("/vinkki/{id}/delete")
    public String poistaVinkki(@PathVariable long id) {
        vinkkiRepository.delete(id);
        return "redirect:/vinkki";
    }
}