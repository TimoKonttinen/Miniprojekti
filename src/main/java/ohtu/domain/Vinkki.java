package ohtu.domain;

import java.net.URI;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Entity
public class Vinkki extends AbstractPersistable<Long>  {

    private String kirjoittaja;
    private String otsikko;
    private String ISBN;
    private String tyyppi;
    private String tagit;
    private String esitietoKurssit;
    private String relatedCourses;
    private String kommentti;
    private URI url;

 /**
     * @return the kirjoittaja
     */
    public String getKirjoittaja() {
        return kirjoittaja;
    }

    /**
     * @param kirjoittaja the kirjoittaja to set
     */
    public void setKirjoittaja(String kirjoittaja) {
        this.kirjoittaja = kirjoittaja;
    }

    /**
     * @return the otsikko
     */
    public String getOtsikko() {
        return otsikko;
    }

    /**
     * @param otsikko the otsikko to set
     */
    public void setOtsikko(String otsikko) {
        this.otsikko = otsikko;
    }

    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return the tyyppi
     */
    public String getTyyppi() {
        return tyyppi;
    }

    /**
     * @param tyyppi the tyyppi to set
     */
    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }

    /**
     * @return the tagit
     */
    public String getTagit() {
        return tagit;
    }

    /**
     * @param tagit the tagit to set
     */
    public void setTagit(String tagit) {
        this.tagit = tagit;
    }

    /**
     * @return the esitietoKurssit
     */
    public String getEsitietoKurssit() {
        return esitietoKurssit;
    }

    /**
     * @param esitietoKurssit the esitietoKurssit to set
     */
    public void setEsitietoKurssit(String esitietoKurssit) {
        this.esitietoKurssit = esitietoKurssit;
    }

    /**
     * @return the relatedCourses
     */
    public String getRelatedCourses() {
        return relatedCourses;
    }

    /**
     * @param relatedCourses the relatedCourses to set
     */
    public void setRelatedCourses(String relatedCourses) {
        this.relatedCourses = relatedCourses;
    }

    /**
     * @return the kommentti
     */
    public String getKommentti() {
        return kommentti;
    }

    /**
     * @param kommentti the kommentti to set
     */
    public void setKommentti(String kommentti) {
        this.kommentti = kommentti;
    }

    /**
     * @return the url
     */
    public URI getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(URI url) {
        this.url = url;
    }
}  
    
    
    

