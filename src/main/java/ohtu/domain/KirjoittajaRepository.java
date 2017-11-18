package ohtu.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface KirjoittajaRepository extends JpaRepository<Kirjoittaja, Long> {
    Kirjoittaja findByName(String name);
}
