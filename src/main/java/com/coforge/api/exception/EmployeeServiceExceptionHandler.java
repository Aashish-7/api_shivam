package com.coforge.api.exception;

import com.coforge.api.exception.dto.Error;
import com.coforge.api.exception.dto.ResponseStatusDto;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@RestController
@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class EmployeeServiceExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(com.coforge.api.exception.BadRequest400Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseStatusDto exceptionBadRequest(BadRequest400Exception exception) {
        return new ResponseStatusDto(exception);
    }


    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        Object[] problem = ex.getDetailMessageArguments();
        assert problem != null;
        String message= problem[1].toString();
        System.out.println(message);
        String errorMessage = message.substring(message.indexOf("'") +1,message.lastIndexOf("'"));
        System.out.println(errorMessage);
        String[] error= errorMessage.split(",");
        System.out.println(error[0]);
        System.out.println(error[1]);
        ResponseStatusDto responseStatusDto = new ResponseStatusDto("FAILURE", "null", "N", "NA", new Error(Integer.parseInt(error[0]), error[1]));
        return new ResponseEntity<>(responseStatusDto,status);
    }


}
