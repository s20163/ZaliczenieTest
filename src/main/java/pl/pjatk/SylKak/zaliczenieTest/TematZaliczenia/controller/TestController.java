package pl.pjatk.SylKak.zaliczenieTest.TematZaliczenia.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.pjatk.SylKak.zaliczenieTest.TematZaliczenia.model.ZaliczenieModel;
import pl.pjatk.SylKak.zaliczenieTest.TematZaliczenia.service.TestService;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class TestController {
    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/{zaliczenieModelId}")
    public ResponseEntity<Optional<ZaliczenieModel>> getZaliczenieModel(@PathVariable Long zaliczenieModelId) {
        return ResponseEntity.ok(testService.getZaliczenieModel(zaliczenieModelId));
    }
}
