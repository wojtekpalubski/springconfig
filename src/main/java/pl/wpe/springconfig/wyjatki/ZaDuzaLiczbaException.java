package pl.wpe.springconfig.wyjatki;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ZaDuzaLiczbaException extends RuntimeException {
    public ZaDuzaLiczbaException(String message) {
        super(message);
    }
}
