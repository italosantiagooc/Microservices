package br.com.microservices.registrations.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerGlobal {

    @ExceptionHandler
    public ResponseEntity<ErrorBody> handlerException(BusinessAbstractException exception) {
        return new ResponseEntity<>(new ErrorBody(exception.getStatus().name(), exception.getStatus().value(), exception.getMessage()), exception.getStatus());
    }

    @ExceptionHandler
    public ResponseEntity<ErrorBody> handlerException(RuntimeException exception) {
        return new ResponseEntity<>(new ErrorBody(HttpStatus.BAD_REQUEST.name(), HttpStatus.BAD_REQUEST.value(), ""), HttpStatus.BAD_REQUEST);
    }
}

class ErrorBody {
    private String error;
    private int status;
    private String message;

    public ErrorBody(String error, int status, String message) {
        this.error = error;
        this.status = status;
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
