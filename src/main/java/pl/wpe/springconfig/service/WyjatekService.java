package pl.wpe.springconfig.service;

import lombok.extern.java.Log;
import org.springframework.stereotype.Component;
import pl.wpe.springconfig.wyjatki.ZaDokladnaLiczbaException;
import pl.wpe.springconfig.wyjatki.ZaDuzaLiczbaException;
import pl.wpe.springconfig.wyjatki.ZaMalaLiczbaException;

@Component
@Log
public class WyjatekService {

    public void throwWyjatek() {
        double los = Math.random();
        log.info("Sprawdzam czy trzeba wyrzucic wyjatek");
        if (los > 0.5) {
            log.severe("Wyrzucam wyjatek " + los);
            throw new ZaDuzaLiczbaException("Wylosowano " + los);
        }
        if (los < 0.1) {
            log.severe("Wyrzucam wyjatek " + los);
            throw new ZaMalaLiczbaException("Wylosowano " + los);
        }
        if (los > 0.35 && los < 0.4) {
            log.severe("Wyrzucam wyjatek " + los);
            throw new ZaDokladnaLiczbaException("Wylosowano " + los);
        }
    }
}
