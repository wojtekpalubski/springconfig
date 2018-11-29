package pl.wpe.springconfig.service;

import io.micrometer.core.instrument.MeterRegistry;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wpe.springconfig.config.Ake3Config;
import pl.wpe.springconfig.config.AkeConfig;
import pl.wpe.springconfig.config.AkeValueConfig;
import pl.wpe.springconfig.config.Parametr;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Log
public class AkeService {
    @Autowired
    private AkeConfig config;

    @Autowired
    private AkeValueConfig akeValueConfig;

    @Autowired
    private Ake3Config ake3Config;

    @Autowired
    private MeterRegistry meterRegistry;

    @Autowired
    private WyjatekService wyjatekService;

    public String getConfig() {
        log.info("Cala konfiguracja: " + config.toString());
        meterRegistry.counter("AkeService","getConfig","ilosc").increment();
        return config.toString();
    }

    public List<String> getRole() {
        log.info("Lista rol: " + config.getRole().toString());
        meterRegistry.counter("AkeService","getRole","ilosc").increment();
        return config.getRole();
    }

    public List<Parametr> getParametry() {
        log.info("Lista parametrow: " + config.getParametry().toString());
        meterRegistry.counter("AkeService","getParametry","ilosc").increment();
        wyjatekService.throwWyjatek();
        meterRegistry.counter("AkeService","getParametryOK","ilosc").increment();
        return config.getParametry();
    }

    @Override
    public String toString() {
        return config+" "+akeValueConfig+" "+akeValueConfig;
    }

    @PostConstruct
    public void printConfig() {
        log.info(this.toString());
    }
}
