package pl.wpe.springconfig.controller.v2;

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
@RequestMapping("/api/v2")
public class InfoControllerV2 {

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

    @GetMapping(path = "/info/parametry/{prefix}")
    public List<Parametr> infoParametryEnds(@PathVariable("prefix") String prefix) {
        return akeService.getParametry().stream().filter(p -> p.getNazwa().startsWith(prefix)).collect(Collectors.toList());
    }
}
