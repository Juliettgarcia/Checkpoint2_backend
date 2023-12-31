package br.com.juliettgarcia.projetoClinicaCP2.domain.entity.api.handler;

import br.com.juliettgarcia.projetoClinicaCP2.domain.exception.BadRequestCnpjException;
import br.com.juliettgarcia.projetoClinicaCP2.domain.exception.BadRequestDataConsultaException;
import br.com.juliettgarcia.projetoClinicaCP2.domain.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionApiHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Problema> notFoundExceptionHandler(NotFoundException e) {
        String message = "ID não encontrado no Sistema!";
        Problema problem = new Problema(HttpStatus.NOT_FOUND.value(), message, e.getMessage());
        return ResponseEntity.ok().body(problem);
    }

    @ExceptionHandler(BadRequestCnpjException.class)
    public ResponseEntity<Problema> badRequestExceptionHandler(BadRequestCnpjException e) {
        String message = "Clínica com CNPJ já cadastrado!";
        Problema problem = new Problema(HttpStatus.BAD_REQUEST.value(), message, e.getMessage());
        return ResponseEntity.ok().body(problem);
    }

    @ExceptionHandler(BadRequestDataConsultaException.class)
    public ResponseEntity<Problema> badRequestCnpjException(BadRequestDataConsultaException e) {
        String message = "Data anterior ao dia atual!";
        Problema problem = new Problema(HttpStatus.BAD_REQUEST.value(), message, e.getMessage());
        return ResponseEntity.ok().body(problem);
    }

}
