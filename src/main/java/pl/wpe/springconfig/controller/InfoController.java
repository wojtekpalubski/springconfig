package pl.wpe.springconfig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.wpe.springconfig.config.Parametr;
import pl.wpe.springconfig.service.AkeService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1")
public class InfoController {

    @Autowired
    AkeService akeService;

    @GetMapping(path = "/info")
    public String info() {
        return akeService.getConfig();
    }

    @GetMapping(path = "/info/role")
    public List<String> infoRole() {
        return akeService.getRole();
    }

    @GetMapping(path = "/info/parametry")
    public List<Parametr> infoParametry() {
        return akeService.getParametry();
    }

    @GetMapping(path = "/info/parametry/{koncowka}")
    public List<Parametr> infoParametryEnds(@PathVariable("koncowka") String koncowka) {
        return akeService.getParametry().stream().filter(p -> p.getNazwa().endsWith(koncowka)).collect(Collectors.toList());
    }
}
