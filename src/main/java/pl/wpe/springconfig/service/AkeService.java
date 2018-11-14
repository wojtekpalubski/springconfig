package pl.wpe.springconfig.service;

import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wpe.springconfig.config.AkeConfig;
import pl.wpe.springconfig.config.Parametr;

import java.util.List;

@Service
@Log
public class AkeService {
    @Autowired
    private AkeConfig config;

    @Autowired
    private WyjatekService wyjatekService;

    public String getConfig() {
        log.info("Cala konfiguracja: " + config.toString());
        return config.toString();
    }

    public List<String> getRole() {
        log.info("Lista rol: " + config.getRole().toString());
        return config.getRole();
    }

    public List<Parametr> getParametry() {
        log.info("Lista parametrow: " + config.getParametry().toString());
        wyjatekService.throwWyjatek();
        return config.getParametry();
    }
}
