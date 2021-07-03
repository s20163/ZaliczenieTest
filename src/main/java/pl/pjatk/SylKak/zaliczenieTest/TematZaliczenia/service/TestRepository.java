package pl.pjatk.SylKak.zaliczenieTest.TematZaliczenia.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.pjatk.SylKak.zaliczenieTest.TematZaliczenia.model.ZaliczenieModel;

import java.util.Optional;

public interface TestRepository extends JpaRepository<ZaliczenieModel, Long> {

    @Query("SELECT z FROM ZaliczenieModel z WHERE z.id = :id")
    Optional<ZaliczenieModel> listZaliczenieModelById(long id);
}

//@Query("update Movie m set m.isAvailable = :isAvailable where m.id = :id")