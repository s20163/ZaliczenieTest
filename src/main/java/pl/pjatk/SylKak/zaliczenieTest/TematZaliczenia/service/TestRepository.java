package pl.pjatk.SylKak.zaliczenieTest.TematZaliczenia.service;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pjatk.SylKak.zaliczenieTest.TematZaliczenia.model.TestModel;

public interface TestRepository extends JpaRepository<TestModel, Long> {

}