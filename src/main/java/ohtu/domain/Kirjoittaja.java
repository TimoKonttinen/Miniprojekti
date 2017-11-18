package ohtu.domain;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Kirjoittaja extends AbstractPersistable<Long>  {

    private String name;

    @OneToMany(mappedBy = "kirjoittaja")
    private List<Vinkki> vinkit = new ArrayList<>();

    @Transactional
    public String getName() {
        return name;
    }

    @Transactional
    public void setName(String nimi) {
        this.name = nimi;
    }

    @Transactional
    public List<Vinkki> getVinkit() {
        return vinkit;
    }

    @Transactional
    public void setVinkit(List<Vinkki> vinkit) {
        this.vinkit = vinkit;
    }
}
