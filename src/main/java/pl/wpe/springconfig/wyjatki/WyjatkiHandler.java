package pl.wpe.springconfig.wyjatki;

import lombok.extern.java.Log;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@Log
public class WyjatkiHandler {
    @ExceptionHandler(ZaDokladnaLiczbaException.class)

    public ResponseEntity<?> resourceNotFoundException(ZaDokladnaLiczbaException ex, WebRequest request) {
        log.warning("Przechwytuje "+ex.getClass().getName()+" "+ex.getMessage());

//        ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));


        // TODO dlaczego nie zwraca 404?
        return new ResponseEntity<>("WWWW "+ex.getMessage(), HttpStatus.NOT_FOUND);

    }
}
