package pl.wpe.springconfig.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.java.Log;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "ake")
@Getter
@Setter
@ToString
@Log
/**
 * najpierw czyta application.yml potem application.properties
 */
public class AkeConfig {
    private String host = "host";
    private String port = "port";
    private String protokol = "http";
    private Konfig konfig;
    private List<String> role = Arrays.asList("rola1", "rola2");
    private List<Parametr> parametry;
    private Long liczba = 100L;

    @PostConstruct
    public void printConfig() {
        log.info(this.toString());
    }
}
