package pl.wpe.springconfig.wyjatki;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class ZaMalaLiczbaException extends RuntimeException {
    public ZaMalaLiczbaException(String message) {
        super(message);
    }
}
