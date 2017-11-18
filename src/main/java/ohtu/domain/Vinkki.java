package ohtu.domain;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.transaction.Transactional;
import java.net.URI;

@Entity
public class Vinkki extends AbstractPersistable<Long>  {

    @ManyToOne
    private Kirjoittaja kirjoittaja;

    private String otsikko;
    private String ISBN;
    private String tyyppi;
    private String tagit;
    private String esitietoKurssit;
    private String relatedCourses;
    private String kommentti;
    private URI url;

    @Transactional
    public Kirjoittaja getKirjoittaja() {
        return this.kirjoittaja;
    }

    @Transactional
    public void setKirjoittaja(Kirjoittaja kirjoittaja) {
        this.kirjoittaja = kirjoittaja;
    }

    @Transactional
    public String getOtsikko() {
        return otsikko;
    }

    @Transactional
    public void setOtsikko(String otsikko) {
        this.otsikko = otsikko;
    }

    @Transactional
    public String getISBN() {
        return ISBN;
    }

    @Transactional
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Transactional
    public String getTyyppi() {
        return tyyppi;
    }

    @Transactional
    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }

    @Transactional
    public String getTagit() {
        return tagit;
    }

    @Transactional
    public void setTagit(String tagit) {
        this.tagit = tagit;
    }

    @Transactional
    public String getEsitietoKurssit() {
        return esitietoKurssit;
    }

    @Transactional
    public void setEsitietoKurssit(String esitietoKurssit) {
        this.esitietoKurssit = esitietoKurssit;
    }

    @Transactional
    public String getRelatedCourses() {
        return relatedCourses;
    }

    @Transactional
    public void setRelatedCourses(String relatedCourses) {
        this.relatedCourses = relatedCourses;
    }

    @Transactional
    public String getKommentti() {
        return kommentti;
    }

    @Transactional
    public void setKommentti(String kommentti) {
        this.kommentti = kommentti;
    }

    @Transactional
    public URI getUrl() {
        return url;
    }

    @Transactional
    public void setUrl(URI url) {
        this.url = url;
    }
}  
    
    
    

