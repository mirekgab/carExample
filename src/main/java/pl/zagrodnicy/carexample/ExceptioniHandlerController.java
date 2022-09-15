package pl.zagrodnicy.carexample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptioniHandlerController {

    @ExceptionHandler(CarException.class)
    public ResponseEntity catchCarNotFoundException(CarException e) {
        return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity catchRuntimeException(RuntimeException e) {
        return new ResponseEntity(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
    }
}
