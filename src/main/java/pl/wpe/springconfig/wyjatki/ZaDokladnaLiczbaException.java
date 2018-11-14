package pl.wpe.springconfig.wyjatki;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class ZaDokladnaLiczbaException extends RuntimeException {
    public ZaDokladnaLiczbaException(String message) {
        super(message);
        this.printStackTrace();
    }
}
