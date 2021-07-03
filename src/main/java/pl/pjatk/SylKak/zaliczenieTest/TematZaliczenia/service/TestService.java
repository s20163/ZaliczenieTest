package pl.pjatk.SylKak.zaliczenieTest.TematZaliczenia.service;

import org.springframework.stereotype.Service;
import pl.pjatk.SylKak.zaliczenieTest.TematZaliczenia.exception.ZaliczenieModelNotFoundException;
import pl.pjatk.SylKak.zaliczenieTest.TematZaliczenia.model.ZaliczenieModel;

import java.util.Optional;

@Service
public class TestService {

    private final TestRepository testRepository;

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public Optional<ZaliczenieModel> getZaliczenieModel(Long zaliczenieModelId) {
        if(testRepository.listZaliczenieModelById(zaliczenieModelId).isEmpty()) {
            throw new ZaliczenieModelNotFoundException();
        }
        return testRepository.listZaliczenieModelById(zaliczenieModelId);
    }
}
