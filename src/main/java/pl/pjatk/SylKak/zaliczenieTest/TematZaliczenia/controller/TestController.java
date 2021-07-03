package pl.pjatk.SylKak.zaliczenieTest.TematZaliczenia.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.SylKak.zaliczenieTest.TematZaliczenia.service.TestService;

@RestController
@RequestMapping("/api")
public class TestController {
    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }
}
