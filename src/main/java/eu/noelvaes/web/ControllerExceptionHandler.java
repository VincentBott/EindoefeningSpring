package eu.noelvaes.web;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;



//@RestControllerAdvice
public class ControllerExceptionHandler {

   @ExceptionHandler
   public ResponseEntity<String> handleException(Exception ex) {

      return new ResponseEntity<String>(ex.getMessage(),
         HttpStatus.INTERNAL_SERVER_ERROR);
   }
}
