package pl.pjatk.SylKak.zaliczenieTest.TematZaliczenia.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

    private final TestRepository testRepository;

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

}
