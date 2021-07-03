package pl.pjatk.SylKak.zaliczenieTest.TematZaliczenia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SpringfoxConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.OAS_30)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "TestoweZaliczenie REST API",
                "REST API for Testowe Zaliczenie",
                "PJATK 0.3",
                null,
                new Contact("PJATK", "www.gdansk.pja.edu.pl/pl/", "dziekanat@pjwstk.edu.pl"),
                null,
                null,
                Collections.emptyList()
        );
    }
}
