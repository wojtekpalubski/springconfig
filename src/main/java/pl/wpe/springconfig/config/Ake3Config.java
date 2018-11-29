package pl.wpe.springconfig.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.java.Log;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@ConfigurationProperties(prefix = "ake3")
@Getter
@Setter
@ToString
@Log
/**
 * prefixu parametrów konfiguracyjnych wcale nie musi być w properitsach ani w yml
 */
public class Ake3Config {
    private String ake3wartosc1 = "ake3wartosc1";
    private String ake3wartosc2 = "ake3wartosc2";

    @PostConstruct
    public void printConfig() {
        log.info(this.toString());
    }
}
