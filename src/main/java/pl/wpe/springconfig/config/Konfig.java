package pl.wpe.springconfig.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@ToString
public class Konfig {
    private String imie="imie";
    private String nazwisko="nazwisko";
}
