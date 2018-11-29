package pl.wpe.springconfig.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@Getter
@Setter
@ToString
@Log
/**
 * Wartości wstrzykiwane przez Value muszą być zdefiniowane w properties albo yml nawet jeśli mają domyślną wartość w klasie
 */
public class AkeValueConfig {

    @Value("${ake2.wartosc1}")
    private String ake2wartosc1 = "ake2wartosc1";

    @Value("${ake2.wartosc2}")
    private String ake2wartosc2;

    @PostConstruct
    public void printConfig() {
        log.info(this.toString());
    }
}
